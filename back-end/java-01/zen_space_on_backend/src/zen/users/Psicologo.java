package zen.users;

import java.util.Date;

import zen.complements.Agenda;

public class Psicologo extends Usuario {
	private Date horarioAtendimento;
	private Integer ranking;
	private Double precoHora;
	private String descPerfil;
	
	public Psicologo() {
		super();
	}

	public Psicologo(Integer codigoId, String nome, String senha, String email, Date horarioAtendimento, Integer ranking,
			Double precoHora, String descPerfil) {
		super(codigoId, nome, senha, email);
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

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public Double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}

	public String getDescPerfil() {
		return descPerfil;
	}

	public void setDescPerfil(String descPerfil) {
		this.descPerfil = descPerfil;
	}

}
