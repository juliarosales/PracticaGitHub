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
                    break;
                case 2:  //obra
                    break;
                case 3:  // peliculas
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
            };
        }  
    }
    public static void menuReportes() throws IOException
    {
        int opcrepo = 0;
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
    }
    public static void informacionCreditos() throws IOException
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
}
