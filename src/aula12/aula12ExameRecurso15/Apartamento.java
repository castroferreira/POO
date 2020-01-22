package aula12.aula12ExameRecurso15;

public class Apartamento extends Agencia
{
	private double Preco, Temp;
	private boolean Cozinha;
	private int ArCond;

	public Apartamento(String nome, String morada, double Preco, double Temp, int ArCond) 
	{
		super(nome, morada);
		this.Preco = Preco;
		this.Temp = Temp;
		this.ArCond = ArCond;
	}
	
	public Apartamento(String nome, String morada, double Preco, double Temp, int ArCond, boolean Cozinha) 
	{
		super(nome, morada);
		this.Preco = Preco;
		this.Temp = Temp;
		this.ArCond = ArCond;
		this.Cozinha = Cozinha;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public double getTemp() {
		return Temp;
	}

	public void setTemp(double temp) {
		Temp = temp;
	}

	public boolean isCozinha() {
		return Cozinha;
	}

	public void setCozinha(boolean cozinha) {
		Cozinha = cozinha;
	}

	public int getArCond() {
		return ArCond;
	}

	public void setArCond(int ArCond) {
		ArCond = ArCond;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (Cozinha ? 1231 : 1237);
		result = prime * result + ArCond;
		long temp;
		temp = Double.doubleToLongBits(Preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Temp);
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
		Apartamento other = (Apartamento) obj;
		if (Cozinha != other.Cozinha)
			return false;
		if (ArCond != other.ArCond)
			return false;
		if (Double.doubleToLongBits(Preco) != Double.doubleToLongBits(other.Preco))
			return false;
		if (Double.doubleToLongBits(Temp) != Double.doubleToLongBits(other.Temp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Preco: " + Preco + " Temp: " + Temp + " Cozinha: " + Cozinha + " Ar Condicionado: " + ArCond;
	}

	public void on() {}	
}
