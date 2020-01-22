package aula07;

public class A07E01_AutomovelHibrido extends A07E01_VeiculoHibrido{

	public A07E01_AutomovelHibrido(int ano, String matricula, String cor, int rodas, double velocidadeMax,
			double autonomia, double emissaoCO2, double cilindrada)
			throws A07E01_RodasInvalidException, A07E01_MatriculaInvalidException {
		super(ano, matricula, cor, rodas, velocidadeMax, autonomia, emissaoCO2, cilindrada);
	}

	@Override
	public String toString() {
		return "- AUTOMOVEL HIBRIDO" + super.toString();
	}
}