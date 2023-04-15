package com.example;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Path rutaEquipos = Paths.get("equiposqatar2022.csv");
        Path rutaPartidos = Paths.get("partidosqatar2022.csv");
        Path rutaApuestas = Paths.get("pronosticoqatar2022.csv");
        Path archivoApostadores = Paths.get("datosapostadoresqatar2022.csv");

        Mundial2022 campeonato = new Mundial2022();
        Prode prode = new Prode();
        
        CargaArchivos.cargaArchivoEquipos(rutaEquipos, campeonato.getEquiposHashMap());
        CargaArchivos.cargarArchivoApuestas(rutaApuestas, prode.getTotalApuestas());
        CargaArchivos.cargarArchivoPartidos(rutaPartidos, campeonato);
        CargaArchivos.cargarArchivoApostadores(archivoApostadores, prode.getApostadores());

        prode.cargarTicketsApuestas();
        prode.mostrarAciertos(campeonato);
        /*
         * Metodos para comprobar la carga correcta de los archivos
         */
        //campeonato.mostrarCargaEquipos();
        //campeonato.mostrarCargaMundial();
        //prode.mostrarCargaApuestas();
        //prode.mostrarCargaApostadores();
    }
}
