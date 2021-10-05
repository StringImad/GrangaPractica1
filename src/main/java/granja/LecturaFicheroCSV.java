/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class LecturaFicheroCSV {

    public static ArrayList<Agricultores> leeFichero(String fichero) {
        String[] tokens;
        String linea;
        int suma;
        ArrayList<Agricultores> registros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fichero), "UTF-8"))) {

            //mientras el metodo readline no devuelva null es que existen datos por leer
            while ((linea = br.readLine()) != null) {

                tokens = linea.split(";"); //se guarda cada elemento de la linea en funcion del separador

                //Creamos un nuevo objeto temporal agricultor
                Agricultores tmp = new Agricultores();

                //Insertamos dentro del objeto lo que leemos del fichero
                //en este caso las unidades leidas, separadas por un :
                suma = Integer.parseInt(tokens[0]);
//                + Integer.parseInt(tokens[1]) +
//                        Integer.parseInt(tokens[2]) + Integer.parseInt(tokens[3]);
                tmp.setUnidadesRecogidas(suma);
                registros.add(tmp);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return registros;
    }

}
