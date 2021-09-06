package zen.users;

import zen.users.enums.Assinatura;
import zen.users.interfaces.Validavel;

public class Paciente extends Usuario implements Validavel {
	private Assinatura assinatura;
	
	public Paciente() {
		
	}

	public Paciente(Integer codigoId, String nome, String senha, String email, Assinatura assinatura) {
		super(codigoId, nome, senha, email);
		this.assinatura = assinatura;
	}

	public Assinatura getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(Assinatura assinatura) {
		this.assinatura = assinatura;
	}

	@Override
	public void validar(String cpf) {
		// VALIDAÇÃO DO CPF	
	}
}
