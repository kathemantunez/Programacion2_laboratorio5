/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_laboratorio5;

import java.util.ArrayList;

/**
 *
 * @author KATHERINE
 */
public class Escuadron_SuperHeroes {
    private String nombre;
    private String localidad;
    private String lider;
    private String lema;
    private String tipo_Escuadron;
    private ArrayList<SuperHeroes> villanos=new ArrayList();

    public Escuadron_SuperHeroes() {
    }

    public Escuadron_SuperHeroes(String nombre, String localidad, String lider, String lema, String tipo_Escuadron) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lider = lider;
        this.lema = lema;
        this.tipo_Escuadron = tipo_Escuadron;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo_Escuadron() {
        return tipo_Escuadron;
    }

    public void setTipo_Escuadron(String tipo_Escuadron) {
        this.tipo_Escuadron = tipo_Escuadron;
    }

    public ArrayList<SuperHeroes> getVillanos() {
        return villanos;
    }

    public void setVillanos(ArrayList<SuperHeroes> villanos) {
        this.villanos = villanos;
    }

    @Override
    public String toString() {
        return "Escuadron_SuperHeroes{" + "nombre=" + nombre + ", localidad=" + localidad ;
    }
    
    
}
