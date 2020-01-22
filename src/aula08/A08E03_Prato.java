package aula08;

import java.util.Arrays;

public class A08E03_Prato implements Comparable<A08E03_Prato>{
	
	private String nome;
	private A08E03_DiaSemana dia;
	private int ingrediente = 0;
	private double totalCalorias;
	private static final int DIM = 1;
	private A08E03_Alimento[] pratos = new A08E03_Alimento[DIM];
	
	public A08E03_Prato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public A08E03_DiaSemana getDia() {
		return dia;
	}

	public void setDia(A08E03_DiaSemana dia) {
		this.dia = dia;
	}

	public int getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(int ingrediente) {
		this.ingrediente = ingrediente;
	}

	public double getMaxCalorias() {
		return totalCalorias;
	}

	public void setMaxCalorias(double maxCalorias) {
		this.totalCalorias = maxCalorias;
	}

	public A08E03_Alimento[] getPratos() {
		return pratos;
	}

	public void setPratos(A08E03_Alimento[] pratos) {
		this.pratos = pratos;
	}
	
	@Override
	public int compareTo(A08E03_Prato prato) {
		int comparar = 0;
		
		if(this.getMaxCalorias() == prato.getMaxCalorias()) comparar = 0;
		else if(this.getMaxCalorias() < prato.getMaxCalorias()) comparar = -1;
		else if(this.getMaxCalorias() > prato.getMaxCalorias())	comparar = 1;
		
		return comparar;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dia == null) ? 0 : dia.hashCode());
		result = prime * result + ingrediente;
		long temp;
		temp = Double.doubleToLongBits(totalCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Arrays.hashCode(pratos);
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
		A08E03_Prato other = (A08E03_Prato) obj;
		if (dia != other.dia)
			return false;
		if (ingrediente != other.ingrediente)
			return false;
		if (Double.doubleToLongBits(totalCalorias) != Double.doubleToLongBits(other.totalCalorias))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(pratos, other.pratos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getNome() + "' composto por " + getIngrediente() + " Ingredientes";
	}

	public boolean addIngrediente(A08E03_Alimento aux) {
		if(pratos[0] == null){
			pratos[0] = aux;
			++ingrediente;
			totalCalorias = totalCalorias + aux.getCalorias();
		}
		
		else{
			A08E03_Alimento[] addAlimento = new A08E03_Alimento[pratos.length + DIM];
			
			for(int a = 0; a < pratos.length; a++)
				addAlimento[a] = pratos[a];
			
			addAlimento[ingrediente] = aux;
			pratos = addAlimento;
			totalCalorias = totalCalorias + aux.getCalorias();
		}
		return true;
	}
}