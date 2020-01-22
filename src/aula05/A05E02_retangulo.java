package aula05;

public class A05E02_retangulo {
	private int comprimento, largura;
	private String cor;
	private A05E02_ponto centro;

	public A05E02_retangulo(int comprimento, int largura,  A05E02_ponto centro, String cor){
		this.comprimento = comprimento;
		this.largura = largura;
		this.centro = centro;
		this.cor = cor;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double area(){
		return comprimento*largura;
	}
	
	public double perimetro(){
		return (2*comprimento)+(2*largura);
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
		result = prime * result + comprimento;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + largura;
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
		A05E02_retangulo other = (A05E02_retangulo) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (comprimento != other.comprimento)
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (largura != other.largura)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comprimento: " + comprimento + "\nLargura: " + largura + "\nCentro - " + centro+ "\nCor: " + cor ;
	}
	
	
}