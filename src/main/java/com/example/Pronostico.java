package com.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pronostico {
    Partido partido;
    Equipo equipo;
    ResultadoEnum resultado;
    //Falta definir si se agregan mas variables y metodos
    
}
