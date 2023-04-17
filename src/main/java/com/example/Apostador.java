package com.example;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apostador  {
    /*
     * Un apostador puede tener varios tickets de
     * distintas apuestas, se almacenan en un ArrayList.
     */
    ArrayList <Ticket> ticketApuesta;
    private int idApostador;
    private String nombreCompleto;
    private final int PUNTOS_POR_ACIERTO = 1;

    public Apostador(int dni, String nombreCompleto){
        this.idApostador = dni;
        this.nombreCompleto = nombreCompleto;
        this.ticketApuesta = new ArrayList<>();
    }   

    public void cargarTicket(Ticket tk){
        this.ticketApuesta.add(tk);
    }

    /*
     * El metodo contarAciertos() cuenta los aciertos de una sola ronda
     */
    ////////////////////////////////////////////////////////////////
    /*
     * Se modifico el archivo apostadores (las primeras 16 lineas).  
     * Se modifico las apuestas de la ronda 1 de ruben gil
     * para sumar 16 puntos por acertar todos los partidos
     * y sumarles puntos extras por acertar la ronda.
     * se debe revisar ya que no suma lo que deberia
     * partiendo de este metodo y llegando hasta prode que hace la llamada
     */
    public int contarAciertos(Mundial2022 mundial, Ronda ronda){
        int aciertos = 0;
        for (Ticket tk : this.ticketApuesta) {
            if (tk.getPartidoKey()/100 == ronda.getNumeroRonda()) {
                Partido partido = ronda.buscarPartido(tk.getPartidoKey());
                Equipo eq = mundial.buscarEquipo(tk.getEquipoKey());
                ResultadoEnum resu = partido.resultado(eq);
                if (tk.getPronostico().equals(resu)) {
                    aciertos = aciertos + this.PUNTOS_POR_ACIERTO;
                } 
            }            
        }
        return aciertos;
    }
    ////////////////////////////////////////////////////////////////////
    @Override
    public String toString(){
        String msj = "Apostador= "+nombreCompleto + " " + idApostador + "\n";
        for (Ticket tk : ticketApuesta) {
            msj += tk.toString() + "\n";
        }
        return msj;
    } 
}
