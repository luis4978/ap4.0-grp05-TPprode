package com.example;
import java.util.ArrayList;
import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Partido {
    private int rondaKEY; //Valor que identifica un partido de forma univoca
    private Equipo equipo1;
    private int golesEquipo1;
    private int golesEquipo2;
    private Equipo equipo2;

    /*
     * Metodo que calcula que equipo gano el partido, recibe
     * como argumento un equipo y verifica su resultado devolviendo
     * un valor del tipo ResultadoEnum.
    */
    public ResultadoEnum resultado(Equipo equipo){
        Equipo ganador = new Equipo();
        if (golesEquipo1 > golesEquipo2) {
            ganador = this.equipo1;
        }if (golesEquipo2 > golesEquipo1) {
            ganador = this.equipo2;
        }
        ResultadoEnum resultado = ResultadoEnum.EMPATE;
        if (equipo.getNombreEquipo().equals(ganador.getNombreEquipo())) {
            resultado = ResultadoEnum.GANADOR;
        }
        if (!equipo.equals(ganador)) {
            resultado = ResultadoEnum.PERDEDOR;
        }
        return resultado;
    }
    @Override
    public String toString(){
        return "[Ronda="+rondaKEY+" Equipo1="+equipo1.getNombreEquipo()
        +"="+golesEquipo1+" - "+golesEquipo2+"="+equipo2.getNombreEquipo()+"]";
    }
}
