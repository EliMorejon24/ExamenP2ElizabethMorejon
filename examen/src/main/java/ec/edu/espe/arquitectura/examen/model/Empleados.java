package ec.edu.espe.arquitectura.examen.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor

public class Empleados {

    private String cedulaIdentidad;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;
}
