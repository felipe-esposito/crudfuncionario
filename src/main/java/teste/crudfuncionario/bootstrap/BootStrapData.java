package teste.crudfuncionario.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import teste.crudfuncionario.model.*;
import teste.crudfuncionario.repository.*;

@Component
public class BootStrapData implements CommandLineRunner {

	private final FuncionarioRepository funcionarioRepository;
	private final DepartamentoRepository departamentoRepository;
	private final CargoRepository cargoRepository;

	public BootStrapData(FuncionarioRepository funcionarioRepository, DepartamentoRepository departamentoRepository,
			CargoRepository cargoRepository) {
		this.funcionarioRepository = funcionarioRepository;
		this.departamentoRepository = departamentoRepository;
		this.cargoRepository = cargoRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Funcionario fulano = new Funcionario();
	}

	
	
}
