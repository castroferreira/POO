package aula03;

public class A03E03_retangulo {
	private int comprimento, largura;
	private String cor;

	public A03E03_retangulo(int comprimento, int largura, String cor){
		this.comprimento = comprimento;
		this.largura = largura;
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
}