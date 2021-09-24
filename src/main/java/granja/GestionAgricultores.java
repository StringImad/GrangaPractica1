/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author imad
 */
public class GestionAgricultores {

    private static Scanner teclado = new Scanner(System.in);

    //private static ArrayList<Agricultores> listaAgricultores = new ArrayList<>();
    public static void main(String[] args) {

        boolean repetir = false;
        int eleccionUsuario;
        // String[] botones = {"Calcular manualmente", "Importar fichero", "salir"};
        do {
//            int ventana = JOptionPane.showOptionDialog(null, "Bienvenido al sistema, ¿Qué desea realizar?", " ",
//                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

            do {
                System.out.println("Bienvenido al sistema, ¿Qué desea realizar?");
                System.out.println("\"1.- Calcular manualmente\", \"2.- Importar fichero\", \"3.- salir\"");
                eleccionUsuario = teclado.nextInt();
            } while (eleccionUsuario > 3 || eleccionUsuario < 0);
            switch (eleccionUsuario) {

                case 1:
                    introduccionDatos();
                    break;
                case 2:
                    System.out.println("--------Calculando unidades totales recogidas----");
                    leerFichero();

                    break;
                case 3:
                    // al pulsar en case 2 se pone reptir en false por lo tanto sale del programa y
                    // del bucle
                    repetir = false;

                    break;

            }
            break;

        } while (repetir);

    }

    public static void introduccionDatos() {
        String melocotones = "";
        int numeroAgricultores = 0;
        int numeroLimpio = 0;
        double cantidadTotal = 0;
        ListaAgricultores lista1 = new ListaAgricultores();
        boolean entero = true;
        System.out.println("¿Cuantos agricultores hay?");

        numeroAgricultores = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numeroAgricultores; i++) {

            System.out.println("Introduce la cantidad de fruta que trae el agricultor " + (i + 1));
            melocotones = teclado.nextLine();

            lista1.anadirNuevoAgricultor(new Agricultores(Integer.parseInt(melocotones)));

        }

        for (int i = 0; i < lista1.getAgricultores().size(); i++) {
            cantidadTotal += lista1.getAgricultores().get(i).getUnidadesRecogidas();

        }
        if (cantidadTotal / numeroAgricultores == Math.floor(cantidadTotal / numeroAgricultores)) {
            System.out.println("Han traido una cantidad total de: " + cantidadTotal + " melecotones, a cada agricultor le tocan: " + (cantidadTotal / numeroAgricultores));

        } else {
            System.out.println(" La cantidad no puede corresponder a cada agricultor");

        }
    }

    public static void leerFichero() {
        LecturaFicheroCSV.leeFichero("cantidadFruta.csv");

    }
}
