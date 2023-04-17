package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Prode {
    private ArrayList<String[]> totalApuestas;
    private HashMap<Integer, Apostador> apostadores;
    private final int PUNTOS_EXTRA_RONDA = 3;

    public Prode(){
        this.totalApuestas = new ArrayList<String[]>();
        this.apostadores = new HashMap<Integer, Apostador>();
    }

    public void cargarTicketsApuestas(){
        for (String[] ln : totalApuestas) {
            Ticket tk = null;
            int idApostador = Integer.parseInt(ln[0]);
            int partidoKey = Integer.parseInt(ln[1]);
            String eq1 = ln[2];
            int gana1 = Integer.parseInt(ln[3]);
            int empata = Integer.parseInt(ln[4]);
            int gana2 = Integer.parseInt(ln[5]);
            String eq2 = ln[6];
            if (gana1 == 1) {
                tk = new Ticket(partidoKey, eq1, ResultadoEnum.GANADOR);
            }
            if (gana2 == 1) {
                tk = new Ticket(partidoKey, eq2, ResultadoEnum.GANADOR);
            }
            if (empata == 1) {
                tk = new Ticket(partidoKey, eq1, ResultadoEnum.EMPATE);
            }
            this.apostadores.get(idApostador).cargarTicket(tk);
            //Se muestra por pantalla la carga del ticket
            System.out.println(tk.toString());
        }
    }

    public void mostrarAciertos(Mundial2022 campeonato){
        /*
         * al llamar al metodo contarAciertos lanza error de 
         * partido null.
         */
        for (Apostador ap : this.apostadores.values()) {
            for (Ronda r : campeonato.getPartidos().values()) {
                int aciertosTotales = ap.contarAciertos(campeonato, r);
                /*
                if (r.getUnaRondaHashMap().size() == aciertosTotales) {
                    aciertosTotales += this.PUNTOS_EXTRA_RONDA;
                    System.out.println("Tamaño de Hash una ronda" + r.getUnaRondaHashMap().size());
                    System.out.println("Se suman " + this.PUNTOS_EXTRA_RONDA
                        + " extra por acertar la ronda.");
                } */
                System.out.println("Cantidad aciertos de "
                                    + r.getNumeroRonda()+ "° ronda "
                                    + ap.getNombreCompleto() + ": "
                                    + aciertosTotales);
            }
            
        }
    }
    /*
     * Metodo que muestra los datos del array totalApuestas.
     */
    public void mostrarCargaApuestas(){
        for (String [] str : this.totalApuestas) {
            for (String ln : str) {
                System.out.print(ln+" ");   
            }
            System.out.println();
        }
    }
    public void mostrarCargaApostadores(){
        for (Apostador ap : this.apostadores.values()) {
            System.out.println(ap.toString());
        }
    }
}
