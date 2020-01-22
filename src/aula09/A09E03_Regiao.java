package aula09;

public class A09E03_Regiao {
	private String nome;
	private int populacao;
	
	public A09E03_Regiao(String nome, int populacao) {
		this.nome = nome;
		this.populacao = populacao;
	}

	public String getNome() {
		return nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + populacao;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A09E03_Regiao other = (A09E03_Regiao) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao != other.populacao)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome + ", Populacao: " + populacao;
	}
}