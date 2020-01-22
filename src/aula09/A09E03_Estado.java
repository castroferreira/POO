package aula09;

public class A09E03_Estado extends A09E03_Regiao {

	private A09E03_Localidade capital;
	
	public A09E03_Estado(String nome, int populacao, A09E03_Localidade capital) {
		super(nome, populacao);
		capitalValida(capital);
	}
	
	public void capitalValida(A09E03_Localidade capital){
		if (!capital.getTipo().equals(A09E03_TipoLocalidade.Cidade))
			throw new IllegalArgumentException("Capital Inválida");
		
		this.capital = capital;
	}

	public A09E03_Localidade getCapital() {
		return capital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
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
		A09E03_Estado other = (A09E03_Estado) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estado: " + super.toString() + ", (Capital: " + getCapital();	}

	
}