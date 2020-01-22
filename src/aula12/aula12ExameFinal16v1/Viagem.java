package aula12.aula12ExameFinal16v1;

public abstract class Viagem implements Comparable<Viagem> {
	private String dataInicio;

	public Viagem(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Viagem))
			return false;
		Viagem other = (Viagem) obj;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		return true;
	}

	@Override
	public int compareTo(Viagem outra) {
		return outra.dataInicio.compareTo(this.dataInicio);
	}

	@Override
	public String toString() {
		return "Viagem [getDataInicio()=" + getDataInicio() + "]";
	}

}
