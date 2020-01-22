package aula08;

public class A08E03_Carne extends A08E03_Alimento {
	A08E03_VariedadeCarne variedade;
	
	public A08E03_Carne(A08E03_VariedadeCarne variedade, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso);
		this.variedade = variedade;
	}
	public A08E03_VariedadeCarne getVariedade() {
		return variedade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((variedade == null) ? 0 : variedade.hashCode());
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
		A08E03_Carne other = (A08E03_Carne) obj;
		if (variedade != other.variedade)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return getVariedade().toString() + super.toString();
	}
}