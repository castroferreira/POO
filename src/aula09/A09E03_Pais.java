package aula09;
import java.util.*;

public class A09E03_Pais implements Comparable<A09E03_Pais>{
	private String nome;
	private A09E03_Localidade capital;
	private Set<A09E03_Regiao> conjuntoRegioes = new HashSet<>();
	private int populacaoTotal = 0;
	
	public A09E03_Pais(String nome, A09E03_Localidade capital){
		this.nome = nome;
		capitalValida(capital);
	}
	
	public void capitalValida(A09E03_Localidade capital){
		if (!capital.getTipo().equals(A09E03_TipoLocalidade.Cidade))
			throw new IllegalArgumentException("Capital Inválida");
		
		this.capital = capital;
	}
	
	public A09E03_Pais(String nome){
		this.nome = nome;
	}

	public int getPopulacaoTotal() {
		return populacaoTotal;
	}

	public String getNome() {
		return nome;
	}

	public A09E03_Localidade getCapital() {
		return capital;
	}

	public Set<A09E03_Regiao> getConjuntoRegioes() {
		return conjuntoRegioes;
	}

	public void addRegiao(A09E03_Regiao regiao) {
		if (!conjuntoRegioes.contains(regiao)) {
			conjuntoRegioes.add(regiao);
			populacaoTotal = populacaoTotal + regiao.getPopulacao();
		}
	}
	
	public void removerRegiao(A09E03_Regiao regiao) {
		if (conjuntoRegioes.contains(regiao)) {
			conjuntoRegioes.remove(regiao);
			populacaoTotal = populacaoTotal - regiao.getPopulacao();
		}
	}

	@Override
	public int compareTo(A09E03_Pais p) {
		int comparar = 0;
		if (this.getPopulacaoTotal() == p.getPopulacaoTotal()) comparar = 0;
		else if (this.getPopulacaoTotal() < p.getPopulacaoTotal()) comparar = -1;
		else if (this.getPopulacaoTotal() > p.getPopulacaoTotal()) comparar = 1;
		
		return comparar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((conjuntoRegioes == null) ? 0 : conjuntoRegioes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + populacaoTotal;
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
		A09E03_Pais other = (A09E03_Pais) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (conjuntoRegioes == null) {
			if (other.conjuntoRegioes != null)
				return false;
		} else if (!conjuntoRegioes.equals(other.conjuntoRegioes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacaoTotal != other.populacaoTotal)
			return false;
		return true;
	}

	@Override
	public String toString() {
		if (capital != null)
			return "Pais: " + getNome() + ", População: " + getPopulacaoTotal() + ", (Capital: " + getCapital() + ")";
		else
			return "Pais: " + getNome() + ", População: " + getPopulacaoTotal() + ", (Capital: *Indefinida*)";
	}
}