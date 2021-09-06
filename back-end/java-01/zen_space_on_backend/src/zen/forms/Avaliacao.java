package zen.forms;

public class Avaliacao extends Formulario {
	private String feedback;
	private Double nota;
	
	public Avaliacao() {
		super();
	}

	public Avaliacao(Integer codigoIdPaciente, Integer codigoIdPsicologo, Integer idFormulario, String feedback, Double nota) {
		super(codigoIdPaciente, codigoIdPsicologo, idFormulario);
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
	
	@Override
	public void cadastrar() {
		// Implementar cadastro
	}
	
}

