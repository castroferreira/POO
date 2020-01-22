package aula12.aula12D;

public class Alimento {
	private String nome, dataValidade;
	private double preco, calorias;
	
	public Alimento(String nome, double preco, double calorias, String dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.calorias = calorias;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public double getPreco() {
		return preco;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dataValidade == null) ? 0 : dataValidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Alimento other = (Alimento) obj;
		if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
			return false;
		if (dataValidade == null) {
			if (other.dataValidade != null)
				return false;
		} else if (!dataValidade.equals(other.dataValidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome()
		+ ", Preco: " + getPreco() 
		+ ", Calorias: "+getCalorias();
	}	
}