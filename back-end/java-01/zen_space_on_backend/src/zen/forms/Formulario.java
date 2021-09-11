package zen.forms;

import zen.users.Paciente;
import zen.users.Psicologo;

public abstract class Formulario {
	protected Paciente paciente;
	protected Psicologo psicologo;
	private Integer idFormulario;
	
	public Formulario() {
		
	}

	public Formulario(Paciente paciente, Psicologo psicologo, Integer idFormulario) {
		this.paciente = paciente;
		this.psicologo = psicologo;
		this.idFormulario = idFormulario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Psicologo getPsicologo() {
		return psicologo;
	}
	
	public Integer getIdFormulario() {
		return idFormulario;
	}

}
