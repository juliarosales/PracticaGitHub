/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.io.*;
import java.util.*;

/**
 *
 * @author Julia Rosales
 */
public class Artista {
    
    private String nomArt;
    
    private int anoNacimiento;    
    
    private String resp="S";
    
    private String nom;
    
    private int anoN;
    
    //Contructor sin parametros de la clase Artista
    public Artista(){}
    
    //Constructor con parametros de la clase Artista
    public Artista(String nom, int anoN){
    
        this.nomArt = nom;
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
        return this.nomArt;
    }
    
    //Funcion para guardar el nombre del artista
    public void setNombre(String nom){
        this.nomArt = nom;
    }
    
    //Funcion para mostrar el menu de artista
    public void menuArtista(List<Artista> interpretes) throws IOException{
       
       InputStreamReader entrada = new InputStreamReader(System.in);
       BufferedReader buf = new BufferedReader(entrada);
       
       if(interpretes == null){
           interpretes = new ArrayList<Artista>();
       }
              
       while(this.resp.equals("S") || this.resp.equals("s")){
       
            System.out.print("Ingrese el nombre: ");
            nom = buf.readLine();
            System.out.print("Ingrese el año de nacimiento: ");
            try {
                anoN = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
            System.out.println("  Error el año de nacimiento, intentelo de nuevo.");
            }
            Artista artista = new Artista(nom,anoN);
            interpretes.add(artista);
            System.out.println("Desea agregar otro artista? S/N");
            resp = buf.readLine();
       } 
       
       
    }
    
    public Artista buscarArtista(String nom, List<Artista> interpretes){
    
       for(Artista art:interpretes){
           if(art.nomArt.equals(nom)){
               return art;               
           }
       }
         return null;
    }

    public void mostrarDatosArtista(){
        System.out.println("\t Nombre Artista: "+this.nomArt);
        System.out.println("\t A#o Nacimiento: "+this.anoNacimiento);
    }
    
    /**
     *
     * @param interpretes
     */
    public void listarArtistas(List<Artista> interpretes){
    
        for(Artista art:interpretes){
            System.out.println("\t Nombre Artista: "+this.nomArt+" A#o Nacimiento: "+this.anoNacimiento);
        }
    }
}
