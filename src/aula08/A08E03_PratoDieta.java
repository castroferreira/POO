package aula08;

import java.util.Arrays;

public class A08E03_PratoDieta extends A08E03_Prato {

	private int ingrediente = 0;
	private double totalCalorias, maxCalorias;
	private static final int DIM = 1;
	private A08E03_Alimento[] pratosDieta = new A08E03_Alimento[DIM];
	
	public A08E03_PratoDieta(String nome, double maxCalorias) {
		super(nome);
		this.maxCalorias = maxCalorias;
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

	public double getMaxCalorias() {
		return maxCalorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ingrediente;
		long temp;
		temp = Double.doubleToLongBits(maxCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(pratosDieta);
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
		A08E03_PratoDieta other = (A08E03_PratoDieta) obj;
		if (ingrediente != other.ingrediente)
			return false;
		if (Double.doubleToLongBits(maxCalorias) != Double.doubleToLongBits(other.maxCalorias))
			return false;
		if (!Arrays.equals(pratosDieta, other.pratosDieta))
			return false;
		if (Double.doubleToLongBits(totalCalorias) != Double.doubleToLongBits(other.totalCalorias))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dieta (" + getTotalCalorias() + " Calorias) Prato '" +super.toString();
	}
	
	public boolean addIngrediente(A08E03_Alimento aux) {
		boolean validar = true;
		
		if((aux.getCalorias() + getTotalCalorias()) > getMaxCalorias())
			validar = false;
		
		else{
			if(pratosDieta[0] == null){
				pratosDieta[0] = aux;
				++ingrediente;
				totalCalorias = totalCalorias + aux.getCalorias();
			}
			
			else{
				A08E03_Alimento[] addAlimento = new A08E03_Alimento[pratosDieta.length + DIM];
				
				for(int a = 0; a < pratosDieta.length; a++)
					addAlimento[a] = pratosDieta[a];
				
				addAlimento[ingrediente] = aux;
				pratosDieta = addAlimento;
				totalCalorias = totalCalorias + aux.getCalorias();
			}
		}
		return validar;
	}

}