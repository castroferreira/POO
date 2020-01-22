package aula12.aula12C;

public class ProvaOral extends Teste {
	private Lingua lingua;
	
	public ProvaOral(String nomeDisciplina, String profResponsavel, String data_hora, String salas) {
		super(nomeDisciplina, profResponsavel, data_hora, salas);
	}
	
	public ProvaOral(String nomeDisciplina, String profResponsavel, String data_hora, String salas, Lingua lingua) {
		super(nomeDisciplina, profResponsavel, data_hora, salas);
		this.lingua = lingua;
	}

	public Lingua getLingua() {
		return lingua;
	}

	public void setLingua(Lingua lingua) {
		this.lingua = lingua;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((lingua == null) ? 0 : lingua.hashCode());
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
		ProvaOral other = (ProvaOral) obj;
		if (lingua != other.lingua)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "\n-- Prova Oral " + getLingua() 
		+ super.toString();
	}
}