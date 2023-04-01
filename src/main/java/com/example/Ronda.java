package com.example;
import java.util.ArrayList;
import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor


public class Ronda {
    private int numeroRonda;
    private HashMap<Integer, Partido> partidosHashMap;

    public Ronda(){
        partidosHashMap = new HashMap();
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
}
