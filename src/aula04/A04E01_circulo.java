package aula04;

public class A04E01_circulo {
	private String cor;
	private A04E01_ponto centro;
	private int raio;	
	
	public A04E01_circulo(int raio, A04E01_ponto centro, String cor){
		this.raio = raio;
		this.centro = centro;
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public A04E01_ponto getCentro() {
		return centro;
	}

	public void setCentro(A04E01_ponto centro) {
		this.centro = centro;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	public double area(){
		return Math.PI*Math.pow(raio,2);
	}
	
	public double perimetro(){
		return 2*Math.PI*raio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + raio;
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
		A04E01_circulo other = (A04E01_circulo) obj;
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
		if (raio != other.raio)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Raio: " + raio + "\nCentro - " + centro + "\nCor: " + cor;
	}
			
}