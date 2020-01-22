package aula05;

public class A05E01_Aluno extends A05E01_Pessoa {

	static int cont = 100;
	final int nmec;
	A05E01_Data dataInscr;
	
	public A05E01_Aluno(String nome, int cc, A05E01_Data dataNasc, A05E01_Data dataInscr) {
		super(nome, cc, dataNasc);
		this.nmec = cont;
		this.dataInscr = dataInscr;
		cont++;
	}
	
	public A05E01_Aluno(String nome, int cc, A05E01_Data dataNasc) {
		super(nome, cc, dataNasc);
		this.nmec = cont;
		cont++;
	}

	public int getNmec() {
		return nmec;
	}

	@Override
	public String toString() {
		return super.toString() + ", Nmec: " + nmec + ", Data de Inscricao: " + dataInscr;
	}
	
}