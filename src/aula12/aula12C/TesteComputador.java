package aula12.aula12C;

public class TesteComputador extends Teste implements Comparable<TesteComputador>{
	private String link;
	private int prazo;
	
	public TesteComputador(String nomeDisciplina, String profResponsavel, String data_hora, String salas) {
		super(nomeDisciplina, profResponsavel, data_hora, salas);
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + prazo;
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
		TesteComputador other = (TesteComputador) obj;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (prazo != other.prazo)
			return false;
		return true;
	}

	@Override
	public int compareTo(TesteComputador t) {
		int comparar = 0;
		if(this.getPrazo() == t.getPrazo()) comparar = 0;
		else if(this.getPrazo() < t.getPrazo())comparar = -1;
		return comparar;
	}
	
	@Override
	public String toString() {
		return "-- Teste Computador " + getLink() 
		+ ", Prazo: " + getPrazo()
		+ super.toString();
	}

}