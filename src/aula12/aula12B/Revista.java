package aula12.aula12B;

public class Revista extends Publicacao {
	private String ISSN;
	private	Period periodicidade;
	
	public Revista(String titulo, String editora, String ISSN) {
		super(titulo, editora);
		this.ISSN = ISSN;
	}
	
	public Revista(String titulo, String editora, String ISSN, Period periodicidade) {
		super(titulo, editora);
		this.ISSN = ISSN;
		this.periodicidade = periodicidade;
	}

	public String getISSN() {
		return ISSN;
	}

	public Period getPeriodicidade() {
		return periodicidade;
	}

	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}

	public void setPeriodicidade(Period periodicidade) {
		this.periodicidade = periodicidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ISSN == null) ? 0 : ISSN.hashCode());
		result = prime * result + ((periodicidade == null) ? 0 : periodicidade.hashCode());
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
		Revista other = (Revista) obj;
		if (ISSN == null) {
			if (other.ISSN != null)
				return false;
		} else if (!ISSN.equals(other.ISSN))
			return false;
		if (periodicidade != other.periodicidade)
			return false;
		return true;
	}
}