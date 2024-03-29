package aula07;

public class A07E01_AutomovelCombustao extends A07E01_VeiculoCombustão{

	public A07E01_AutomovelCombustao(int ano, String matricula, String cor, int rodas, double velocidadeMax,
			double emissaoCO2, double cilindrada)
			throws A07E01_RodasInvalidException, A07E01_MatriculaInvalidException {
		super(ano, matricula, cor, rodas, velocidadeMax, emissaoCO2, cilindrada);
	}

	@Override
	public String toString() {
		return "\n- AUTOMOVEL COMBUSTAO " + super.toString();
	}
	
	
}