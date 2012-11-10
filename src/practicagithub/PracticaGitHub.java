package practicagithub;

import java.io.*;
import java.util.*;

public class PracticaGitHub {

    public Artista artista;
    public ArrayList<Artista> artistas;
    public Libro libro;
    public ArrayList<Libro> libros;
    public Disco disco;
    public ArrayList<Disco> discos;
    public Pelicula pelicula;
    public ArrayList<Pelicula> peliculas;
    
    public PracticaGitHub()
    {
        artista = new Artista();
        artistas = new ArrayList<Artista>();
        libro = new Libro();
        libros = new ArrayList<Libro>();
        disco = new Disco();
        discos = new ArrayList<Disco>();
        pelicula = new Pelicula();
        peliculas = new ArrayList<Pelicula>();
    }
    
    public static void main(String[] args) throws IOException 
    {
        PracticaGitHub practicaAplicacion = new PracticaGitHub();
        practicaAplicacion.menu();
    }
    public void menu()  throws IOException
    {
        int opc = 0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        
        while (opc != 6)
        {
            System.out.println("\n   ** Menu ** ");
            System.out.println(" 1. Artista  ");
            System.out.println(" 2. Obra");
            System.out.println(" 3. Película");
            System.out.println(" 4. Reportes");
            System.out.println(" 5. Créditos");
            System.out.println(" 6. Salir");
            System.out.print(" Ingrese la opción: ");

            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            
            switch(opc)
            {
                case 1:  //artista
                    menuArtista();
                    break;
                case 2:  //obra
                    subMenuObra(opc);
                    break;
                case 3:  // peliculas
                    menuPelicula();
                    break;
                case 4: // Reportes
                    menuReportes();
                    break;
                case 5:
                    informacionCreditos();
                    break;                
                case 6:
                    System.out.println("\n  ** Hasta Luego **");
                    break;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            }
        }  
    }
    public void menuReportes() throws IOException
    {
        int opcrepo = 0;
        String tituloParaBuscar;
        List<Pelicula> peliculasEncontradas;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        while (opcrepo != 5)
        {                    
            System.out.println("\n   ** Reportes **");
            System.out.println("   1. Listado de Obras");
            System.out.println("   2. Listado de Películas");
            System.out.println("   3. Buscar obras por autor");
            System.out.println("   4. Buscar películas por autor");
            System.out.println("   5. Volver al menu");
            System.out.print("   Ingrese la opción: ");

            try {
                opcrepo = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opcrepo = 0;               
            }
            switch(opcrepo)
            {                        
                case 1:
                    System.out.println("     Listado de Obras  ");
                    System.out.println("        Listado de Libros  ");
                    libro.imprimirLibros(libros);
                    System.out.println("        Listado de Discos  ");
                    //DISCOS
                    break;
                case 2:
                    System.out.println("     Listado de Películas  ");
                    pelicula.mostrarPeliculas(peliculas);
                    break; 
                case 3:
                    System.out.println("     Buscar obras por autor ");
                    break;
                case 4:
                    System.out.println("     Buscar películas por autor ");
                    System.out.println("Introduzca un nombre para buscar por autor:");
                    tituloParaBuscar = buf.readLine();
                    peliculasEncontradas = pelicula.buscarPeliculaPorAutor(tituloParaBuscar, peliculas);
                    if(peliculasEncontradas == null || peliculasEncontradas.isEmpty())
                    {
                           System.out.println("No se encontro ningun libro con esa editorial.");
                    }
                    else
                    {
                        pelicula.mostrarPeliculas(peliculasEncontradas);
                    }                                       
                    break;
                case 5:
                    System.out.println("\n  Volver al menu");
                    break;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            };
        }
    }
    public void informacionCreditos() throws IOException
    {
        System.out.println("\nMaestría en Informática");
        System.out.println("  Delgado, Hedilbeth");
        System.out.println("  Mora, Juan J.");
        System.out.println("  Rincon , Jhoan");
        System.out.println("  Romero, Luzmar ");
        System.out.println("  Rosales, Julia ");                    
        System.out.println(" Sección 6");                    
        System.out.println("Presione Enter para regresar.");                    
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        buf.readLine();
    }
    public void subMenuObra(int menuPadre) throws IOException
    {
        int opc = 0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        while (opc != 3)
        {
            System.out.println("\n\t   ** Menu ** ");
            System.out.println(" \t"+menuPadre+".1. Libro  ");
            System.out.println(" \t"+menuPadre+".2. Disco");
            System.out.println("\t 3 Salir");
            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            switch(opc)
            {                        
                case 1:
                    menuLibro();
                    break;
                case 2:
                    menuDisco();
                    break;
                case 3:
                    return;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            };
            
        }    
    }
    public void menuArtista() throws IOException
    {
        int opc = 0;
        String nombreParaBuscar;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        
        while (opc != 4)
        {
            System.out.println("\n   ** Menu Artista ** ");
            System.out.println(" 1. Cargar Artista  ");
            System.out.println(" 2. Buscar Artista");
            System.out.println(" 3. Listar todos los Artistas");
            System.out.println(" 4. Salir");
            System.out.print(" Ingrese la opción: ");

            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            
            switch(opc)
            {
                case 1: 
                    artista.cargarDatosArtista(artistas);
                    break;
                case 2:
                    System.out.println("Introduzca un nomber para buscar el artista:");
                    nombreParaBuscar = buf.readLine();
                    Artista artistaEncontrado = artista.buscarArtista(nombreParaBuscar, artistas);
                    if(artistaEncontrado == null)
                    {
                           System.out.println("No se encontro ningun artista con ese nombre.");
                    }
                    else
                    {
                        artistaEncontrado.mostrarDatosArtista();
                    }
                    break;
                case 3:
                    artista.listarArtistas(artistas);
                    break;
                case 4: // Reportes
                    return;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            }
        }  
    
    }
    public void menuLibro() throws IOException
    {
        int opc = 0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        
        while (opc != 4)
        {
            System.out.println("\n   ** Menu Libro ** ");
            System.out.println(" 1. Cargar Libro  ");
            System.out.println(" 2. Buscar Libro");
            System.out.println(" 3. Listar todos los Libros");
            System.out.println(" 4. Salir");
            System.out.print(" Ingrese la opción: ");

            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            
            switch(opc)
            {
                case 1: 
                    libro.cargarDatos(artistas);
                    libros.add(libro);
                    libro = new Libro();
                    break;
                case 2:
                    subMenuBuscarLibro();
                    break;
                case 3:
                    libro.imprimirLibros(libros);
                    break;
                case 4: // Reportes
                    return;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            }
        }  
    
    }
    public void subMenuBuscarLibro() throws IOException
    {
        int opc = 0;
        String tituloParaBuscar;
        List<Libro> librosEncontrados;
        int paginasParaBuscar;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        while (opc != 3)
        {
            System.out.println("\n\t   ** Busquedas: ** ");
            System.out.println(" \t Por titulo  ");
            System.out.println(" \t Por Editorial");
            System.out.println(" \t Por Numero de Paginas");
            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            switch(opc)
            {                        
                case 1:
                    System.out.println("Introduzca un nomber para buscar por titulo:");
                    tituloParaBuscar = buf.readLine();
                    librosEncontrados = libro.buscarLibros(libros, tituloParaBuscar);
                    if(librosEncontrados == null || librosEncontrados.isEmpty())
                    {
                           System.out.println("No se encontro ningun libro con ese nombre.");
                    }
                    else
                    {
                        libro.imprimirLibros(librosEncontrados);
                    }
                    break;
                case 2:
                    System.out.println("Introduzca un nomber para buscar por editorial:");
                    tituloParaBuscar = buf.readLine();
                    librosEncontrados = libro.buscarLibrosPorEditorial(libros, tituloParaBuscar);
                    if(librosEncontrados == null || librosEncontrados.isEmpty())
                    {
                           System.out.println("No se encontro ningun libro con esa editorial.");
                    }
                    else
                    {
                        libro.imprimirLibros(librosEncontrados);
                    }
                    break; 
                case 3:
                    System.out.println("Introduzca un numero de paginas para buscar:");
                    try {
                        paginasParaBuscar = Integer.parseInt(buf.readLine());
                        librosEncontrados = libro.buscarLibrosPorNPaginas(libros, String.valueOf(paginasParaBuscar));
                        if(librosEncontrados == null || librosEncontrados.isEmpty())
                        {
                               System.out.println("No se encontro ningun libro con ese numeor de paginas.");
                        }
                        else
                        {
                            libro.imprimirLibros(librosEncontrados);
                        }
                    } catch (NumberFormatException ex) {
                        paginasParaBuscar = 0;     
                        System.out.println("Numero invalido");
                    }
                    break; 
                default: 
                    System.out.println("\n  ** Opción Errada **");
            };
            
        }    
    
    }
    public void menuDisco() throws IOException
    {
        int opc = 0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        
        while (opc != 4)
        {
            System.out.println("\n   ** Menu Disco ** ");
            System.out.println(" 1. Cargar Disco  ");
            System.out.println(" 2. Buscar Disco");
            System.out.println(" 3. Listar todos los Disco");
            System.out.println(" 4. Salir");
            System.out.print(" Ingrese la opción: ");

            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            
            switch(opc)
            {
                case 1: 
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: // Reportes
                    return;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            }
        }  
    
    }
    public void menuPelicula() throws IOException
    {
         int opc = 0;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        
        while (opc != 5)
        {
            System.out.println("\n   ** Menu Pelicula ** ");
            System.out.println(" 1. Cargar Pelicula  ");
            System.out.println(" 2. Buscar Pelicula");
            System.out.println(" 3. Listar todos las Peliculass");
            System.out.println(" 4. Listar todos las Productoras");
            System.out.println(" 5. Salir");
            System.out.print(" Ingrese la opción: ");

            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            
            switch(opc)
            {
                case 1:
                    pelicula.cargarDatos(artistas);
                    peliculas.add(pelicula);
                    pelicula = new Pelicula();
                    break;
                case 2:
                    subMenuBuscarPeliuclas();
                    break;
                case 3:
                    pelicula.mostrarPeliculas(peliculas);
                    break;
                case 4: // Reportes
                    pelicula.listarProductoras(peliculas);
                    break;
                case 5: // Reportes
                    return;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            }
        }  
   
    }
    public void subMenuBuscarPeliuclas() throws IOException
    {
        int opc = 0;
        String tituloParaBuscar;
        List<Pelicula> peliculasEncontradas;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(entrada);
        while (opc != 3)
        {
            System.out.println("\n\t   ** Busquedas: ** ");
            System.out.println(" \t Por Titulo  ");
            System.out.println(" \t Por Prodcutora");
            System.out.println(" \t Por Autor");
            try {
                opc = Integer.parseInt(buf.readLine());
            } catch (NumberFormatException ex) {
                opc = 0;               
            }
            switch(opc)
            {                        
                case 1:
                    System.out.println("Introduzca un nombre para buscar por titulo:");
                    tituloParaBuscar = buf.readLine();
                    peliculasEncontradas = pelicula.buscarPeliculaPorTitulo(tituloParaBuscar, peliculas);
                    if(peliculasEncontradas == null || peliculasEncontradas.isEmpty())
                    {
                           System.out.println("No se encontro ninguna pelicula con ese nombre.");
                    }
                    else
                    {
                        pelicula.mostrarPeliculas(peliculasEncontradas);
                    }
                    break;
                case 2:
                    System.out.println("Introduzca un nombre para buscar por productora:");
                    tituloParaBuscar = buf.readLine();
                    peliculasEncontradas = pelicula.buscarPeliculaPorProductora(tituloParaBuscar, peliculas);
                    if(peliculasEncontradas == null || peliculasEncontradas.isEmpty())
                    {
                           System.out.println("No se encontro ningun libro con esa editorial.");
                    }
                    else
                    {
                    pelicula.mostrarPeliculas(peliculasEncontradas);
                    }
                    break; 
                case 3:
                    System.out.println("Introduzca un nombre para buscar por autor:");
                    tituloParaBuscar = buf.readLine();
                    peliculasEncontradas = pelicula.buscarPeliculaPorAutor(tituloParaBuscar, peliculas);
                    if(peliculasEncontradas == null || peliculasEncontradas.isEmpty())
                    {
                           System.out.println("No se encontro ningun libro con esa editorial.");
                    }
                    else
                    {
                        pelicula.mostrarPeliculas(peliculasEncontradas);
                    }
                    break; 
                default: 
                    System.out.println("\n  ** Opción Errada **");
            }            
        }    
    
    }
    
}
