package aula12.aula12C;

import java.util.*;

public class Escola {
	private String nome, endereco;
	private Set<Teste> testes = new HashSet<>();
	private List<Teste> testesOrdenados = new ArrayList<>();

	public Escola(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Set<Teste> getTestes() {
		return testes;
	}

	public List<Teste> getTestesOrdenados() {
		return testesOrdenados;
	}

	public void setTestes(Set<Teste> testes) {
		this.testes = testes;
	}

	public void setTestesOrdenados(List<Teste> testesOrdenados) {
		this.testesOrdenados = testesOrdenados;
	}

	public void add(Teste t) {
		if (t instanceof TesteComputador || t instanceof ExameEscrito)
			testesOrdenados.add(t);
		
		testes.add(t);
	}
	
	public void remove(Teste t){
		if(testes.contains(t)) testes.remove(t);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((testes == null) ? 0 : testes.hashCode());
		result = prime * result + ((testesOrdenados == null) ? 0 : testesOrdenados.hashCode());
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
		Escola other = (Escola) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (testes == null) {
			if (other.testes != null)
				return false;
		} else if (!testes.equals(other.testes))
			return false;
		if (testesOrdenados == null) {
			if (other.testesOrdenados != null)
				return false;
		} else if (!testesOrdenados.equals(other.testesOrdenados))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n\nESCOLA\nNome: " + getNome() 
		+ ", Endereco: " + getEndereco() 
		+ "\nTestes\n" + getTestes();
	}
}