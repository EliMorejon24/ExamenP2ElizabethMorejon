package ec.edu.espe.arquitectura.examen.controller.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import ec.edu.espe.arquitectura.examen.model.EmpleadosPago;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class PagoRolDTO {
    private String mes;
    private Date fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private BigDecimal valorTotal;
    private BigDecimal valorReal;
    private List<EmpleadosPago> empleadosPago;
}
