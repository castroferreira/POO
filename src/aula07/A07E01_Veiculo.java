package aula07;

public abstract class A07E01_Veiculo implements Comparable<A07E01_Veiculo>{
	private int ano, rodas;
	private String cor;
	private double velocidadeMax;
	
	public A07E01_Veiculo(int ano, String cor, int rodas, double velocidadeMax)
	throws A07E01_RodasInvalidException{
		this.ano = ano;
		this.cor = cor;
		this.rodas = rodas;
		this.validarAno(ano);
		this.validarNumRodas(rodas);
		this.validarVelocidadeMax(velocidadeMax);
	}
	
	public int compareTo(A07E01_Veiculo v){
		int comparar = 0;
		if(this.getAno() == v.getAno()) comparar = 0;
		else if(this.getAno() < v.getAno()) comparar = -1;
		else if(this.getAno() > v.getAno()) comparar = 1;
		return comparar;
	}

	public int getAno() {
		return ano;
	}

	public int getRodas() {
		return rodas;
	}


	public String getCor() {
		return cor;
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	@Override
	public String toString() {
		return "\n| Ano: " +ano+ "\n| Cor Base: " +cor+ "\n| Nº de Rodas: " +rodas+  " m3\n| Velocidade Maxima: " +velocidadeMax+ " km/h";
	}
	
	public void setRodas(int rodas) throws A07E01_RodasInvalidException{
		if(rodas < 2) throw new A07E01_RodasInvalidException();
		this.rodas = rodas;
	}
	
	public void validarAno(int ano) throws A07E01_AnoInvalidException{
		if(ano < 2) throw new A07E01_AnoInvalidException();
		this.ano = ano;
	}
	
	public void validarNumRodas(int numRodas) throws A07E01_RodasInvalidException{
		if(numRodas < 2 || numRodas > 10) throw new A07E01_RodasInvalidException();
		this.rodas = numRodas;
	}
	
	public void validarVelocidadeMax(double velocidadeMax) throws A07E01_VelocidadeMaximaInvalidException{
		if(velocidadeMax < 1) throw new A07E01_VelocidadeMaximaInvalidException();
		this.velocidadeMax = velocidadeMax;
	}
}