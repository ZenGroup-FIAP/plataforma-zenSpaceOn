package zen.forms;

import java.util.Date;

import zen.users.Paciente;
import zen.users.Psicologo;

public class Consulta extends Formulario {
	private String desc;
	private Laudo laudo;
	private Date data;
	private Double tempoConsulta;

	public Consulta() {
		super();
	}
	
	public Consulta(Paciente paciente, Psicologo psicologo, Integer idFormulario, String desc, Laudo laudo, Date data,
			Double tempoConsulta) {
		super(paciente, psicologo, idFormulario);
		this.desc = desc;
		this.laudo = laudo;
		this.data = data;
		this.tempoConsulta = tempoConsulta;
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
	
	public Double valorConsulta() {
		Double valorConsulta = null; 
		
		if (paciente.getConsultasGratuitas() <= 0) {
			valorConsulta = psicologo.getPrecoHora() * tempoConsulta;			
		} else if (paciente.getConsultasGratuitas() > 0) {
			paciente.setConsultasGratuitas(paciente.getConsultasGratuitas() - 1);
			valorConsulta = 0.0;
		}
		
		return valorConsulta;
	}
	
}
