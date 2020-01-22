package aula07;

public class A07E01_Bicicleta extends A07E01_Veiculo {

	public A07E01_Bicicleta(int ano, String cor, int rodas, double velocidadeMax) throws A07E01_RodasInvalidException {
		super(ano, cor, rodas, velocidadeMax);
	}

	@Override
	public String toString() {
		return "- BICICLETA" + super.toString();
	}
}