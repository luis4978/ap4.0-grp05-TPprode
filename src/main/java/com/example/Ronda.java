package com.example;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

    public Ronda(int numeroRonda){
        /*
         * Constructor que instancia HashMap vacio.
         * Recibe como argumento el numero de ronda a cargar.
         */
        this.numeroRonda = numeroRonda;
        this.partidosHashMap = new HashMap<>();
    }
}
