package zen.complements;

import java.util.ArrayList;
import java.util.List;

import zen.forms.Consulta;

public class Agenda {
	private List<Consulta> consultasAgendadas = new ArrayList<>();
	
	public Agenda() {
		
	}

	public Agenda(List<Consulta> consultasAgendadas) {
		this.consultasAgendadas = consultasAgendadas;
	}

	public List<Consulta> getConsultasAgendadas() {
		return consultasAgendadas;
	}
	
	public void addConsulta(Consulta consulta) {
		consultasAgendadas.add(consulta);
	}
	
	public void removeConsulta(Consulta consulta) {
		consultasAgendadas.remove(consulta);
	}
}
