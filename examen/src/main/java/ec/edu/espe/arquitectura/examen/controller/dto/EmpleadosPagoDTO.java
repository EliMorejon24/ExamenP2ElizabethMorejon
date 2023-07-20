package ec.edu.espe.arquitectura.examen.controller.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class EmpleadosPagoDTO {

    private String numeroCuenta;
    private BigDecimal valor;
    private String estado;
    
}
