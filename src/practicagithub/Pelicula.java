/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicagithub;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johan
 */
public class Pelicula extends Obra {
    private String productora;
    private List<Artista> interpretes;

    public Pelicula(){
        this.interpretes=new ArrayList<Artista>();
    }
    public List<Artista> getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(List<Artista> interpretes) {
        this.interpretes = interpretes;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public void agregarInterprete(Artista interprete){
        if(this.interpretes==null)
            this.interpretes=new ArrayList<Artista>();
        this.interpretes.add(interprete);
    }

    public List<Pelicula> buscarPeliculaPorTitulo( String titulo, List<Pelicula> peliculas){
        List<Pelicula> encontrados=new ArrayList<Pelicula>();

        if(peliculas!=null){
            for (Pelicula pelicula : encontrados) {
                if(pelicula.getTitulo().compareToIgnoreCase(titulo)==0 ){
                    encontrados.add(pelicula);
                }
            }
        }
        return encontrados;
    }

    public void mostrarDatosPelicula(){
        super.mostrarDatos();
        System.out.println("\t Productora : "+this.productora);
        System.out.println("\t Interpretes : ");
        if(interpretes!=null){
            for (Artista artista : interpretes) {
               artista.mostrarDatosArtista();
            }
        }

    }

    public void mostrarPeliculas(List<Pelicula> peliculas){
        if(peliculas!=null && peliculas.size()>0){
            for (Pelicula pelicula : peliculas) {
                pelicula.mostrarDatosPelicula();
            }
        }else{
            System.out.println("No  hay peliculas");
        }
    }

}
