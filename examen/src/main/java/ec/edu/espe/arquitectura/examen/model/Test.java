package ec.edu.espe.arquitectura.examen.model;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Document(collection = "clientes")
@CompoundIndex(name = "indx_clientes_typeDoc_DocId", def = "{'typeDocummentId':1,}", unique = true)
@Setter @Getter
@Builder
@AllArgsConstructor
public class Test {
    
}
