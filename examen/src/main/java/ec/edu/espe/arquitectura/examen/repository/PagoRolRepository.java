package ec.edu.espe.arquitectura.examen.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.examen.model.PagoRol;

public interface PagoRolRepository MongoRepository<PagoRol, String>{
    PagoRol findByMesAndRucEmpresaAndFechaProceso(String mes, String ruc, Date fechaProceso);
}
