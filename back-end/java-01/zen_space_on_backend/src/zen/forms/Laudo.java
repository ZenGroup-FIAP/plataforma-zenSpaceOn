package zen.forms;

import zen.users.Paciente;
import zen.users.Psicologo;

public class Laudo {
	private Paciente paciente;
	private Psicologo psicologo;
	private String diagnostico;
	private String tratamento;
	
	public Laudo() {
		
	}

	public Laudo(Paciente paciente, Psicologo psicologo, String diagnostico, String tratamento) {
		this.paciente = paciente;
		this.psicologo = psicologo;
		this.diagnostico = diagnostico;
		this.tratamento = tratamento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	
}
