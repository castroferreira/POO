package aula05;

import java.time.LocalDateTime;

public class A05E01_Data {
	int dia, mes, ano;
	
	public A05E01_Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public A05E01_Data(){
		LocalDateTime current = LocalDateTime.now();
		dia = current.getDayOfMonth();
		mes = current.getMonthValue();
		ano = current.getYear();
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	
}