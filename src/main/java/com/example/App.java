package com.example;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;


public class App 
{
    /**
     * @param args
     * @throws IOException
     * @throws SQLException
     */
    public static void main( String[] args ) throws IOException, SQLException
    {

        /* Pendiente de la reunion 15/04/2023
        Se resolvieron los items.
        Se adjunta Script TP Prode.sql para
        creacion de BD, tablas y carga de datos
        tal cual se escribio en codigo.
         */
        Mundial2022 campeonato = new Mundial2022();
        Prode prode = new Prode();

        ConexioBD.cargarApostadores(prode.getApostadores());
        ConexioBD.cargarEquipos(campeonato.getEquiposHashMap());
        ConexioBD.cargarPartidos(campeonato);
        ConexioBD.cargarPronosticos(prode.getApostadores());
        
        //Muestra los aciertos de cada apostador por ronda
        prode.mostrarAciertos(campeonato);

        ArrayList<Apostador> ordenGanador = new ArrayList<>();
        for (Apostador ap : prode.getApostadores().values()) {
            ordenGanador.add(ap); 
        }
        Collections.sort(ordenGanador);
        for (Apostador apostador : ordenGanador) {
            System.out.println(apostador.getNombreCompleto()
                            +" = "+ apostador.getPuntosTotales());
        }
    }
}
