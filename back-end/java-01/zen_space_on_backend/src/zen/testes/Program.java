package zen.testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import zen.complements.Assinatura;
import zen.forms.Consulta;
import zen.forms.Laudo;
import zen.users.Paciente;
import zen.users.Psicologo;
import zen.users.enums.TiposAssinatura;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		Paciente paciente = new Paciente(111, "Matheus Feitosa Silva", "123456", "matheus@mail.com", new Assinatura(TiposAssinatura.PLANO_1));
		System.out.println("Paciente tem " + paciente.getConsultasGratuitas() + " consultas gratuitas!");
		System.out.println();
		Psicologo psicologo = new Psicologo(211, "Willian Machado", "4321", "will@mail.com", sdf.parse("15:00:00"), 10, 100.0, "Profissional");
		
		Consulta consulta = new Consulta(paciente, psicologo, 311, "Paciente desestabilizado por causa do Java", new Laudo(paciente, psicologo, "Ansiedade", "Meditação 1 vez ao dia"), sdf2.parse("28/07/2021"), 2.5);
		System.out.println("Dados da consulta:");
		System.out.println("ID da consulta: " + consulta.getIdFormulario());
		System.out.println("Paciente: " + paciente.getNome());
		System.out.println("Psicólogo: " + psicologo.getNome());
		System.out.println("Tempo de duração da consulta: " + consulta.getTempoConsulta() + " horas");
		System.out.println("Valor da consulta: $" + consulta.valorConsulta());
		System.out.println("Diagnóstico: " + consulta.getLaudo().getDiagnostico());
		System.out.println("Tratamento: " + consulta.getLaudo().getTratamento());
		
		System.out.println();
		System.out.println("Paciente tem " + paciente.getConsultasGratuitas() + " consultas gratuitas!");
	
	}

}
