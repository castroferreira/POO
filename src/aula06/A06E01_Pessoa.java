package aula06;

public class A06E01_Pessoa {
	String nome;
	int cc;
	A06E01_Data dataNasc;
	
	public A06E01_Pessoa(String nome, int cc, A06E01_Data dataNasc){
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public A06E01_Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(A06E01_Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", CC: " + cc + ", Data de Nascimento: " + dataNasc;
	}
	
	
}