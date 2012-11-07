/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author Julia Rosales
 */
public class Obra{
    
    private String titulo;
    
    private Artista autor;
    
    private int anoEdicion;
    
    //Constructor sin parametros de la clase Obra
    public Obra(){}
    
    //Funcion para obtener el titulo de la obra
    public String getTitulo(){
        return this.titulo;
    }
    
    //Funcion para guardar el titulo de la obra
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    //Funcion para obtener el autor de la obra
    public Artista getAutor(){
        return this.autor;
    }
    
    //Funcion para guardar el autor de la obra
    public void setAutor(Artista autor){
        this.autor = autor;
    }
    
    //Funcion para obtener el ano de edicion de la obra
    public int getAnoEdicion(){
        return this.anoEdicion;
    }
    
    //Funcion para guardar el ano de edicion de la obra
    public void setAnoEdicion(int anoE){
        this.anoEdicion = anoE;
    }


    public void mostrarDatos(){
        System.out.println("\t Titulo : "+this.titulo);
        System.out.println("\t Autor : "+this.autor.getNombre());
        System.out.println("\t A#o de edicion : "+this.anoEdicion);
    }
}
