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
public class Secciones {

    /**
     * @param args the command line arguments
     */
    String NombreE;
    String Apellido;
    String edad;

    public Secciones(String NombreE, String Apellido, String edad) {
        this.NombreE = NombreE;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public Secciones() {
    }
    
    

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return NombreE + "     " + Apellido ;
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
