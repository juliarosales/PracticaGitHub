package practicagithub;

import java.io.*;
import java.util.*;

public class Disco extends Obra
{
    private String discografia;
    private int nCanciones;
    private List<Artista> interpretes;
    private String resp="S";
    
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
         System.out.println("\t Título: "+this.getTitulo());
         System.out.println("\t Autor: "+this.getAutor());
         System.out.println("\t A#o Edición: "+this.getAnoEdicion());
         System.out.println("\t Discografia: "+this.getDiscografia());
         System.out.println("\t Número de Canciones: "+this.getNCanciones());         

    }
    
    public void cargardatos() throws IOException
    {
       
       InputStreamReader entrada = new InputStreamReader(System.in);
       BufferedReader buf = new BufferedReader(entrada);
       this.interpretes = new ArrayList<>();
       
       while(this.resp.equals("S") || this.resp.equals("s")){
       
            System.out.print("Ingrese el Título: ");
            this.setTitulo(buf.readLine());
            System.out.print("Ingrese el Autor: ");
            //nom = buf.readLine();
            System.out.print("Ingrese el A#o de Edicion: ");
            try {
                this.setAnoEdicion( Integer.parseInt(buf.readLine()));
            } catch (NumberFormatException ex) {
            System.out.println("  Error el A#o de Edicion, intentelo de nuevo.");
            }
            System.out.print("Ingrese el Discografia: ");
            this.setDiscografia(buf.readLine());
            System.out.print("Ingrese el Numero de Canciones: ");
            try {
                this.setNCanciones( Integer.parseInt(buf.readLine()));
            } catch (NumberFormatException ex) {
            System.out.println("  Error el Numero de Canciones, intentelo de nuevo.");
            }

            System.out.println("Desea agregar otro Disco? S/N");
            resp = buf.readLine();
       } 
       
       
    }
    
}
