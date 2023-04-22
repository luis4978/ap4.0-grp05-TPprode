package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
/*Clase que esta contenida en clase Apostador
 * 
 */
public class Ticket {
    /*
     * Variable ronda contiene un valor que identifica 
     * un partido de forma univoca.
     * Variable equipo identifica un equipo de forma univoca
     * Variable pronostico contiene un valor del tipo
     * ResultadoEnum (GANADOR, EMPATE, PERDEDOR).
     */
    private int partidoKey;
    private int equipoGanador;
    private ResultadoEnum pronostico;

}
