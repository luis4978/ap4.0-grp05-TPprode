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
        ResultadoEnum resultado = null;
        if (golesEquipo1 > golesEquipo2) {
            if (equipo.equals(this.equipo1)) {
                resultado = ResultadoEnum.GANADOR;
            }

        }if (golesEquipo1 < golesEquipo2) {
            if (equipo.equals(this.equipo2)) {
                resultado = ResultadoEnum.PERDEDOR;
            }
        }
        if (golesEquipo1 == golesEquipo2) {
            resultado = ResultadoEnum.EMPATE;
        }
        return resultado;
    }
    @Override
    public String toString(){
        return "[Ronda="+rondaKEY+" "+equipo1.getNombreEquipo()
        +"="+golesEquipo1+" - "+golesEquipo2+"="+equipo2.getNombreEquipo()+"]";
    }
}
