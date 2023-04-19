package com.example;

import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apostador implements Comparable<Apostador>  {
    private HashMap<Integer, Ticket> apuestasTot;
    
    private int idApostador;
    private String nombreCompleto;
    private int puntosTotales;
    private final int PUNTOS_POR_ACIERTO = 1;

    public Apostador(int dni, String nombreCompleto){
        this.idApostador = dni;
        this.puntosTotales = 0;
        this.nombreCompleto = nombreCompleto;
        this.apuestasTot = new HashMap<Integer, Ticket>();
    }   

    /*
     * El metodo contarAciertos() cuenta los aciertos de una sola ronda
     * Se modifico el archivo apostadores (las primeras 16 lineas) 
     * para que se acierte la ronda completa.
     */
    public int contarAciertos(Ronda r){
        int aciertos = 0;
        for(Partido p : r.getUnaRondaHashMap().values()){
            ResultadoEnum pronostico = this.apuestasTot.get(p.getPartidoKEY()).getPronostico();
            ResultadoEnum resultado = p.resultado();
            if (pronostico.equals(resultado)) {
                aciertos += this.PUNTOS_POR_ACIERTO;
            }
        }
        return aciertos;
    }
    ////////////////////////////////////////////////////////////////////
    @Override
    public String toString(){
        String msj = "Apostador= "+nombreCompleto + " " + idApostador + "\n";
        for (Ticket tk : this.apuestasTot.values()) {
            msj += tk.toString() + "\n";
        }
        return msj;
    } 
    
    public void puntosPorRonda(int aciertos){
        this.puntosTotales += aciertos;
    }
    @Override
    public int compareTo(Apostador ap){
        String a = new String(String.valueOf(this.puntosTotales));
        String b = new String(String.valueOf(ap.getPuntosTotales()));
        return b.compareTo(a);
    }
}
