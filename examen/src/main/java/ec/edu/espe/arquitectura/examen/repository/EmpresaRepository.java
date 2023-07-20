package ec.edu.espe.arquitectura.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.examen.model.Empresa;
import ec.edu.espe.arquitectura.examen.model.PagoRol;

@Repository
public interface EmpresaRepository extends MongoRepository<Empresa, String>{
    List<PagoRol> obtenerTodasLasEmpresas(); 

    Empresa findByRuc(String ruc);
}
