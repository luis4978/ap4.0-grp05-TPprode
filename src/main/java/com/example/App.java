package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Path;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        //C:\Users\Luis\Desktop
        /*Codigo a completar  */
        Path archivo = Paths.get("C://Users//Luis//Desktop");
        Scanner lector = new Scanner(archivo);
        String titulo = lector.nextLine();
        lector.useDelimiter("[;\\n]");
        Ronda ronda = new Ronda();
        while (lector.nextInt()) {
            int clave = lector.nextInt();
            String equipo1 = lector.next();
            int golesEq1 = lector.nextInt();
            int golesEq2 = lector.nextInt();
            String equipo2 = lector.next();
            

            ronda.getPartidosHashMap().put(null, null)
        }
    }
}
