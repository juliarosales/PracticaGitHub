/*
 * Libro.java
 *
 * Created on 6 de noviembre de 2012, 09:26 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package practicagithub;

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
    public void imprimir()
    {
    }
    
    
}
