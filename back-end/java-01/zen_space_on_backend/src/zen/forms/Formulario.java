package zen.forms;

import java.util.Scanner;

public abstract class Formulario {
	private Integer codigoIdPaciente;
	private Integer codigoIdPsicologo;
	private Integer idFormulario;
	private Scanner sc = new Scanner(System.in);
	
	public Formulario() {
		
	}

	public Formulario(Integer codigoIdPaciente, Integer codigoIdPsicologo, Integer idFormulario) {
		this.codigoIdPaciente = codigoIdPaciente;
		this.codigoIdPsicologo = codigoIdPsicologo;
		this.idFormulario = idFormulario;
	}

	public Integer getCodigoIdPaciente() {
		return codigoIdPaciente;
	}

	public void setCodigoIdPaciente(Integer codigoIdPaciente) {
		this.codigoIdPaciente = codigoIdPaciente;
	}

	public Integer getCodigoIdPsicologo() {
		return codigoIdPsicologo;
	}

	public void setCodigoIdPsicologo(Integer codigoIdPsicologo) {
		this.codigoIdPsicologo = codigoIdPsicologo;
	}
	
	public Integer getIdFormulario() {
		return idFormulario;
	}

	public void setIdFormulario(Integer idFormulario) {
		this.idFormulario = idFormulario;
	}

	public void cadastrar() {
		
		System.out.print("DIGITE O CODIGO ID DO PACIENTE: ");
		this.setCodigoIdPaciente(sc.nextInt());
	
		System.out.print("DIGITE O CODIGO ID DO PSICÓLOGO: ");
		this.setCodigoIdPsicologo(sc.nextInt());
		
	}
}
