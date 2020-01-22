package aula12.aula12D;

public class Refrigerante extends Alimento implements Frigorifico{
	private int temp, tempMin, tempMax;
	
	public Refrigerante(String nome, double preco, double calorias, String dataValidade) {
		super(nome, preco, calorias, dataValidade);
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public void setTemp(int tempMin, int tempMax) {
		this.temp = tempMin;
		this.temp = tempMax;
	}

	@Override
	public int getTempMin() {
		return tempMin;
	}

	@Override
	public int getTempMax() {
		return tempMax;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + temp;
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
		Refrigerante other = (Refrigerante) obj;
		if (temp != other.temp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerante ["
	+ super.toString() 
	+ ", Temp Min: " + getTempMin() 
	+ ", Temp Max: " + getTempMax() + "]";
	}
}