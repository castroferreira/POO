package aula09;

public class A09E03_Provincia extends A09E03_Regiao {

	private String governador;
	
	public A09E03_Provincia(String nome, int populacao, String governador) {
		super(nome, populacao);
		this.governador = governador;
	}

	public String getGovernador() {
		return governador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((governador == null) ? 0 : governador.hashCode());
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
		A09E03_Provincia other = (A09E03_Provincia) obj;
		if (governador == null) {
			if (other.governador != null)
				return false;
		} else if (!governador.equals(other.governador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Provincia: " + super.toString() + ", Governador: " + governador;
	}
	
	
}