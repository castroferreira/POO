package aula05;

public class A05E02_quadrado {
	private String cor;
	private int lado;
	private A05E02_ponto centro;
	
	public A05E02_quadrado(int lado, A05E02_ponto centro, String cor){
		this.lado = lado;
		this.centro = centro;
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public double area(){
		return lado*lado;
	}
	
	public double perimetro(){
		return 4*lado;
	}

	public A05E02_ponto getCentro() {
		return centro;
	}

	public void setCentro(A05E02_ponto centro) {
		this.centro = centro;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + lado;
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
		A05E02_quadrado other = (A05E02_quadrado) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (lado != other.lado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lado: " + lado + "\nCentro - " + centro + "\nCor: " + cor;
	}
	
	
}