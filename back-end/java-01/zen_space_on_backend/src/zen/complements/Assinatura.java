package zen.complements;

import zen.users.enums.TiposAssinatura;

public class Assinatura {
	private TiposAssinatura tipoDeAssinatura;
	private Double valorAssinatura;
	
	public Assinatura() {
		
	}

	public Assinatura(TiposAssinatura tipoDeAssinatura) {
		this.tipoDeAssinatura = tipoDeAssinatura;
	}

	public TiposAssinatura getTipoDeAssinatura() {
		return tipoDeAssinatura;
	}

	public void setTipoDeAssinatura(TiposAssinatura tipoDeAssinatura) {
		this.tipoDeAssinatura = tipoDeAssinatura;
	}
	
	public Double getValorAssinatura() {
		if (tipoDeAssinatura == TiposAssinatura.PLANO_FREE) {
			valorAssinatura = 0.0;
		} else if (tipoDeAssinatura == TiposAssinatura.PLANO_1) {
			valorAssinatura = 20.0;
		} else if (tipoDeAssinatura == TiposAssinatura.PLANO_2) {
			valorAssinatura = 40.0;
		} else if (tipoDeAssinatura == TiposAssinatura.PLANO_3) {
			valorAssinatura = 60.0;
		} else if (tipoDeAssinatura == TiposAssinatura.PLANO_4) {
			valorAssinatura = 80.0;
		}	
		return valorAssinatura;
	}
	
}
