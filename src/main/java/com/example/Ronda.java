package com.example;
import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor


public class Ronda {
    private int numeroRonda;
    /* Atributo de clase
     * unaRondaHashMap usa como clave univoca el valor de
     * la primera columna del archivo "Partidos Qatar 2022.csv"
     */
    private HashMap<Integer, Partido> unaRondaHashMap;

    public Ronda(int numeroRonda){
        /*
         * Constructor que instancia HashMap vacio.
         * Recibe como argumento el numero de ronda a cargar.
         */
        this.numeroRonda = numeroRonda;
        this.unaRondaHashMap = new HashMap<>();
    }
    public Partido buscarPartido(int partidoKey){
        Partido p;
        p = this.unaRondaHashMap.get(partidoKey);
        return p;
    }
}
