package aula12.aula12ExameRecurso15;

public class Agencia
{
	private String nome, morada;
	private Carro c;
	private Apartamento ap;
	private quartoHotel qh;
	private quartoHostal qhostal;
	
	public Agencia(String nome, String morada)
	{
		this.nome = nome;
		this.morada = morada;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Agencia other = (Agencia) obj;
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
		return "Nome: " + nome + " Morada: " + morada;
	}

	public void add(quartoHotel qh) {this.qh = qh;}

	public void add(Apartamento ap) {this.ap = ap;}

	public void add(quartoHostal qhostal) {this.qhostal = qhostal;}

	public void add(Carro c) {this.c = c;}	
}
