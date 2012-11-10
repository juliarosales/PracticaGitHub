package practicagithub;

import java.util.*;

public class Disco extends Obra
{
    private String discografia;
    private int nCanciones;
    private List<Artista> interpretes;
    private String resp="S";
    
    public Disco()
    {
    }
    
    public Disco(String titulo, Artista autor, int anoEdicion, String discografia, int nCanciones)
    {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnoEdicion(anoEdicion);
        this.discografia = discografia;
        this.nCanciones = nCanciones;
    }
    
    //Funcion para obtener la discografia
    public String getDiscografia()
    {
        return this.discografia;
    }
    
    //Funcion para almacenar la discografia
    public void setDiscografia(String discografia)
    {
        this.discografia = discografia;
    }
    
    //Funcion para obtener el numero de canciones
    public int getNCanciones()
    {
        return this.nCanciones;
    }
    
    //Funcion para almacenar el numero de canciones
    public void setNCanciones(int nCanciones)
    {
        this.nCanciones = nCanciones;
    }
    
    //Funcion para imprimir
    public void imprimir()
    {
         super.mostrarDatos();
         System.out.println("\t Discografia: "+this.getDiscografia());
         System.out.println("\t Número de Canciones: "+this.getNCanciones());         

    }
  
    // Busqueda de discos
    public List<Disco> buscardisco (List<Disco> discos, String busqueda)
    {
        List<Disco> resultados = new ArrayList<Disco>();
        for (Disco disco : discos) 
        {
            if (disco.getTitulo().compareToIgnoreCase(busqueda) == 0 )
            {
                resultados.add(disco);
            }
        }
        
        for (Disco disco : discos) 
        {
            if (disco.getAutor().getNombre().compareToIgnoreCase(busqueda) == 0 )
            {
                resultados.add(disco);
            }
        }
      
        return resultados;
    }
    
}
