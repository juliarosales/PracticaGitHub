package practicagithub;

import java.io.*;

public class PracticaGitHub {

  
    public static void main(String[] args) throws IOException 
    {
        menu();
    }
    public static void menu()  throws IOException
    {
        int opc = 0;
        int aux;
        int anonac = 0;
        int cantartista = 0;
        String nombre = "";
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
                    System.out.print("Ingrese la cantidad de Artistas: ");                    
                    try {
                          cantartista = Integer.parseInt(buf.readLine());
                    } catch (NumberFormatException ex) {
                         System.out.println("  El valor debe ser numérico, intentelo de nuevo.");
                         aux = 0;
                    }

                    Artista[] artista = new Artista[cantartista];

                    for (int i=0; i<artista.length; i++)
                    {
                        aux = 0;
                        System.out.print("Ingrese el nombre: ");
                        nombre = buf.readLine();
                        
                        while (aux == 0)
                        {
                            System.out.print("Ingrese el año de nacimiento: ");
                            aux =1;
                            try {
                                anonac = Integer.parseInt(buf.readLine());
                            } catch (NumberFormatException ex) {
                                System.out.println("  Error el año de nacimiento, intentelo de nuevo.");
                                aux = 0;
                            }
                        }
                        artista[i] = new Artista(nombre, anonac);
                        artista[i].setNombre(nombre);
                        artista[i].setAnoNacimiento(anonac);
                    }
                    break;
                case 2:  //obra
                    int opcobra = 0;
                    while (opcobra != 3)
                    {        
                        System.out.println("\n   ** Obra **");
                        System.out.println("   1. Libro");
                        System.out.println("   2. Disco");
                        System.out.println("   3. Volver al menu");
                        System.out.print("   Ingrese la opción: ");

                        try {
                            opcobra = Integer.parseInt(buf.readLine());
                        } catch (NumberFormatException ex) {
                            opcobra = 0;               
                        }
                        switch(opcobra)
                        {                        
                            case 1:                      // libro
                                int opclibro = 0;
                                while (opclibro != 4)
                                {
                                    System.out.println("\n    ** Libro **");
                                    System.out.println("     1. Crear Libro  ");
                                    System.out.println("     2. Buscar ");
                                    System.out.println("     3. Consultar ");
                                    System.out.println("     4. Salir");
                                    System.out.print("      Ingrese la opción: ");

                                    try {
                                        opclibro = Integer.parseInt(buf.readLine());
                                    } catch (NumberFormatException ex) {
                                        opclibro = 0;               
                                    }

                                    switch(opclibro)
                                    {
                                        case 1:
                                            System.out.println("     creacion de Libro  ");
                                            break;
                                        case 2:
                                            System.out.println("     busqueda de Libro  ");
                                            break; 
                                        case 3:
                                            System.out.println("     consulta de Libro  ");
                                            break;
                                        case 4:
                                            System.out.println("\n  Volver al menu");
                                            break;
                                        default: 
                                            System.out.println("\n  ** Opción Errada **");
                                    };               
                                }
                                break;
                            case 2:         // disco
                                int opcdisco = 0;
                                while (opcdisco != 4)
                                {
                                    System.out.println("\n    ** Disco **");
                                    System.out.println("     1. Crear Disco  ");
                                    System.out.println("     2. Buscar ");
                                    System.out.println("     3. Consultar ");
                                    System.out.println("     4. Salir");
                                    System.out.print("      Ingrese la opción: ");

                                    try {
                                        opcdisco = Integer.parseInt(buf.readLine());
                                    } catch (NumberFormatException ex) {
                                        opcdisco = 0;               
                                    }

                                    switch(opcdisco)
                                    {
                                        case 1:
                                            System.out.println("     creacion de Disco  ");
                                            break;
                                        case 2:
                                            System.out.println("     busqueda de Disco  ");
                                            break; 
                                        case 3:
                                            System.out.println("     consulta de Disco  ");
                                            break;
                                        case 4:
                                            System.out.println("\n  Volver al menu");
                                            break;
                                        default: 
                                            System.out.println("\n  ** Opción Errada **");
                                    };               
                                }
                                break;
                            case 3:
                                System.out.println("\n  Volver al menu");
                                break;
                            default: 
                                System.out.println("\n  ** Opción Errada **");
                        };
                    }   
                    break;
                case 3:  // peliculas
                    int opcpeli = 0;
                    while (opcpeli != 4)
                    {                    
                        System.out.println("\n   ** Película **");
                        System.out.println("   1. Crear");
                        System.out.println("   2. Buscar");
                        System.out.println("   3. Consultar");
                        System.out.println("   4. Volver al menu");
                        System.out.print("   Ingrese la opción: ");

                        try {
                            opcpeli = Integer.parseInt(buf.readLine());
                        } catch (NumberFormatException ex) {
                            opcpeli = 0;               
                        }
                        switch(opcpeli)
                        {                        
                            case 1:
                                System.out.println("     creacion de Disco  ");
                                break;
                            case 2:
                                System.out.println("     busqueda de Disco  ");
                                break; 
                            case 3:
                                System.out.println("     consulta de Disco  ");
                                break;
                            case 4:
                                System.out.println("\n  Volver al menu");
                                break;
                            default: 
                                System.out.println("\n  ** Opción Errada **");
                        };
                    }                    
                    break;
                case 4: // Reportes
                    int opcrepo = 0;
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
                                break;
                            case 2:
                                System.out.println("     Listado de Películas  ");
                                break; 
                            case 3:
                                System.out.println("     Buscar obras por autor ");
                                break;
                            case 4:
                                System.out.println("     Buscar películas por autor ");
                                break;
                            case 5:
                                System.out.println("\n  Volver al menu");
                                break;
                            default: 
                                System.out.println("\n  ** Opción Errada **");
                        };
                    }
                    break;
                case 5:
                    System.out.println("\nMaestría en Informática");
                    System.out.println("  Delgado, Hedilbeth");
                    System.out.println("  Mora, Juan J.");
                    System.out.println("  Rincon , Jhoan");
                    System.out.println("  Romero, Luzmar ");
                    System.out.println("  Rosales, Julia ");                    
                    System.out.println(" Sección 6");                    
                    break;                
                case 6:
                    System.out.println("\n  ** Hasta Luego **");
                    break;
                default: 
                    System.out.println("\n  ** Opción Errada **");
            };
        }  
    }
}
