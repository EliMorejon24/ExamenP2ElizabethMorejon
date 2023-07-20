package ec.edu.espe.arquitectura.examen.controller.dto;

import java.util.List;

import ec.edu.espe.arquitectura.examen.model.Empleados;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class EmpresaDTO {

    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleados> empleados;
    
}
