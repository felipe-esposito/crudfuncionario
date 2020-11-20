package teste.crudfuncionario.repository;

import org.springframework.data.repository.CrudRepository;
import teste.crudfuncionario.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

}
