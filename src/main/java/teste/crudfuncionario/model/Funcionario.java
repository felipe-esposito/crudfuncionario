package teste.crudfuncionario.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Funcionario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String name;
	private int age;
	private Date birthday;
	private String document;
	
	@ManyToOne
	private Cargo cargo;
	
	@ManyToMany
    @JoinTable(name = "funcionario_departamento", joinColumns = @JoinColumn(name = "funcionario_id"),
            inverseJoinColumns = @JoinColumn(name = "departamento_id"))
    private Set<Departamento> departamentos = new HashSet<>();

	public Funcionario() {
		
	}
	
	public Funcionario(String name, int age, Date birthday, String document, Cargo cargo,
			Set<Departamento> departamentos) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.document = document;
		this.cargo = cargo;
		this.departamentos = departamentos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Set<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Set<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", name=" + name + ", age=" + age + ", birthday=" + birthday + ", document="
				+ document + ", cargo=" + cargo + ", departamentos=" + departamentos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
