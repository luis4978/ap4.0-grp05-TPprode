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
      /*        
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
