package aula07;
import static java.lang.System.*;

import aula05.A05E01_Data;
import aula05.A05E01_Pessoa;

public class A07E02_Classe123 extends A05E01_Pessoa implements A07E02_IDemo123{

	public A07E02_Classe123(String nome, int cc, A05E01_Data dataNasc) {
		super(nome, cc, dataNasc);
	}

	public void metodoIDemo1_1(){
		out.println("Metodo IDemo1 - 1");
	}
	
	public void metodoIDemo1_2(){
		out.println("Metodo IDemo1 - 2");
	}

	public void metodoIDemo2_1(){
		out.println("Metodo IDemo2 - 1");
	}
	
	public void metodoIDemo2_2(){
		out.println("Metodo IDemo2 - 2");
	}

	public void metodoIDemo3_1(){
		out.println("Metodo IDemo3 - 1");
	}
	
	public void metodoIDemo3_2(){
		out.println("Metodo IDemo3 - 2");
	}
	
	
	public void metodoIDemo123(){
		out.println("Metodo IDemo123");
	}
}