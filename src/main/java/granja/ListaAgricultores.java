/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

import java.util.ArrayList;

/**
 *
 * @author imad
 */
public class ListaAgricultores {

    private ArrayList<Agricultores> agricultores;

    public ListaAgricultores() {
        agricultores = new ArrayList<>();
    }

    public void mostrarAgricultores() {
        agricultores.forEach(System.out::println);
    }

    public void anadirNuevoAgricultor(Agricultores agricultor) {
        agricultores.add(agricultor);
    }
    
    public ArrayList<Agricultores> getAgricultores() {
        return agricultores;
    }

    public void setListaAgricultores(ArrayList<Agricultores> agricultores) {
        this.agricultores = agricultores;
    }

    @Override
    public String toString() {
        return "agricultores{" + "agricultores=" + agricultores + '}';
    }
    
    
}
