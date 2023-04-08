package com.example;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 * Hello world!
 *
 */
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
        /*
         * Metodos estaticos que vuelcan el archivo en las colecciones que 
         * reciben como segundo argumento.
         */
        CargaArchivos.cargaArchivoEquipos(rutaEquipos, campeonato.getEquiposHashMap());
        CargaArchivos.cargaArchivoPartidos(rutaPartidos, campeonato.getTotalPartidos());
        CargaArchivos.cargarArchivoApuestas(rutaApuestas, prode.getTotalApuestas());
        CargaArchivos.cargarArchivoApostadores(archivoApostadores, prode.getApostadores());
        /*
         * Metodo de clase que carga el mundial Qatar 2022
         */
        campeonato.cargarMundial();
        /*
         * Metodos para comprobar la carga correcta de los archivos
         */
        campeonato.mostrarCargaEquipos();
        campeonato.mostrarCargaMundial();
        prode.mostrarCargaApuestas();
        prode.mostrarCargaApostadores();
    }
}
