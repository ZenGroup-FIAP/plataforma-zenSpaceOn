package zen.users;

import java.util.Date;

public class Psicologo extends Usuario {
	private Date horarioAtendimento;
	private double ranking;
	private double precoHora;
	private String descPerfil;
	
	public Psicologo() {
		super();
	}

	public Psicologo(Date horarioAtendimento, double ranking, double precoHora, String descPerfil) {
		super();
		this.horarioAtendimento = horarioAtendimento;
		this.ranking = ranking;
		this.precoHora = precoHora;
		this.descPerfil = descPerfil;
	}

	public Date getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(Date horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	public double getRanking() {
		return ranking;
	}

	public void setRanking(double ranking) {
		this.ranking = ranking;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public String getDescPerfil() {
		return descPerfil;
	}

	public void setDescPerfil(String descPerfil) {
		this.descPerfil = descPerfil;
	}
}
