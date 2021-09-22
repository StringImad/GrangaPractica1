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

    private static ArrayList<Agricultores> listaAgricultores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String melocotones = "";
        int numeroAgricultores = 0;
        int numeroLimpio = 0;
        int cantidadTotal = 0;

        boolean entero = false;
        System.out.println("Bienvenido al programa");
        System.out.println("¿Cuantos agricultores hay?");

        numeroAgricultores = teclado.nextInt();
        teclado.nextLine();
        for (int i = 0; i < numeroAgricultores; i++) {

            System.out.println("Introduce la cantidad de fruta que trae el agricultor " + (i + 1));
            melocotones = teclado.nextLine();
            listaAgricultores.add(new Agricultores(melocotones));
        }

        for (Agricultores objeto : listaAgricultores) {
            //hago una convercion explicita
            cantidadTotal += Integer.parseInt(objeto.getUnidadesRecogidas());
        }
        double comprobador = cantidadTotal / 4;

        //obtenemos la parte entera del numero y se la restamos 
        //si es 0 pues entonces el número es entero 
        if (comprobador - Math.floor(comprobador) == 0) {
            entero = true;
            numeroLimpio = (int) comprobador;
        } else {
            entero = false;
        }

        if (entero == true) {
            System.out.println("Han traido una cantidad total de: " + cantidadTotal + " melecotones, a cada agricultor le tocan: " + numeroLimpio);
        } else {
            System.out.println(" La cantidad no puede corresponder a cada agricultor");
        }

    }
}
