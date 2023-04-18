package com.example;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class ConexioBD {
    static final String DB_URL = "jdbc:mysql://localhost/Prode";
    static final String USER = "root";
    static final String PASS = "Charrua2890";
    
    /*
     * Establecer la conexion.
     * El primer parametro es la cadena de conexion.
     */
    public static void cargarApostadores
    (HashMap<Integer, Apostador> apostadores) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

        /*
         * Sin no se clavo, se pudo conectar bien.
         * crear un objeto Statement para enviar sentencias sql
         */
        Statement st = conn.createStatement();

        /*
         * Para ejecutar un SELECT se usa executeQery
         */
        ResultSet rs = st.executeQuery("select * from apostadores");
        /*
         * Para leer las filas de la BD un ciclo while
         */
        while (rs.next()) {
            /*
             * Una vuelta por cada fila.
             */
            int id = rs.getInt("idApostador");
            String nombreCompleto = rs.getString("NombreCompleto");
            Apostador ap = new Apostador(id, nombreCompleto);
            apostadores.put(ap.getIdApostador(), ap);
            
        }
        System.out.println("Carga Apostadores exitosa.");
        conn.close();
    }
    public static void cargarEquipos
    (HashMap<String, Equipo> equiposHashMap) throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from equiposqatar2022");
        while (rs.next()) {
            String nombreEquipo = rs.getString("Equipo");
            int temporada = rs.getInt("Partidos");
            Equipo eq = new Equipo(nombreEquipo, temporada);
            equiposHashMap.put(nombreEquipo, eq);
        }
        System.out.println("Carga Equipos exitosa.");
        conn.close();
    }
    public static void cargarPartidos
    (Mundial2022 campeonato) throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from partidosqatar2022");
        int contadorRonda = 1;
        Ronda ronda = new Ronda(contadorRonda);
        while (rs.next()) {
            int partidoKEY = rs.getInt("idPartido");
            Equipo eq1 = campeonato.buscarEquipo(rs.getString("Equipo1"));
            int golesEq1 = rs.getInt("GolesEq1");
            int golesEq2 = rs.getInt("GolesEq2");
            Equipo eq2 = campeonato.buscarEquipo(rs.getString("Equipo2"));
            Partido p = new Partido(partidoKEY, eq1, golesEq1, golesEq2, eq2);
            if(!(partidoKEY/100 == contadorRonda)){
                /*
                 * Si es una misma ronda agrega el obj a HashMap
                 */
                campeonato.getPartidos().put(contadorRonda, ronda);
                contadorRonda++;
                ronda = new Ronda(contadorRonda);
            }
            ronda.getUnaRondaHashMap().put(p.getPartidoKEY(), p);
            if (contadorRonda == campeonato.getTOTAL_RONDAS()) {
                campeonato.getPartidos().put(contadorRonda, ronda);
            }  
        }
        System.out.println("Carga Partidos exitosa.");
        conn.close();
    }

    public static void cargarPronosticos
    (HashMap<Integer, Apostador> aps) throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from pronosticoqatar2022");
        int eq = 0;
        while (rs.next()) {
            int idApostador = rs.getInt("idApostador");
            int partidoKey = rs.getInt("idPartido");
            String eq1 = rs.getString("Equipo1");
            int pronostico = rs.getInt("Pronostico");
            String eq2 = rs.getString("Equipo2");
            ResultadoEnum pronosticoResultado;
            switch (pronostico) {
                case 1:
                    eq = 1;
                    pronosticoResultado = ResultadoEnum.GANADOR;
                    break;
                case 3:
                    eq = 3;
                    pronosticoResultado = ResultadoEnum.PERDEDOR;
                    break;
                default:
                    pronosticoResultado = ResultadoEnum.EMPATE;
            }
            Apostador apostador = aps.get(idApostador);
            Ticket tk = new Ticket(partidoKey, eq, pronosticoResultado);
            apostador.getApuestasTot().put(tk.getPartidoKey(), tk);
        }
        System.out.println("Carga Pronosticos exitosa.");
        conn.close();
    }
}
