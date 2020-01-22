package aula06;

public abstract class A06E02_Figura {
	protected A06E02_Ponto centro;
	
	public A06E02_Figura(int x, int y){
		centro = new A06E02_Ponto(x,y);
	}

	public A06E02_Ponto getCentro() {
		return centro;
	}
	
	public void setCentro(A06E02_Ponto centro) {
		this.centro = centro;
	}
	
    @Override
    public String toString() {
        return "Figura " + "centro: " + centro;
    }

	public abstract double getArea();
	public abstract double getPerimetro();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
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
		A06E02_Figura other = (A06E02_Figura) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		return true;
	}
}