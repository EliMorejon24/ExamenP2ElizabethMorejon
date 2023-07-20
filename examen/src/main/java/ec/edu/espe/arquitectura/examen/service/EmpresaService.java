package ec.edu.espe.arquitectura.examen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.controller.dto.EmpleadosPagoDTO;
import ec.edu.espe.arquitectura.examen.controller.dto.EmpresaDTO;
import ec.edu.espe.arquitectura.examen.model.EmpleadosPago;
import ec.edu.espe.arquitectura.examen.repository.EmpresaRepository;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public void createEmpresaEmpleados(EmpresaDTO empresaDTO) {
        List<EmpleadosPago> empleados = new ArrayList<>();
        for (EmpleadosPagoDTO empleadoDTO : empresaDTO.getEmpleados()) {
            EmpleadosPago empleado = new EmpleadosPago(
                empleadoDTO.getNumeroCuenta(),
                empleadoDTO.getValor(),
                empleadoDTO.getEstado()
            );
            empleados.add(empleado);
        }

    private EmpresaDTO transformDto (Empresa empresa){
        EmpresaDTO  empresaDTO = new EmpresaDTO();
        empresaDTO.getMes(),
        empresaDTO.getFechaProceso(),
        empresaDTO.getRucEmpresa(),
        empresaDTO.getCuentaPrincipal(),
        empresaDTO.getValorTotal(),
        empresaDTO.getValorReal(),
        empleados;

    }
}
