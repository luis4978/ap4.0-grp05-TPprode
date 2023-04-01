import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 */

public class Partido {
    int rondaKEY; //Valor que identifica un partido de forma univoca
    Equipo equipo1 = new Equipo("Argentina", "Seleccion de Sur America");
    Equipo equipo2 = new Equipo("Arabia Saudita", "Seleccion de Europa");
    Equipo ganador;
    int golesEquipo1;
    int golesEquipo2;
    ResultadoEnum resultado;

    /*Metodo que devuelve un resultado del tipo ResultadoEnum
     comparando los goles de cada equipo.  se inicializa en empate 
     y se modifica el valor en los condicionales  */
    public void resulatadoPartido(){
        if (golesEquipo1 > golesEquipo2) {
            this.ganador = this.equipo1;
        }if (golesEquipo2 > golesEquipo1) {
            this.ganador = this.equipo2;
        }
    }

    public ResultadoEnum resultado(Equipo equipo){
        ResultadoEnum resultado = ResultadoEnum.EMPATE;
        if (equipo.equals(this.ganador)) {
            resultado = ResultadoEnum.GANADOR;
        }
        if (!equipo.equals(this.ganador)) {
            resultado = ResultadoEnum.PERDEDOR;
        }
        return resultado;
    }
}
