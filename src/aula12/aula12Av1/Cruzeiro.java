package aula12.aula12Av1;

import java.util.*;

public class Cruzeiro {
	private String nomeNavio, dataInicio;
	private String[] cidades;
	private int duracao;
	private Set<Cabine> conjuntoCabines = new TreeSet<Cabine>();
	
	public Cruzeiro(String nomeNavio, String[] cidades, String dataInicio) {
		this.nomeNavio = nomeNavio;
		this.cidades = cidades;
		this.dataInicio = dataInicio;
	}
		
	public String getNomeNavio() {
		return nomeNavio;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String[] getCidades() {
		return cidades;
	}

	public int getDuracao() {
		return duracao;
	}

	public Set<Cabine> getConjuntoCabines() {
		return conjuntoCabines;
	}
	
	public void setNomeNavio(String nomeNavio) {
		this.nomeNavio = nomeNavio;
	}
	
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setCidades(String[] cidades) {
		this.cidades = cidades;
	}

	public void setConjuntoCabines(Set<Cabine> conjuntoCabines) {
		this.conjuntoCabines = conjuntoCabines;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void add(Cabine cabine) {
		conjuntoCabines.add(cabine);
	}
	
	// Calculo de cabines ocupadas(%)
	public double getCabOcupadas() {
		// Contar Cabines (Nao Vazias -> Ocupadas)
		double res = 0;
		Iterator<Cabine> iterator = conjuntoCabines.iterator();
		while (iterator.hasNext()) {
			Cabine x = iterator.next();
			if (!(x.vazia()))
				res++;
			;
		}
		// Calcular % com numTotal de cabines
		res = (res / conjuntoCabines.size()) * 100.0;
		return res;
	}
	
	// Calculo de ocupaçao media das cabines
	public int getMedOcupadas() {
		int res = 0;
		int n = 0;
		// Contar ocupantes de cabines nao vazias, e total cabines nao vazias
		Iterator<Cabine> iterator = conjuntoCabines.iterator();
		while (iterator.hasNext()) {
			Cabine x = iterator.next();
			if (!(x.vazia()))
				res += x.getOcup();
				n++;
			;
		}
		// Calculo da media
		res = res / n;
		return res;
	}

	// toString apenas das Cabines Ocupadas (Sem informação do navio)
	public String CabinesOcupToString() {
		String res = "";
		Iterator<Cabine> iterator = conjuntoCabines.iterator();
		while (iterator.hasNext()) {
			Cabine x = iterator.next();
			if (!(x.vazia())) {
				res += x.toString() + "\n";
			}
			;
		}
		return res;
	}

	@Override
	public String toString() {
		String res = "";
		// Info do Navio
		res += "Navio " + nomeNavio + ", partida em " + dataInicio + "\n";
		res += "Itinerário: [";
		for (int x = 0; x < cidades.length; x++) {
			res += cidades[x];
			if (x != (cidades.length - 1)) {
				res += ", ";
			}
		}
		res += "]\n";

		// Info de cada cabine
		Iterator<Cabine> iterator = conjuntoCabines.iterator();
		while (iterator.hasNext()) {
			Cabine x = iterator.next();
			res += x.toString() + "\n";
		}

		return res;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cidades);
		result = prime * result + ((conjuntoCabines == null) ? 0 : conjuntoCabines.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + duracao;
		result = prime * result + ((nomeNavio == null) ? 0 : nomeNavio.hashCode());
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
		Cruzeiro other = (Cruzeiro) obj;
		if (!Arrays.equals(cidades, other.cidades))
			return false;
		if (conjuntoCabines == null) {
			if (other.conjuntoCabines != null)
				return false;
		} else if (!conjuntoCabines.equals(other.conjuntoCabines))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (duracao != other.duracao)
			return false;
		if (nomeNavio == null) {
			if (other.nomeNavio != null)
				return false;
		} else if (!nomeNavio.equals(other.nomeNavio))
			return false;
		return true;
	}

	public void add(Suite s) {		
	}
}