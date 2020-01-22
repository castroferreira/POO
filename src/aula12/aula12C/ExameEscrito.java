package aula12.aula12C;

public class ExameEscrito extends Teste implements Comparable<ExameEscrito>{
	private int versoes, prazo;
	private boolean consulta;
	
	public ExameEscrito(String nomeDisciplina, String profResponsavel, String data_hora, String salas) {
		super(nomeDisciplina, profResponsavel, data_hora, salas);
	}
	
	public ExameEscrito(String nomeDisciplina, String profResponsavel, String data_hora, String salas, int versoes) {
		super(nomeDisciplina, profResponsavel, data_hora, salas);
		this.versoes = versoes;
	}

	public int getVersoes() {
		return versoes;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setVersoes(int versoes) {
		this.versoes = versoes;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public boolean isConsulta() {
		return consulta;
	}

	public void setConsulta(boolean consulta) {
		this.consulta = consulta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (consulta ? 1231 : 1237);
		result = prime * result + prazo;
		result = prime * result + versoes;
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
		ExameEscrito other = (ExameEscrito) obj;
		if (consulta != other.consulta)
			return false;
		if (prazo != other.prazo)
			return false;
		if (versoes != other.versoes)
			return false;
		return true;
	}

	@Override
	public int compareTo(ExameEscrito e) {
		return this.getPrazo() - e.getPrazo();
	}

	@Override
	public String toString() {
		return "\n-- Exame Escrito \nConsulta: " + isConsulta() 
		+ ", Versao " + getVersoes() 
		+ ", Prazo: " + getPrazo() 
		+ super.toString();
	}
}