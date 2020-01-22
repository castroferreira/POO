package aula06;

public class A06E01_AlunoPosGrad extends A06E01_Aluno {

	private A06E01_Professor orientador;
	
	public A06E01_AlunoPosGrad(String nome, int cc, A06E01_Data dataNasc, A06E01_Data dataInscr, A06E01_Professor orientador) {
		super(nome, cc, dataNasc, dataInscr);
		this.orientador = orientador;
	}

	public A06E01_AlunoPosGrad(String nome, int cc, A06E01_Data dataNasc, A06E01_Professor orientador) {
		super(nome, cc, dataNasc);
		this.orientador = orientador;
	}

	public A06E01_Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(A06E01_Professor orientador) {
		this.orientador = orientador;
	}

	@Override
	public String toString() {
		return super.toString() + orientador.toString();
	}
	
	
}