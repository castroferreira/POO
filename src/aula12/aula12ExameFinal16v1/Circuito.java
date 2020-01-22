package aula12.aula12ExameFinal16v1;

import java.util.Arrays;

public class Circuito extends Viagem {
	private String[] cidades;
	private int duracao;

	public Circuito(String dataInicio, String[] cidades) {
		super(dataInicio);
		this.cidades = cidades;
		this.duracao = 7;
	}

	public void setDuration(int duracao) throws IllegalArgumentException {
		if (duracao < 7 || duracao > 19) {
			throw new IllegalArgumentException();
		}
		this.duracao = duracao;
	}

	public int getDuration() {
		return this.duracao;
	}

	public String[] getCidades() {
		return cidades;
	}

	public void setCidades(String[] cidades) {
		this.cidades = cidades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cidades);
		result = prime * result + duracao;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Circuito))
			return false;
		Circuito other = (Circuito) obj;
		if (!Arrays.equals(cidades, other.cidades))
			return false;
		if (duracao != other.duracao)
			return false;
		return true;
	}

	public String printLocais() {
		String res = "";
		for (int x = 0; x < cidades.length; x++) {
			res += cidades[x];
			if (x != (cidades.length - 1)) {
				res += ", ";
			}
		}
		return res;
	}

	@Override
	public String toString() {
		return "Circuito [" + getDataInicio() + "locais=[" + printLocais() + "], duration =" + getDuration() + "]";
	}
}
