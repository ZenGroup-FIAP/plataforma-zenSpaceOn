package zen.users;

import zen.complements.Assinatura;
import zen.users.enums.TiposAssinatura;

public class Paciente extends Usuario {
	private Assinatura assinatura;
	private Integer consultasGratuitas;
	
	public Paciente() {
		
	}

	public Paciente(Integer codigoId, String nome, String senha, String email, Assinatura assinatura) {
		super(codigoId, nome, senha, email);
		this.assinatura = assinatura;
		consultasGratuitasNoMes();
	}
	
	private void consultasGratuitasNoMes() {
		if (assinatura.getTipoDeAssinatura() == TiposAssinatura.PLANO_1) {
			consultasGratuitas = 2;
		} else if (assinatura.getTipoDeAssinatura() == TiposAssinatura.PLANO_2) {
			consultasGratuitas = 3;
		} else if (assinatura.getTipoDeAssinatura() == TiposAssinatura.PLANO_3) {
			consultasGratuitas = 4;
		} else if (assinatura.getTipoDeAssinatura() == TiposAssinatura.PLANO_4) {
			consultasGratuitas = 5;
		} else {
			consultasGratuitas = 0;
		}
	}

	public Assinatura getAssinatura() {
		return assinatura;
	}

	public Integer getConsultasGratuitas() {
		return consultasGratuitas;
	}

	public void setConsultasGratuitas(Integer consultasGratuitas) {
		this.consultasGratuitas = consultasGratuitas;
	}
}
