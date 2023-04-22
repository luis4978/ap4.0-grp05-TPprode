package com.example;

import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mundial2022 {
    
    private HashMap<Integer, Ronda> partidos;
    private final int TOTAL_RONDAS = 7;
    private HashMap <String, Equipo> equiposHashMap;

    Mundial2022(){
        this.partidos = new HashMap<>();
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
        return this.partidos.get(rondaKey);
    }
    /*
     * Metodo que recibe un archivo de partidos del Mundial de qatar
     * y los vuelca en una coleccion HashMap
     */
    
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
        for (Ronda r : this.partidos.values()) {
            System.out.println("Partidos de la " + r.getNumeroRonda() + "° ronda: ");
            for (Partido partido : r.getUnaRondaHashMap().values() ) {
                System.out.println(partido.toString());    
            }
        }
    }
    
}
