/*
 * Libro.java
 *
 * Created on 6 de noviembre de 2012, 09:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package practicagithub;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hedilberth delgado
 */
public class Libro extends Obra {
    
    private String editorial;
    private int nPaginas;
    
    /** Crea una instancia de Libro */
    public Libro() {
    }
     /** Crea una instancia de Libro con parametros */
    public Libro(String titulo, Artista autor, int anoEdicion, String editorial, int nPaginas) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnoEdicion(anoEdicion);
        this.editorial = editorial;
        this.nPaginas = nPaginas;
    }

       
    public String getEditorial()
    {
        return this.editorial;
    }
    
    public void setEditorial(String editorial)
    {
        this.editorial =editorial;
    }
    
    public int getNPaginas()
    {
         return this.nPaginas;
    }
    
    public void setNPaginas(int nPaginas)
    {
        this.nPaginas = nPaginas;
    }
   
    public List<Libro> buscarLibros (List<Libro> libros, String busqueda)
    {
        List<Libro> resultados = new ArrayList<Libro>();
        for (Libro libro : libros) {
            if (libro.getTitulo().compareToIgnoreCase(busqueda) == 0 || libro.getAutor().getNombre().compareToIgnoreCase(busqueda) == 0 )
            {
                resultados.add(libro);
            }
        }
        
        return resultados;
    }
    
    public List<Libro> buscarLibrosPorEditorial (List<Libro> libros, String busqueda)
    {
        List<Libro> resultados = new ArrayList<Libro>();
        for (Libro libro : libros) {
            if (libro.getEditorial().compareToIgnoreCase(busqueda) == 0 )
            {
                resultados.add(libro);
            }
        }
        
        return resultados;
    }
    
    public List<Libro> buscarLibrosPorNPaginas (List<Libro> libros, String busqueda)
    {
        List<Libro> resultados = new ArrayList<Libro>();
        for (Libro libro : libros) {
            if (libro.getNPaginas() == Integer.parseInt(busqueda) )
            {
                resultados.add(libro);
            }
        }
        
        return resultados;
    }
    
    public void imprimir()
    {
        super.mostrarDatos();
        System.out.println("\t Editorial : "+this.getEditorial() );
        System.out.println("\t Número de Páginas : "+this.getNPaginas() );
    }
    

    public void cargarDatos(List<Artista> artistas){
       if(artistas==null || artistas.size()==0)
       {
           System.out.println("\n No puede crear libros hasta tener al menos un artista");
           return;
       }
       InputStreamReader entrada = new InputStreamReader(System.in);
       BufferedReader buf = new BufferedReader(entrada);
       try{
       System.out.println("\t Ingrese titulo : ");
       this.setTitulo(buf.readLine());
       boolean valido=false;
       int ano=0;
       while(!valido){
         System.out.println("\t Ingrese A#o de Edicion ");
         try{
          ano=Integer.parseInt(buf.readLine().trim());
          this.setAnoEdicion(ano);
          valido=true;
         }catch(Exception e){
             System.out.println("\t Dato invalido");
         }
       }
       
       valido=false;
       int limit=artistas.size();
       while(!valido){
           System.out.println("Elija Autor del libro");
           int iterador=1;
           for (Artista artista : artistas) {
               System.out.println(iterador+" - "+artista.getNombre());
               iterador++;
           }
           
          try{
          ano=Integer.parseInt(buf.readLine().trim());
          if(ano>0 && ano<=limit){
              this.setAutor(artistas.get(ano-1));
              valido=true;
          }else{
              System.out.println("\n valor invalido ");
          }
          
         }catch(Exception e){
             System.out.println("\t Dato invalido");
         }
           
       }
       
           System.out.println("\n Ingrese Editorial ");
           this.setEditorial(buf.readLine());
           
           System.out.println("\n Ingrese numero de paginas");
           valido=false;
           while(!valido){    
           
           
          try{
             ano=Integer.parseInt(buf.readLine().trim());
         valido=true;  
         this.setNPaginas(ano);
         }catch(Exception e){
             System.out.println("\t Dato invalido");
             valido=false;
         }
           
       }
       
       }catch(Exception e){
           
       }
    }

    public void imprimirLibros(List<Libro> libros)
    {
        if(libros.size() >0)
        {
            for (Libro libro : libros) 
            {
                libro.imprimir();
            }
            
        
        }
    }
    
    

}
