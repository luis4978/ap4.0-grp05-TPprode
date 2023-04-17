package com.example;

import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apostador  {
    /*
     * Un apostador puede tener varios tickets de
     * distintas apuestas, se almacenan en un ArrayList.
     */
    HashMap<Integer, Ticket> apuestasTot;
    
    private int idApostador;
    private String nombreCompleto;
    private final int PUNTOS_POR_ACIERTO = 1;

    public Apostador(int dni, String nombreCompleto){
        this.idApostador = dni;
        this.nombreCompleto = nombreCompleto;
        this.apuestasTot = new HashMap<>();
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
}
