package aula06;

public class A06E02_Quadrado extends A06E02_Figura{
	private double lado;

	public A06E02_Quadrado(double lado) {
		super(0,0);
		this.lado = lado;
	}
	
	public A06E02_Quadrado(int x, int y, double lado){
		super(x,y);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado de Centro x: " +getCentro().getX()+ ", y: " +getCentro().getY()+ " e de lado " + lado;
	}

	@Override
	public double getArea() {
		return lado*lado;
	}

	@Override
	public double getPerimetro() {
		return 4*lado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(lado);
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
		A06E02_Quadrado other = (A06E02_Quadrado) obj;
		if (Double.doubleToLongBits(lado) != Double.doubleToLongBits(other.lado))
			return false;
		return true;
	}
}