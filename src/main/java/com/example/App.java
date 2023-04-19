package com.example;

import java.io.IOException;
import java.sql.SQLException;


public class App 
{
    /**
     * @param args
     * @throws IOException
     * @throws SQLException
     */
    public static void main( String[] args ) throws IOException, SQLException
    {

        /* 
        Se adjunta Script TP Prode.sql para
        creacion de BD, tablas y carga de datos
         */
        Mundial2022 campeonato = new Mundial2022();
        Prode prode = new Prode();

        ConexioBD.cargarApostadores(prode.getApostadores());
        ConexioBD.cargarEquipos(campeonato.getEquiposHashMap());
        ConexioBD.cargarPartidos(campeonato);
        ConexioBD.cargarPronosticos(prode.getApostadores());
        
        //Muestra los aciertos de cada apostador por ronda
        prode.mostrarAciertos(campeonato);

       prode.apostadorGanador();
    }
}
