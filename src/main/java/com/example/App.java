package com.example;

import java.io.File;
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
        Path archivoEquipos = Paths.get("src//main//java//com//example//equiposqatar2022.csv");
        Path archivoPartidos = Paths.get("src//main//java//com//example//partidosqatar2022.csv");
        Ronda ronda1 = new Ronda();
        /*
         * Lo ideal seria, de la lista de partidos que tenemos
         * hacer varios archivos de partidos y guardarlo como ronda1, ronda2,etc.
         * de momento cargamos los partidos de todas las rondas.
         * Repito "Seria lo ideal jeje"
         */
        ronda1.cargaEquipos(archivoEquipos);
        ronda1.cargaPartidos(archivoPartidos);
        /*for (Equipo eq : ronda1.getEquiposHashMap().values()) {
            System.out.println(eq.toString());
        }*/
    }
}
