package aula05;

public class A05E01_Bolseiro extends A05E01_Aluno {

	double bolsa;
	
	public A05E01_Bolseiro(String nome, int cc, A05E01_Data dataNasc, A05E01_Data dataInscr) {
		super(nome, cc, dataNasc, dataInscr);
	}

	public A05E01_Bolseiro(String nome, int cc, A05E01_Data dataNasc) {
		super(nome, cc, dataNasc);
	}

	public A05E01_Bolseiro(String nome, int cc, A05E01_Data dataNasc, A05E01_Data dataInscr, double bolsa) {
		super(nome, cc, dataNasc, dataInscr);
		this.bolsa = bolsa;
	}

	public A05E01_Bolseiro(String nome, int cc, A05E01_Data dataNasc, double bolsa) {
		super(nome, cc, dataNasc);
		this.bolsa = bolsa;
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return super.toString() + ", Montate da Bolsa: " + bolsa + " €";
	}
	
	
}