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
public class Escuadron_villanos {
    private String nombre;
    private String localidad;
    private String lider;
    private String tipo_Escuadron;
    private String lema;
    private ArrayList<Villanos> villanos=new ArrayList();

    public Escuadron_villanos() {
    }

    public Escuadron_villanos(String nombre, String localidad, String lider, String tipo_Escuadron, String lema) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lider = lider;
        this.tipo_Escuadron = tipo_Escuadron;
        this.lema = lema;
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

    public ArrayList<Villanos> getVillanos() {
        return villanos;
    }

    public void setVillanos(ArrayList<Villanos> villanos) {
        this.villanos = villanos;
    }

    @Override
    public String toString() {
        return "Escuadron_villanos{" + "nombre=" + nombre + ", localidad=" + localidad;
    }
    
    
    
}
