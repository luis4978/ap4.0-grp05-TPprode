package com.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mundial2022 {
    /*
    El atributo de clase mundial contiene objetos Ronda. Cada Ronda contiene
    un hashmap de partidos. 
     */
    private HashMap<Integer, Ronda> mundial;
    private ArrayList<String[]> totalPartidos;
    private final int TOTAL_RONDAS = 7;
    /* Atributo de clase equiposHashMap usa como clave univoca el valor de
     * la primera columna del archivo "Equipos Qatar 2022.csv"
     */
    private HashMap <String, Equipo> equiposHashMap;
    /*
     * Constructor recibe la ruta hacia los archivos
     * que contienen la lista de equipos y de partidos
     * de QATAR2022.
     */
    Mundial2022(){
        this.mundial = new HashMap<>();
        this.totalPartidos = new ArrayList<>();
        this.equiposHashMap = new HashMap<>();
    }

    /* Metodo privado que recibe como argumento un String que es valor clave 
     * para buscar en esquiposHashMap. Devuelve un objeto del tipo Equipo.
     */
    public Equipo buscarEquipo(String equipoKey){
        Equipo equipoBuscado = new Equipo();
        equipoBuscado = this.equiposHashMap.get(equipoKey);
        return equipoBuscado;
    }
    public Ronda buscarRonda(int rondaKey){
        return this.mundial.get(rondaKey);
    }
    /*
     * El metodo recibe lee un archivo csv que tiene la lista de paises
     * que participaron en el mundial de Qatar y los carga a un 
     * HashMap de objetos de tipo Equipo.
     */
    
    public void cargarMundial() throws IOException{
        /*
         * Se recorre el ArrayList<String[]> un total de TOTAL_RONDAS (7 veces)
         * y se carga cada HashMap de ronda al ArrayList<HashMap<>> mundial.
         */
        for (int i = 1; i <= TOTAL_RONDAS; i++) {
            Ronda ronda = new Ronda(i);
            for (String[] ln : this.totalPartidos) {
                int rondaKEY = Integer.parseInt(ln[0]);
                Equipo eq1 = this.buscarEquipo(ln[1]);
                int golesEq1 = Integer.parseInt(ln[2]);
                int golesEq2 = Integer.parseInt(ln[3]);
                Equipo eq2 = this.buscarEquipo(ln[4]);
                Partido p = new Partido(rondaKEY, eq1, golesEq1, golesEq2, eq2);
                if(rondaKEY/100 == i){
                    /*
                     * Si es una misma ronda agrega el obj a HashMap
                     */
                    ronda.getUnaRondaHashMap().put(p.getPartidoKEY(), p);
                }
            }
            this.mundial.put(ronda.getNumeroRonda(), ronda);
        }
    }
    public void mostrarCargaEquipos(){
        /*
         * Bucle para testear la carga de archivo equiposqatar2022.csv
         */
        for (Equipo eq : this.equiposHashMap.values()) {
            System.out.println(eq.toString());
        }
        
    }
    public void mostrarCargaMundial(){
        /*
         * Bucle para mostrar la carga de partidos del campeonato.
         */
        for (Ronda r : this.mundial.values()) {
            System.out.println("Partidos de la " + r.getNumeroRonda() + "° ronda: ");
            for (Partido partido : r.getUnaRondaHashMap().values() ) {
                System.out.println(partido.toString());    
            }
        }
    }
    
}
