package aula12.aula12D;

public class Lacteo extends Alimento implements Frigorifico{
	private double gordura;
	private int temp, tempMin, tempMax;
	
	public Lacteo(String nome, double preco, double calorias, String dataValidade) {
		super(nome, preco, calorias, dataValidade);
	}
	
	public Lacteo(String nome, double preco, double calorias, String dataValidade, double gordura) {
		super(nome, preco, calorias, dataValidade);
		this.gordura = gordura;
	}

	public double getGordura() {
		return gordura;
	}

	public int getTemp() {
		return temp;
	}

	public void setGordura(double gordura) {
		this.gordura = gordura;
	}

	public void setTemp(int tempMin, int tempMax) {
		this.temp = tempMin;
		this.temp = tempMax;
	}
	

	public int getTempMin() {
		return tempMin;
	}

	public int getTempMax() {
		return tempMax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(gordura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + this.temp;
		result = prime * result + tempMax;
		result = prime * result + tempMin;
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
		Lacteo other = (Lacteo) obj;
		if (Double.doubleToLongBits(gordura) != Double.doubleToLongBits(other.gordura))
			return false;
		if (temp != other.temp)
			return false;
		if (tempMax != other.tempMax)
			return false;
		if (tempMin != other.tempMin)
			return false;
		return true;
	}

	public String toString() {
		return "Lacteo [" 
	+ super.toString()
	+"Teor Gordura: " + gordura 
	+ ", Temperatura Minima: " + tempMin 
	+ ", Temperatura Maxima: " + tempMax +"]";
	}
}