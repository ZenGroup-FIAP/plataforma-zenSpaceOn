package zen.forms;

import zen.users.Paciente;
import zen.users.Psicologo;

public class Avaliacao extends Formulario {
	private String feedback;
	private Double nota;
	
	public Avaliacao() {
		super();
	}

	public Avaliacao(Paciente paciente, Psicologo psicologo, Integer idFormulario, String feedback, Double nota) {
		super(paciente, psicologo, idFormulario);
		this.feedback = feedback;
		this.nota = nota;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}
	
}

