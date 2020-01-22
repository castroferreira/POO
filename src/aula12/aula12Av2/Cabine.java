package aula12.aula12Av2;

import java.util.*;

public abstract class Cabine implements Comparable<Cabine>{
	private int id=0, capacidadeMax=0;
	private String[] listaOcupantes = new String[0];
	public boolean vendida;
	
	public Cabine(int id, int capacidadeMax){
		this.id = id;
		this.capacidadeMax = capacidadeMax;
	}

	public boolean getVendida() {
		return this.vendida;
	}

	public void setMaxOcupantes(int i) {
		this.capacidadeMax = i;
	}

	public int getNumeroOcupantes() {
		if (this.vendida) {
			return this.listaOcupantes.length;
		} else {
			return 0;
		}
	}

	public void setPassageiros(String[] split) throws IllegalArgumentException {
		if (split.length > capacidadeMax) {
			throw new IllegalArgumentException();
		} else {
			this.listaOcupantes = split;
			this.vendida = true;
		}
	}

	public int getNumero() {
		return this.id;
	}

	public int getCapacidade() {
		return this.capacidadeMax;
	}

	public String quantasPessoas() {
		if (this.sortOcupantes().isEmpty()) {
			return "pessoas ) : Não vendida !]";
		}
		if (this.getCapacidade() > 1) {
			return "pessoas ) : " + this.sortOcupantes() + "]";
		} else {
			return "pessoa ) : " + this.sortOcupantes() + "]";
		}
	}

	public Set<String> sortOcupantes() {
		Set<String> set = new TreeSet<>();
		if (this.getVendida()) {
			for (String s : this.listaOcupantes) {
				set.add(s);
			}
		}
		return set;
	}

	public String toString() {
		this.sortOcupantes();
		return "[ Nº" + this.getNumero()
		+ "(max " + this.getCapacidade() 
		+ " " + this.quantasPessoas();
	}

	@Override
	public int compareTo(Cabine o) {
		return this.getNumero() - o.getNumero();
	}
}