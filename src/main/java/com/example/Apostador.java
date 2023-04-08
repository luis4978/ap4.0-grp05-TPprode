package com.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Apostador  {
    /*
     * Un apostador puede tener varios tickets de
     * distintas apuestas, se almacenan en un ArrayList.
     */
    ArrayList <Ticket> ticketApuesta;
    private int idApostador;
    private String nombreCompleto;

    public Apostador(int dni, String nombreCompleto){
        this.idApostador = dni;
        this.nombreCompleto = nombreCompleto;
        this.ticketApuesta = new ArrayList<>();
    }

    public void cargaApuestas(Path archivoApuestasRonda) throws IOException{
        Scanner lector = new Scanner(archivoApuestasRonda);
        boolean esEncabezado = true;
        String encabezado;
        lector.useDelimiter("[;\\n\\r]");
        while (lector.hasNextLine()) {
            if(esEncabezado){
                encabezado = lector.nextLine();
                esEncabezado = false;
            }
            int rondaKey = lector.nextInt();
            String equipo = lector.next();
            int resu = lector.nextInt();
            lector.nextLine();
            ResultadoEnum resultado = ResultadoEnum.values()[resu];
            Ticket ticket = new Ticket(rondaKey, equipo, resultado);
            this.ticketApuesta.add(ticket);
        }
    }        
}
