package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
    private int rondaKey;
    private String equipoKey;
    private ResultadoEnum pronostico;

}
