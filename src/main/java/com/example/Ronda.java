package com.example;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.BlockElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor


public class Ronda {
    private int numeroRonda;
    /* Atributo de clase
     * partidosHashMap usa como clave univoca el valor de
     * la primera columna del archivo "Partidos Qatar 2022.csv"
     */
    private HashMap<Integer, Partido> partidosHashMap;
    /* Atributo de clase
     * equiposHashMap usa como clave univoca el valor de
     * la primera columna del archivo "Equipos Qatar 2022.csv"
     */
    private HashMap <String, Equipo> equiposHashMap;

    public Ronda(){
        /*
         * Constructor que instancia dos HashMap vacios
         */
        partidosHashMap = new HashMap<>();
        equiposHashMap = new HashMap<>();
    }

    /* Metodo que recibe como argumento un entero 
     * que es valor clave para recorrer partidosHashMap y buscar un partido,
     * la Clase Ticket tiene un atributo
     * con un valor que define la apuesta sobre un partido
     * de forma univoca.
     * El metodo devuelve un bjeto del tipo Partido.
     */
    public Partido partido(int rondaKey){
        Partido partidoBuscado = new Partido();
        partidoBuscado = partidosHashMap.get(rondaKey);
        return partidoBuscado;
    }

    //Ruta del archivo "Equipos Qatar 2022.csv" C://Users//Luis//Desktop
    /*El metodo recibe un archivo csv que tiene la lista de paises
     * que participaron en el mundial de Qatar y los carga a un 
     * ArrayList de objetos tipo Equipo.
     * 
     */
    public void cargaEquipos(Path archivoEquipos) throws IOException{
        Scanner lector = new Scanner(archivoEquipos);
        boolean esEncabezado = true;
        String encabezado; 
        lector.useDelimiter("[;\\n]");
        while (lector.hasNextLine()) {
            /*
             * La variable esEncabezado controla si es la primera
             * linea pertenece al encabezado del archivo, y lo almacena 
             * en la variable encabezado que es de tipo String.
             */ 
            if (esEncabezado) {
                encabezado = lector.nextLine();
                System.out.println(encabezado);
                lector.hasNextLine();
                esEncabezado = false;
            }
            /*
             * Aca se empieza a leer la segunda linea del archivo
             * y se guardan los datos en variables correspondientes 
             * al tipo de dato 
             */

            String nombreEquipo = lector.next();
            int temporada = lector.nextInt();
            String pais = lector.next();
            short partidosJugados = lector.nextShort();
            lector.reset();
            /*
             * Se crea un objeto equipo con las variables arriba declaradas
             * y se guarda en el HashMap <String, Equipo> atributo de clase.
             */
            Equipo eq = new Equipo(nombreEquipo, temporada, pais, partidosJugados);
            this.equiposHashMap.put(nombreEquipo, eq);
        }
        lector.close();
    }

    public void cargaPartidos(Path archivoPartidos) throws IOException{
        Scanner lector = new Scanner(archivoPartidos);
        boolean esEncabezado = true;
        String encabezado;
        while (lector.hasNextInt()) { 
            if (esEncabezado) {
                encabezado = lector.nextLine();
                lector.useDelimiter("[;\\n]");
                esEncabezado = false;
            }
            int rondaKEY = lector.nextInt(); 
            String equipo1 = lector.next();
            int golesEquipo1 = lector.nextInt();
            int golesEquipo2 = lector.nextInt();
            String equipo2 = lector.next();
            Equipo eq1 = this.equiposHashMap.get(equipo1);
            Equipo eq2 = this.equiposHashMap.get(equipo2);
            Partido partido = new Partido(rondaKEY, eq1, golesEquipo1, golesEquipo2, eq2);
            this.partidosHashMap.put(partido.getRondaKEY(), partido);
        }
        lector.close();
    }
}
