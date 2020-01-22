package aula12.aula12Av2;

import java.util.*;

public class Cruzeiro {
	private String nomeNavio, dataInicio;
	private String[] cidades;
	private int duracao;
	private List<Cabine> conjuntoCabines = new ArrayList<Cabine>();
	
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
	
	public void setNomeNavio(String nomeNavio) {
		this.nomeNavio = nomeNavio;
	}
	
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setCidades(String[] cidades) {
		this.cidades = cidades;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void add(Cabine cabine) {
		conjuntoCabines.add(cabine);
	}
	
	public List<Cabine> getConjuntoCabines() {
		return conjuntoCabines;
	}

	public void setConjuntoCabines(List<Cabine> conjuntoCabines) {
		this.conjuntoCabines = conjuntoCabines;
	}

	public void sortCabines() {
		Collections.sort(conjuntoCabines);
	}

	public int countLotacao() {
		int contador = 0;
		for (Cabine c : this.conjuntoCabines) {
			contador += c.getCapacidade();
		}

		return contador;
	}

	public int ocupacaoReal() {
		int contador = 0;
		for (Cabine c : this.conjuntoCabines) {
			contador += c.getNumeroOcupantes();
		}
		return contador;
	}

	public String toString() {
		this.sortCabines();
		String sb = "Navio " + this.nomeNavio + ", partida em " + this.dataInicio + "\n";
		sb += "PONTO DE SITUÇÃO DE VENDAS:\n";
		sb += "Itinerário:" + Arrays.toString(this.cidades) + "\n";
		for (Cabine s : conjuntoCabines) {
			sb += s.toString() + "\n";
		}
		return sb;
	}
}