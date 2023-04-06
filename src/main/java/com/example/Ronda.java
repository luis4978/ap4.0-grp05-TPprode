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
     * el metodo devuelve un objeto del tipo Partido.
     */
    public Partido buscarPartido(int rondaKey){
        Partido partidoBuscado = new Partido();
        partidoBuscado = this.partidosHashMap.get(rondaKey);
        return partidoBuscado;
    }
    
    /* Metodo que recibe como argumento un String que es 
     * valor clave para recorrer partidosHashMap y buscar un partido,
     * el metodo devuelve un objeto del tipo Equipo.
     */
    public Equipo buscarEquipo(String equipoKey){
        Equipo equipoBuscado = new Equipo();
        equipoBuscado = this.equiposHashMap.get(equipoKey);
        return equipoBuscado;
    }

    /*
     * El metodo recibe un archivo csv que tiene la lista de paises
     * que participaron en el mundial de Qatar y los carga a un 
     * HashMap de objetos de tipo Equipo.
     */
    public void cargaEquipos(Path archivoEquipos) throws IOException{
        Scanner lector = new Scanner(archivoEquipos);
        boolean esEncabezado = true;
        String encabezado; 
        /*
         * lector.useLocale(Locale.forLanguageTag("es-AR"));
         * se setea el scanner para configurar un lenguaje especifico.
         * se escribe la linea antes del useDelimiter()
         */
        lector.useDelimiter("[;\\n\\r]");
        while (lector.hasNextLine()) {
            /*
             * La variable esEncabezado controla si es la primera
             * linea pertenece al encabezado del archivo, y lo almacena 
             * en la variable encabezado que es de tipo String.
             */ 
            if (esEncabezado) {
                encabezado = lector.nextLine();
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
            lector.nextLine();
            /*
             * Se crea un objeto equipo con las variables arriba declaradas
             * y se guarda en el HashMap <String, Equipo> atributo de clase.
             */
            Equipo eq = new Equipo(nombreEquipo, temporada, pais, partidosJugados);
            this.equiposHashMap.put(nombreEquipo, eq);
        }
        lector.close();
    }

    /*
     * Metodo recibe un archivo csv que tiene una lista de una
     * ronda de partidos del mundial Qatar 2022 y los carga en
     * un HashMap de objetos del tipo Partido.
     */
    public void cargaPartidos(Path archivoPartidos) throws IOException{
        Scanner lector = new Scanner(archivoPartidos);
        boolean esEncabezado = true;
        String encabezado;
        lector.useDelimiter("[;\\n\\r]");
        while (lector.hasNextLine()) { 
            if (esEncabezado) {
                encabezado = lector.nextLine();
                esEncabezado = false;
            }
            int rondaKEY = lector.nextInt();
            String equipo1 = lector.next();          
            int golesEquipo1 = lector.nextInt();
            int golesEquipo2 = lector.nextInt();
            String equipo2 = lector.next();
            lector.nextLine();
            Equipo eq1 = this.equiposHashMap.get(equipo1);
            Equipo eq2 = this.equiposHashMap.get(equipo2);
            Partido partido = new Partido(rondaKEY, eq1, golesEquipo1, golesEquipo2, eq2);
            this.partidosHashMap.put(partido.getRondaKEY(), partido);
        }
        lector.close();
    }
}
