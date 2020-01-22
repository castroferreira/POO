package aula06;

public class A06E02_Circulo extends A06E02_Figura{
	private double raio;	
	
	public A06E02_Circulo(double raio) {
		super(0,0);
		this.raio = raio;
	}
	
	public A06E02_Circulo(int x, int y, double raio){
		super(x,y);
		this.raio = raio;
	}

	public A06E02_Ponto getCentro() {
		return centro;
	}

	public void setCentro(A06E02_Ponto centro) {
		this.centro = centro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo de Centro x: " +getCentro().getX()+ ", y: " +getCentro().getY()+ " e de raio " + raio;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(raio,2);
	}

	@Override
	public double getPerimetro() {
		return 2*Math.PI*raio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(raio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		A06E02_Circulo other = (A06E02_Circulo) obj;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
}