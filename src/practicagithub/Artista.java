/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Julia Rosales
 */
public class Artista {
    
    private String nombre;
    
    private int anoNacimiento;
    
    //Contructor sin parametros de la clase Artista
    public Artista(){}
    
    //Constructor con parametros de la clase Artista
    public Artista(String nom, int anoN){
    
        this.nombre = nom;
        this.anoNacimiento = anoN;
                
    }
    
    //Funcion para obtener el ano de nacimiento del artista
    public int getAnoNacimiento(){
        return this.anoNacimiento;
    }
    
    //Funcion para almacenar el ano de nacimiento del artista
    public void setAnoNacimiento(int anoN){
        this.anoNacimiento = anoN;
    }
    
    //Funcion para obtener el nombre del artista
    public String getNombre(){
        return this.nombre;
    }
    
    //Funcion para guardar el nombre del artista
    public void setNombre(String nom){
        this.nombre = nom;
    }
}
