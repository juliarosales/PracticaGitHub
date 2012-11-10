/*
 * Libro.java
 *
 * Created on 6 de noviembre de 2012, 09:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package practicagithub;

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
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().compareToIgnoreCase(busqueda) == 0 || libro.getAutor().getNombre().compareToIgnoreCase(busqueda) == 0 )
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
    
    
}
