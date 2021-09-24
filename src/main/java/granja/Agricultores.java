/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author imad
 */
public class Agricultores {

    private int unidadesRecogidas;

    public Agricultores() {
    }

    public Agricultores(int unidadesRecogidas) {
        this.unidadesRecogidas = unidadesRecogidas;
    }

    public int getUnidadesRecogidas() {
        return unidadesRecogidas;
    }

    public void setUnidadesRecogidas(int unidadesRecogidas) {
        this.unidadesRecogidas = unidadesRecogidas;
    }

    @Override
    public String toString() {
        return "Agricultores{" + "unidadesRecogidas=" + unidadesRecogidas + '}';
    }

}
