package com.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

final class CargaArchivos {
    protected static void cargaArchivoEquipos
    (Path equipos, HashMap<String, Equipo> equiposHashMap) throws IOException{
        Scanner lector = new Scanner(equipos);
        boolean esEncabezado = true;
        String encabezado;
        /*
         * lector.useLocale(Locale.forLanguageTag("es-AR"));se configura el scanner
         * para un lenguaje. Se coloca antes del useDelimiter().
         */
        lector.useDelimiter("[;\\n\\r]");
        while (lector.hasNextLine()) {
            /*
             * La primera linea contiene el encabezado del archivo.
             */ 
            if (esEncabezado) {
                encabezado = lector.nextLine();
                esEncabezado = false;
            }
            /*
             * Se empieza a leer la segunda linea del archivo y se guardan
             * los datos en variables correspondientes al tipo de dato 
             */
            String nombreEquipo = lector.next();
            int temporada = lector.nextInt();
            String pais = lector.next();
            short partidosJugados = lector.nextShort();
            lector.nextLine();
            /*
             * Se crea un objeto equipo con las variables arriba declaradas
             * y se guarda en el HashMap <String, Equipo> atributo de clase.
             */
            Equipo eq = new Equipo(nombreEquipo, temporada, pais, partidosJugados);
            equiposHashMap.put(nombreEquipo, eq);
        }
        lector.close();
    }
    
    protected static void cargarArchivoPartidos
    (Path partidos, Mundial2022 campeonato) throws IOException{
        Scanner lector = new Scanner(partidos);
        boolean esEncabezado = true;
        String encabezado;
        lector.useDelimiter("[;\\n\\r]");
        int contadorRonda = 1;
        Ronda ronda = new Ronda(contadorRonda);
        while (lector.hasNext()) { 
            if (esEncabezado) {
                encabezado = lector.nextLine();
                esEncabezado = false;
            }
            int partidoKEY = lector.nextInt();
            Equipo eq1 = campeonato.buscarEquipo(lector.next());
            int golesEq1 = lector.nextInt();
            int golesEq2 = lector.nextInt();
            Equipo eq2 = campeonato.buscarEquipo(lector.next());
            lector.nextLine();
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
        lector.close();
    }
      
    /*
     * Metodo estatico que vuelca los datos del archivo pronosticoqatar2022.csv
     * en el ticket de cada apostador.
     */
    protected static void cargarArchivoPronosticos
    (Path archivoPronosticos, HashMap<Integer, Apostador> aps) throws IOException{
        Scanner lector = new Scanner(archivoPronosticos);
        boolean esEncabezado = true;
        boolean bandera = true;
        String encabezado;
        int eq = 0;
        lector.useDelimiter("[;\\n\\r]");
        while (lector.hasNextLine()) {
            if (esEncabezado) {
                encabezado = lector.nextLine();
                esEncabezado = false;
            }
            int idApostador = lector.nextInt();
            int partidoKey = lector.nextInt();
            String eq1 = lector.next();
            int pronostico = lector.nextInt();
            String eq2 = lector.next();
            lector.nextLine();
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
            Apostador ap = aps.get(idApostador);
            Ticket tk = new Ticket(partidoKey, eq, pronosticoResultado);
            ap.apuestasTot.put(tk.getPartidoKey(), tk);
        }
        lector.close();
    }
    protected static void cargarArchivoApostadores
    (Path archivoApostadores,HashMap<Integer, Apostador> apostadores) throws IOException{
        Scanner lector = new Scanner(archivoApostadores);
        lector.useDelimiter("[;\\n\\r]");
        while (lector.hasNextInt()) {
            int id = lector.nextInt();
            String nombreCompleto = lector.next();
            lector.nextLine();
            Apostador ap = new Apostador(id, nombreCompleto);
            apostadores.put(ap.getIdApostador(), ap);
        }
        lector.close();
    }
}
