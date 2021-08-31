package zen.forms;

public class Avaliacao extends Formulario {
	private String feedback;
	private double nota;
	
	public Avaliacao() {
		super();
	}

	public Avaliacao(String feedback, double nota) {
		super();
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

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public void cadastrar() {
		// Implementar cadastro
	}
	
}
