package ec.edu.espe.arquitectura.examen.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class EmpleadosDTO {

    private String cedulaIdentidad;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;
    
}
