package zen.users;

import java.util.Scanner;

import zen.complements.Agenda;

public abstract class Usuario {
	private Integer codigoId;
	private String nome;
	private String senha;
	private String email;
	private Agenda agenda = new Agenda();
	private Scanner sc = new Scanner(System.in);
	
	public Usuario() {
		
	}
	
	public Usuario(Integer codigoId, String nome, String senha, String email) {
		super();
		this.codigoId = codigoId;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}

	public Integer getCodigoId() {
		return codigoId;
	}
	
	public void setCodigoId(int codigoId) {
		this.codigoId = codigoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Agenda getAgenda() {
		return agenda;
	}
}
