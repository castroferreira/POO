package aula12.aula12ExameFinal16v1;

import java.util.*;

public class Agencia {
	private String nome;
	private String endereco;

	// -- WRONG -- ERA UMA LISTA DE VIAGENS APENAS
	// private Set<Viagem> viagens = new TreeSet<>();
	// SEM TEMPO PARA ALTERAR.

	private Set<Cruzeiro> cruzeiros = new HashSet<>();
	private List<Circuito> circuitos = new ArrayList<>();
	private List<Excursao> excursoes = new ArrayList<>();

	// LISTA DE VIAGENS ------
	public Agencia(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	// -- BASTAVA VERIFICAR INSTANCEOF PARA REMOVER
	// -- SEM TEMPO PARA ALTERAR.

	public void remove(Circuito x) {
		cruzeiros.remove(x);
	}

	public List<Circuito> getCircuitos() {
		return circuitos;
	}

	public void setCircuitos(List<Circuito> circuitos) {
		this.circuitos = circuitos;
	}

	public List<Excursao> getExcursoes() {
		return excursoes;
	}

	public void setExcursoes(List<Excursao> excursoes) {
		this.excursoes = excursoes;
	}

	public void add(Cruzeiro novo) {
		cruzeiros.add(novo);
	}

	public void add(Circuito novo) {
		circuitos.add(novo);
	}

	public void add(Excursao novo) {
		excursoes.add(novo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Set<Cruzeiro> getCruzeiros() {
		return cruzeiros;
	}

	public void setCruzeiros(Set<Cruzeiro> cruzeiros) {
		this.cruzeiros = cruzeiros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cruzeiros == null) ? 0 : cruzeiros.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Agencia))
			return false;
		Agencia other = (Agencia) obj;
		if (cruzeiros == null) {
			if (other.cruzeiros != null)
				return false;
		} else if (!cruzeiros.equals(other.cruzeiros))
			return false;
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
		return true;
	}

	@Override
	public String toString() {
		return "Agencia " + getNome() + ", localizada em " + getEndereco() + "\n " + getCruzeiros() + "\n "
				+ getCircuitos() + "\n " + getExcursoes();
	}

	public int getMediaCruzeiros() {
		int dur = Cruzeiro.getDuracaoTotal();
		int res = 0;
		int n = dur;
		Iterator<Cruzeiro> itr = cruzeiros.iterator();
		while (itr.hasNext()) {
			n++;
		}
		res = res / n;
		return res;

	}
}
