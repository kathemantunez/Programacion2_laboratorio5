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
public class SuperHeroes {
    private String nombre;
    private String poder;
    private String   debilidad;
    private Escuadron_SuperHeroes escuadron;
    private int fuerza;
    private int agilidad_fisica;
    private int agilidad_mental;

    public SuperHeroes() {
    }

    public SuperHeroes(String nombre, String poder, String debilidad, Escuadron_SuperHeroes escuadron, int fuerza, int agilidad_fisica, int agilidad_mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidad_fisica = agilidad_fisica;
        this.agilidad_mental = agilidad_mental;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad_fisica() {
        return agilidad_fisica;
    }

    public void setAgilidad_fisica(int agilidad_fisica) {
        this.agilidad_fisica = agilidad_fisica;
    }

    public int getAgilidad_mental() {
        return agilidad_mental;
    }

    public void setAgilidad_mental(int agilidad_mental) {
        this.agilidad_mental = agilidad_mental;
    }

    @Override
    public String toString() {
        return "SuperHeroes{" + "nombre=" + nombre + ", poder=" + poder ;
    }
    
    
}
