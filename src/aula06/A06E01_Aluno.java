package aula06;

public class A06E01_Aluno extends A06E01_Pessoa {

	static int cont = 100;
	final int nmec;
	A06E01_Data dataInscr;
	
	public A06E01_Aluno(String nome, int cc, A06E01_Data dataNasc, A06E01_Data dataInscr) {
		super(nome, cc, dataNasc);
		this.nmec = cont;
		this.dataInscr = dataInscr;
		cont++;
	}
	
	public A06E01_Aluno(String nome, int cc, A06E01_Data dataNasc) {
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