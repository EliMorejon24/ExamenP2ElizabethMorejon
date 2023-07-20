package ec.edu.espe.arquitectura.examen.service;

import java.util.List;

import ec.edu.espe.arquitectura.examen.controller.dto.EmpleadosPagoDTO;
import ec.edu.espe.arquitectura.examen.controller.dto.PagoRolDTO;
import ec.edu.espe.arquitectura.examen.model.EmpleadosPago;
import ec.edu.espe.arquitectura.examen.model.PagoRol;
import ec.edu.espe.arquitectura.examen.repository.PagoRolRepository;

@Service
public class PagoRolService {
    private final PagoRolRepository pagoRolRepository;

    public PagoRolService(PagoRolRepository pagoRolRepository){
        this.pagoRolRepository = pagoRolRepository;
    }

    public PagoRolDTO obtenerRolDePagosPorMes(String rucEmpresa, String mes) {
        PagoRol pagoRol = empresaRepository.obtenerRolDePagosPorMes(rucEmpresa, mes);

        if (pagoRol != null) {
            return convertirADTO(pagoRol);
        } else {
            return null;
        }
    }

    private PagoRolDTO transformADTO(PagoRol pagoRol) {
        List<EmpleadosPagoDTO> empleadosDTO = new ArrayList<>();
        for (EmpleadosPago empleado : pagoRol.getEmpleadosPago()) {
            EmpleadosPagoDTO empleadoDTO = new EmpleadosPagoDTO(
                    empleado.getNumeroCuenta(),
                    empleado.getValor(),
                    empleado.getEstado()
            );
            empleadosDTO.add(empleadoDTO);
        }

        return new PagoRolDTO(
                pagoRol.getMes(),
                pagoRol.getFechaProceso(),
                pagoRol.getRucEmpresa(),
                pagoRol.getCuentaPrincipal(),
                pagoRol.getValorTotal(),
                pagoRol.getValorReal(),
                empleadosDTO
        );
    }
}
