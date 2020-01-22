package aula08;

import java.util.Arrays;

public class A08E03_PratoVegetariano extends A08E03_Prato {

	private int ingrediente = 0;
	private double totalCalorias;
	private static final int DIM = 1;
	private A08E03_Alimento[] pratosVegetarianos = new A08E03_Alimento[DIM];
	
	public A08E03_PratoVegetariano(String nome) {
		super(nome);
	}

	public int getIngrediente() {
		return ingrediente;
	}

	public double getTotalCalorias() {
		return totalCalorias;
	}

	public void setTotalCalorias(double totalCalorias) {
		this.totalCalorias = totalCalorias;
	}

	public A08E03_Alimento[] getPratosVegetarianos() {
		return pratosVegetarianos;
	}
	
	@Override
	public String toString() {
		return "Vegetariano Prato '" +super.toString();
	}
	
	public boolean addIngrediente(A08E03_Alimento aux) {
		boolean validar = false;
		
		if(aux instanceof A08E03_AlimentoVegeteriano){
			validar = true;
		
			if(pratosVegetarianos[0] == null){
				pratosVegetarianos[0] = aux;
				++ingrediente;
				totalCalorias = totalCalorias + aux.getCalorias();
			}
			
			else{
				A08E03_Alimento[] addAlimento = new A08E03_Alimento[pratosVegetarianos.length + DIM];
				
				for(int a = 0; a < pratosVegetarianos.length; a++)
					addAlimento[a] = pratosVegetarianos[a];
				
				addAlimento[ingrediente] = aux;
				pratosVegetarianos = addAlimento;
				totalCalorias = totalCalorias + aux.getCalorias();
				++ingrediente;
			}
		}
		return validar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ingrediente;
		result = prime * result + Arrays.hashCode(pratosVegetarianos);
		long temp;
		temp = Double.doubleToLongBits(totalCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		A08E03_PratoVegetariano other = (A08E03_PratoVegetariano) obj;
		if (ingrediente != other.ingrediente)
			return false;
		if (!Arrays.equals(pratosVegetarianos, other.pratosVegetarianos))
			return false;
		if (Double.doubleToLongBits(totalCalorias) != Double.doubleToLongBits(other.totalCalorias))
			return false;
		return true;
	}
}