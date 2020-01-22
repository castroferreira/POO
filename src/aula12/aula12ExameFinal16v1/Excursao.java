package aula12.aula12ExameFinal16v1;

public class Excursao {
	private String local;
	private String dataInicio;
	private TipoExcursao tipo;

	public Excursao(String local, String dataInicio, TipoExcursao tipo) {
		this.local = local;
		this.dataInicio = dataInicio;
		this.tipo = tipo;
	}

	public Excursao(String local, String dataInicio) {
		this.local = local;
		this.dataInicio = dataInicio;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public TipoExcursao getTipo() {
		return tipo;
	}

	public void setTipo(TipoExcursao tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Excursao))
			return false;
		Excursao other = (Excursao) obj;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Excursao [getLocal()=" + getLocal() + ", getDataInicio()=" + getDataInicio() + ", getTipo()="
				+ getTipo() + "]";
	}

}
