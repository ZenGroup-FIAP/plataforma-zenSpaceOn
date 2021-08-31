package zen.forms;

import java.util.Date;
import java.util.Scanner;

public class Consulta extends Formulario {
	private String desc;
	private String laudo;
	private Date data;
	private Scanner sc = new Scanner(System.in);
	
	public Consulta(String desc, String laudo, Date data, Scanner sc) {
		super();
		this.desc = desc;
		this.laudo = laudo;
		this.data = data;
		this.sc = sc;
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

	public String getLaudo() {
		return laudo;
	}

	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public void cadastrar() {
		// Fazer sistema de cadastro
		sc.close();
	}
}