package zen.users;

import java.util.Scanner;

public abstract class Usuario {
	private int codigoId;
	private String nome;
	private String senha;
	private String email;
	private Scanner sc = new Scanner(System.in);
	
	public int getCodigoId() {
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
	
	// Método cadastrar usuario
	public void cadastrar() {
		
		
		System.out.print("INFORME O NOME: ");
		String nome = sc.next();
		this.setNome(nome);
		
		System.out.print("INFORME A SENHA: ");
		String senha = sc.next();
		this.setSenha(senha);
		
		System.out.print("INFORME O EMAIL: ");
		String email = sc.next();
		this.setEmail(email);
	}
}
