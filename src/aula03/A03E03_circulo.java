package aula03;

public class A03E03_circulo {
	private String cor;
	private A03E03_ponto centro;
	int raio;

	public A03E03_circulo(int raio, A03E03_ponto centro, String cor){
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

	public A03E03_ponto getCentro() {
		return centro;
	}

	public void setCentro(A03E03_ponto centro) {
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
}
