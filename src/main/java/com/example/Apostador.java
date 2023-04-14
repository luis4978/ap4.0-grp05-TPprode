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
     * Validar que es un equippo participante.
     */
    ArrayList <Ticket> ticketApuesta;
    private int idApostador;
    private String nombreCompleto;

    /*
     * Metodo contarAciertos recibe de alguna manera un objeto Mundial2022
     * metodo buscar partido devuelve un partido en clase mundial2022.
     */
    public Apostador(int dni, String nombreCompleto){
        this.idApostador = dni;
        this.nombreCompleto = nombreCompleto;
        this.ticketApuesta = new ArrayList<>();
    }   

    /*
     * El metodo contarAciertos() cuenta los aciertos de una sola ronda
     * 
     */
    public void cargarTicket(Ticket tk){
        this.ticketApuesta.add(tk);
    }

    public int contarAciertos(Mundial2022 mundial, int rondaKey){
        int aciertos = 0;
        for (Ticket tk : this.ticketApuesta) {
            Ronda r = mundial.buscarRonda(rondaKey);
            Partido p = r.buscarPartido(tk.getPartidoKey());
            ResultadoEnum pronostico = tk.getPronostico();
            ResultadoEnum resultado = p.resultado(mundial.buscarEquipo(tk.getEquipoKey()));
            if (pronostico.equals(resultado)) {
                aciertos++;
            }
        }
        return aciertos;
    }
    @Override
    public String toString(){
        String msj = "Apostador= "+nombreCompleto + " " + idApostador + "\n";
        for (Ticket tk : ticketApuesta) {
            msj += tk.toString() + "\n";
        }
        return msj;
    } 
}
