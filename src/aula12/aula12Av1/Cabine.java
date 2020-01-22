package aula12.aula12Av1;

import java.util.Arrays;

public abstract class Cabine implements Comparable<Object>{
	private int id=0, capacidadeMax=0;
	private String[] listaOcupantes = new String[0];
	
	public Cabine(int id, int capacidadeMax){
		this.id = id;
		this.capacidadeMax = capacidadeMax;
	}

	public int getId() {
		return id;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}

	public String[] getListaOcupantes() {
		return listaOcupantes;
	}

	public void setListaOcupantes(String[] listaOcupantes) {
		this.listaOcupantes = listaOcupantes;
	}

	public void SetPassageiros(String[] passageiros) throws IllegalArgumentException
	{
		if(passageiros.length > capacidadeMax) throw new IllegalArgumentException();
		this.listaOcupantes = passageiros;
	}
	
	/**Para verificar se esta vazia ou ocupada*/
	public boolean disponibilidade(){
		return listaOcupantes.length == 0;
	}
	
	/**Ordenacao por numero da cabine*/
	@Override
	public int compareTo(Object c) {
		Cabine nextCabine = (Cabine) c;
		return this.getId() - nextCabine.getId();
	}
	
	@Override
	public String toString() {
		String output = "";

		output += " [ Nº" +this.id+ "( max " +capacidadeMax+ " pessoas ) : [";
		//lista de ocupantes
		if(this.listaOcupantes.length == 0)
			output += "Disponível para venda!";
		else
			for(int i = 0; i < listaOcupantes.length; i++){
				output += listaOcupantes[i];
				
				if(i != (listaOcupantes.length - 1))
					output += ", ";
			}
		output += "]]";
		return output;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidadeMax;
		result = prime * result + id;
		result = prime * result + Arrays.hashCode(listaOcupantes);
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
		Cabine other = (Cabine) obj;
		if (capacidadeMax != other.capacidadeMax)
			return false;
		if (id != other.id)
			return false;
		if (!Arrays.equals(listaOcupantes, other.listaOcupantes))
			return false;
		return true;
	}

	public int getOcup() {
		return listaOcupantes.length;
	}

	// Verificar de vazia ou ocupada
	public boolean vazia() {
		return listaOcupantes.length == 0;
	}

}