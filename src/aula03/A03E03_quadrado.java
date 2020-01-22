package aula03;

public class A03E03_quadrado {
	private String cor;
	private int lado;
	
	public A03E03_quadrado(int lado, String cor){
		this.lado = lado;
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
}