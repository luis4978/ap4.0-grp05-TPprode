package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Prode {
    private HashMap<Integer, Apostador> apostadores;
    private final int PUNTOS_EXTRA_RONDA = 3;
    private int idGanador;

    public Prode(){
        this.apostadores = new HashMap<Integer, Apostador>();
        this.idGanador = 0;
    }

    public void mostrarAciertos(Mundial2022 campeonato){
        int puntajeMasAlto = 0;
        for (Apostador ap : this.apostadores.values()) {
            for (Ronda r : campeonato.getPartidos().values()) {
                int puntosPosibles = r.getUnaRondaHashMap().size();
                int aciertos = ap.contarAciertos(r);
                if(aciertos == puntosPosibles){
                    aciertos += this.PUNTOS_EXTRA_RONDA;
                    System.out.println(ap.getNombreCompleto()+" recibe "+this.PUNTOS_EXTRA_RONDA
                            + " extra por acertar una ronda completa");
                }
                ap.puntosPorRonda(aciertos);
            }
            if (ap.getPuntosTotales() > puntajeMasAlto) {
                puntajeMasAlto = ap.getPuntosTotales();
                this.idGanador = ap.getIdApostador();
            }            
        }
        Apostador ganador = this.apostadores.get(this.idGanador);
        System.out.println("El ganador es "+ ganador.getNombreCompleto());
        System.out.println("Obtuvo: "+ganador.getPuntosTotales()+" puntos");
    }
    /*
     * Metodo que muestra los datos del array totalApuestas.
     */
    public void mostrarCargaApuestas(){
        for(Apostador ap : this.apostadores.values()){
            System.out.println("Apostador: "+ap.getNombreCompleto()
                    +" DNI: "+ap.getIdApostador());
            for (Ticket tk : ap.getApuestasTot().values()) {
                System.out.println(tk.toString());                
            }
        }
    }
    public void mostrarCargaApostadores(){
        for (Apostador ap : this.apostadores.values()) {
            System.out.println(ap.toString());
        }
    }
    public void apostadorGanador(){
        
        ArrayList<Apostador> ordenGanador = new ArrayList<>();
        for (Apostador ap : this.apostadores.values()) {
            ordenGanador.add(ap); 
        }
        Collections.sort(ordenGanador);
        for (Apostador apostador : ordenGanador) {
            System.out.println(apostador.getNombreCompleto()
                            +" = "+ apostador.getPuntosTotales());
        }
    }
}
