/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio5;

/**
 *
 * @author KATHERINE
 */
public class arbol {
    private String heroe;

    public arbol(String heroe) {
        this.heroe = heroe;
    }

    public arbol() {
    }

    public String getHeroe() {
        return heroe;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    @Override
    public String toString() {
        return  "heroe=" + heroe ;
    }

    
    
    
}
