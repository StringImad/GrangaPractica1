/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class GestionAgricultores {

    //private static ArrayList<Agricultores> listaAgricultores = new ArrayList<>();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String melocotones = "";
        int numeroAgricultores = 0;
        int numeroLimpio = 0;
        double cantidadTotal = 0;
        ListaAgricultores lista1 = new ListaAgricultores();
        boolean entero = true;
        System.out.println("Bienvenido al programa");
        System.out.println("¿Cuantos agricultores hay?");

        numeroAgricultores = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numeroAgricultores; i++) {

            System.out.println("Introduce la cantidad de fruta que trae el agricultor " + (i + 1));
            melocotones = teclado.nextLine();

            lista1.anadirNuevoAgricultor(new Agricultores(melocotones));

        }

        for (int i = 0; i < lista1.getAgricultores().size(); i++) {
            cantidadTotal += Integer.parseInt(lista1.getAgricultores().get(i).getUnidadesRecogidas());

        }
        if (cantidadTotal / numeroAgricultores == Math.floor(cantidadTotal / numeroAgricultores)) {
            System.out.println("Han traido una cantidad total de: " + cantidadTotal + " melecotones, a cada agricultor le tocan: " + (cantidadTotal / numeroAgricultores));

        } else {
            System.out.println(" La cantidad no puede corresponder a cada agricultor");

        }

    }
}
