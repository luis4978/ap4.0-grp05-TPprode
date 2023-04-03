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
        Path archivoPartidos = Paths.get("src//main//java//com//example//ronda1qatar2022.csv");
        Path archivoPronosticoRonda1 = Paths.get("src//main//java//com//example//pronosticoronda1qatar2022.csv");
        Ronda ronda1 = new Ronda();
        Apostador ap1 = new Apostador(25034567, "Jose Perez", 1001);
        /*
         * Lo ideal seria, de la lista de partidos que tenemos
         * hacer varios archivos de partidos y guardarlo como ronda1, ronda2,etc.
         * de momento cargamos los partidos de todas las rondas.
         * Repito "Seria lo ideal jeje"
         */
        /*
         * Se tuvo que añadir un ";" al final de cada linea de los archivos csv 
         * para una lectura correcta del archivo, ya que daba un error de lectura
         * del lector de Scanner.  Se debe consultar y corregir esto con el profesor
         */
        ronda1.cargaEquipos(archivoEquipos);
        ronda1.cargaPartidos(archivoPartidos);
        ap1.cargaApuestas(archivoPronosticoRonda1);
        /*
         * Bucles para testear la carga de archivos
         
        for (Equipo eq : ronda1.getEquiposHashMap().values()) {
            System.out.println(eq.toString());
        }
        for (Partido p : ronda1.getPartidosHashMap().values()) {
            System.out.println(p.toString());
        }
        for (Ticket tk : ap1.getTicketApuesta()) {
            System.out.println(tk.toString());
        }*/
        int puntos = 0;
        Partido partido;
        Equipo eq;
        for (Ticket tk : ap1.getTicketApuesta()) {
            partido = ronda1.partido(tk.getRonda());
            eq = ronda1.getEquiposHashMap().get(tk.getEquipo());
            if (tk.getPronostico()==partido.resultado(eq)) {
                System.out.println(partido.toString());
                puntos++;
            }
        }
        System.out.println("Puntos obtenidos de "+ap1.getNombreCompleto() + " " + puntos);

    }
}
