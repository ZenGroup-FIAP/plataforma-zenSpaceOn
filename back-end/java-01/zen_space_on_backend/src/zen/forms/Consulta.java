package zen.forms;

import java.util.Date;
import java.util.Scanner;

public class Consulta extends Formulario {
	private String desc;
	private Laudo laudo;
	private Date data;
	private Double tempoConsulta;
	
	private Scanner sc = new Scanner(System.in);

	public Consulta(Integer codigoIdPaciente, Integer codigoIdPsicologo, Integer idFormulario, String desc, Laudo laudo,
			Date data, Double tempoConsulta) {
		super(codigoIdPaciente, codigoIdPsicologo, idFormulario);
		this.desc = desc;
		this.laudo = laudo;
		this.data = data;
		this.tempoConsulta = tempoConsulta;
	}

	public Consulta() {
		super();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Laudo getLaudo() {
		return laudo;
	}

	public void setLaudo(Laudo laudo) {
		this.laudo = laudo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public Double getTempoConsulta() {
		return tempoConsulta;
	}

	public void setTempoConsulta(Double tempoConsulta) {
		this.tempoConsulta = tempoConsulta;
	}

	@Override
	public void cadastrar() {
		// Fazer sistema de cadastro
		sc.close();
	}
}
