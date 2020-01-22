package aula12.aula12ExameRecurso15;

public class quartoHotel
{
	private ROOM_TYPE Type;
	private String nome, morada;
	private double Preco, Temp;
	private int ArCond;
	
	public quartoHotel (String nome, String morada, double Preco, double Temp)
	{
		this.nome = nome;
		this.morada = morada;
		this.Preco = Preco;
		this.Temp = Temp;
	}
	
	public quartoHotel (String nome, String morada, double Preco, double Temp, ROOM_TYPE r)
	{
		this.nome = nome;
		this.morada = morada;
		this.Preco = Preco;
		this.Temp = Temp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public ROOM_TYPE getType() {
		return Type;
	}

	public void setType(ROOM_TYPE type) {
		Type = type;
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

	public int getArCond() {
		return ArCond;
	}

	public void setArCond(int arCond) {
		ArCond = arCond;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ArCond;
		long temp;
		temp = Double.doubleToLongBits(Preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(Temp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result + ((morada == null) ? 0 : morada.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		quartoHotel other = (quartoHotel) obj;
		if (ArCond != other.ArCond)
			return false;
		if (Double.doubleToLongBits(Preco) != Double.doubleToLongBits(other.Preco))
			return false;
		if (Double.doubleToLongBits(Temp) != Double.doubleToLongBits(other.Temp))
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (morada == null) {
			if (other.morada != null)
				return false;
		} else if (!morada.equals(other.morada))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Morada: " + morada + " Type: " + Type + " Preco: " + Preco + " Temp: "
				+ Temp + " ArCond: " + ArCond;
	}
}
