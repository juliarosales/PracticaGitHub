package practicagithub;

import java.io.*;
import java.util.*;

public class Disco extends Obra
{
    private String discografia;
    private int nCanciones;
    private List<Artista> interpretes;
    private String resp="S";
    
    public Disco()    {}
    
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
            if (disco.getTitulo().compareToIgnoreCase(busqueda) == 0 || disco.getAutor().getNombre().compareToIgnoreCase(busqueda) == 0 )
            {
                resultados.add(disco);
            }
        }        
        
        return resultados;
    }
    
    // Búsqueda de discografia
    public List<Disco> buscarDiscoPorDiscografia( String titulo, List<Disco> discos){
        List<Disco> encontrados=new ArrayList<Disco>();

        if(discos!=null){
            for (Disco disco : discos) {
                if(disco.getDiscografia().compareToIgnoreCase(titulo)==0 ){
                    encontrados.add(disco);
                }
            }
        }
        return encontrados;
    }
    // busqueda por canciones
        public List<Disco> buscarDiscoPorCanciones( String cancion, List<Disco> discos){
        List<Disco> encontrados=new ArrayList<Disco>();

        if(discos!=null){
            for (Disco disco : discos) {
                if(disco.getDiscografia().compareToIgnoreCase(cancion)==0 ){
                    encontrados.add(disco);
                }
            }
        }
        return encontrados;
    }
        
  //Carga datos
    public void cargarDatos(List<Artista> artistas){
       if(artistas==null || artistas.size()==0)
       {
           System.out.println("\n No puede crear Discos hasta tener al menos un artista");
           return;
       }
       InputStreamReader entrada = new InputStreamReader(System.in);
       BufferedReader buf = new BufferedReader(entrada);
       try{
       System.out.print("\t Ingrese Discografía: ");
       this.setTitulo(buf.readLine());
       boolean valido=false;
       int cancion=0;
       while(!valido){
         System.out.print("\t Ingrese Canción:");
         try{
          cancion=Integer.parseInt(buf.readLine().trim());
          this.setAnoEdicion(cancion);
          valido=true;
         }catch(Exception e){
             System.out.println("\t Dato inválido");
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
          cancion=Integer.parseInt(buf.readLine().trim());
          if(cancion>0 && cancion<=limit){
              this.setAutor(artistas.get(cancion-1));
              valido=true;
          }else{
              System.out.println("\n Valor inválido ");
          }
          
         }catch(Exception e){
             System.out.println("\t Dato inválido");
         }
           
       }
       
           System.out.println("\n Ingrese Discografía ");
           this.setDiscografia(buf.readLine());
           
           System.out.println("\n Ingrese número de Canciones");
           valido=false;
           while(!valido){    
                     
                try{
                    cancion=Integer.parseInt(buf.readLine().trim());
                valido=true;  
                this.setNCanciones(cancion);
                }catch(Exception e){
             System.out.println("\t Dato inválido");
             valido=false;
         }
           
       }
       
       }catch(Exception e){
           
       }
    }
    
    public void imprimirDisco(List<Disco> discos)
    {
        if(discos.size() >0)
        {
            for (Disco disco : discos) 
            {
                disco.imprimir();
            }
        }
    }
    
}
