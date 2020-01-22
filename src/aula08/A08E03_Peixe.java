package aula08;

public class A08E03_Peixe extends A08E03_Alimento {
	private A08E03_TipoPeixe tipo;
	
	public A08E03_Peixe(A08E03_TipoPeixe tipo, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		this.tipo = tipo;
	}

	public A08E03_TipoPeixe getTipo() {
		return tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		A08E03_Peixe other = (A08E03_Peixe) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return getTipo().toString() + super.toString();
	}
}