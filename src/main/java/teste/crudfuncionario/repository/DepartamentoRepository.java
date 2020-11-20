package teste.crudfuncionario.repository;

import org.springframework.data.repository.CrudRepository;
import teste.crudfuncionario.model.Departamento;

public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {

}
