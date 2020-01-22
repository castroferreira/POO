package aula12.aula12C;

public class Teste {
	private String nomeDisciplina, profResponsavel, data_hora, salas;
	
	public Teste(String nomeDisciplina, String profResponsavel, String data_hora, String salas) {
		this.nomeDisciplina = nomeDisciplina;
		this.profResponsavel = profResponsavel;
		this.data_hora = data_hora;
		this.salas = salas;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public String getProfResponsavel() {
		return profResponsavel;
	}

	public String getData_hora() {
		return data_hora;
	}

	public String getSalas() {
		return salas;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public void setProfResponsavel(String profResponsavel) {
		this.profResponsavel = profResponsavel;
	}

	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}

	public void setSalas(String salas) {
		this.salas = salas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_hora == null) ? 0 : data_hora.hashCode());
		result = prime * result + ((nomeDisciplina == null) ? 0 : nomeDisciplina.hashCode());
		result = prime * result + ((profResponsavel == null) ? 0 : profResponsavel.hashCode());
		result = prime * result + ((salas == null) ? 0 : salas.hashCode());
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
		Teste other = (Teste) obj;
		if (data_hora == null) {
			if (other.data_hora != null)
				return false;
		} else if (!data_hora.equals(other.data_hora))
			return false;
		if (nomeDisciplina == null) {
			if (other.nomeDisciplina != null)
				return false;
		} else if (!nomeDisciplina.equals(other.nomeDisciplina))
			return false;
		if (profResponsavel == null) {
			if (other.profResponsavel != null)
				return false;
		} else if (!profResponsavel.equals(other.profResponsavel))
			return false;
		if (salas == null) {
			if (other.salas != null)
				return false;
		} else if (!salas.equals(other.salas))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "\n " + getNomeDisciplina() 
		+ " " + getProfResponsavel() 
		+ " " + getSalas() 
		+ " " + getData_hora()+"\n";
	}

}