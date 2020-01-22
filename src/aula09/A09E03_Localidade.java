package aula09;

public class A09E03_Localidade{
	
	private A09E03_TipoLocalidade tipo;
	private String nome;
	private int populacao;

	public A09E03_Localidade(String nome, int populacao, A09E03_TipoLocalidade tipo) {
		this.tipo = tipo;
		this.populacao = populacao;
		this.nome = nome;
	}

	public A09E03_TipoLocalidade getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setTipo(A09E03_TipoLocalidade tipo) {
		this.tipo = tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	@Override
	public String toString() {
		return getTipo() + " " + getNome() + ", populacao: " + getPopulacao();
	}	
	
	
}