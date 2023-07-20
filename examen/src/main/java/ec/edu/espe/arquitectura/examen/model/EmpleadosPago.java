package ec.edu.espe.arquitectura.examen.model;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor

public class EmpleadosPago {

    private String numeroCuenta;
    private BigDecimal valor;
    private String estado;
    
}
