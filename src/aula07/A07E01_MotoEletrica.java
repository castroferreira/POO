package aula07;

public class A07E01_MotoEletrica extends A07E01_VeiculoEletrico{
	
	public A07E01_MotoEletrica(int ano, String matricula, String cor, int rodas, double velocidadeMax, double autonomia)
			throws A07E01_RodasInvalidException, A07E01_MatriculaInvalidException {
		super(ano, matricula, cor, rodas, velocidadeMax, autonomia);
	}

	@Override
	public String toString() {
		return "- MOTO ELETRICA" + super.toString();
	}
}
