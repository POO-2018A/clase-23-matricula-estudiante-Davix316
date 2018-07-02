/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secciones;

/**
 *
 * @author ESFOT
 */
public class Materia {
    String Nombre;

    public Materia(String Nombre) {
        this.Nombre = Nombre;
    }

    public Materia() {
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
     @Override
    public String toString() {
        return Nombre;
    }
    
}
