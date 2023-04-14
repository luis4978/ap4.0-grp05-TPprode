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
      /*   se deberia integrar en la clase apostador.     
        for (Ticket tk : ap1.getTicketApuesta()) {
            System.out.println(tk.toString());
        }
        int puntos = 0;
        Partido partido;
        Equipo eq;
        for (Ticket tk : ap1.getTicketApuesta()) {
            partido = ronda1.buscarPartido(tk.getRondaKey());
            eq = ronda1.buscarEquipo(tk.getEquipoKey()); 
            if (tk.getPronostico()==partido.resultado(eq)) {
                System.out.println(partido.toString()+"\n");
                puntos++;
            }
        }
        System.out.println("Puntos obtenidos de "+ap1.getNombreCompleto() + " " + puntos); 
         */
}
