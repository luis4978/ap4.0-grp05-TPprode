import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Apostador extends Persona {
    ArrayList <Ticket> ticketPartido;
    //Falta definir si se deben agregar mas metodos y variable
}
