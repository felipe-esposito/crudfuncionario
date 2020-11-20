package teste.crudfuncionario.repository;

import org.springframework.data.repository.CrudRepository;
import teste.crudfuncionario.model.Cargo;

public interface CargoRepository extends CrudRepository<Cargo, Long> {

}
