package aula06;

public class A06E02_Retangulo extends A06E02_Figura{
	private double comprimento, largura;

	public A06E02_Retangulo(double comprimento, double largura) {
		super(0,0);
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public A06E02_Retangulo(int x, int y, double largura, double comprimento){
		super(x,y);
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	public String toString() {
		return "Retangulo de Centro x: " +getCentro().getX()+ ", y: " +getCentro().getY()+ ", altura " + largura + ", comprimento " + comprimento;
	}

	@Override
	public double getArea() {
		return comprimento*largura;
	}

	@Override
	public double getPerimetro() {
		return (2*comprimento)+(2*largura);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(comprimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largura);
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
		A06E02_Retangulo other = (A06E02_Retangulo) obj;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura))
			return false;
		return true;
	}
	
	
}