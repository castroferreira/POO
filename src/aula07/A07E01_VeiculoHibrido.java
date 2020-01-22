package aula07;

public abstract class A07E01_VeiculoHibrido extends A07E01_VeiculoMotorizado
		implements A07E01_MotorCombustao, A07E01_MotorEletrico {

	private double autonomia, emissaoCO2, cilindrada;
	
	public A07E01_VeiculoHibrido(int ano, String matricula, String cor, int rodas, double velocidadeMax, double autonomia, double emissaoCO2, double cilindrada)
			throws A07E01_RodasInvalidException, A07E01_MatriculaInvalidException {
		super(ano, matricula, cor, rodas, velocidadeMax);
		validarAutonomia(autonomia);
		validarCilindrada(cilindrada);
		validarEmissaoCO2(emissaoCO2);
	}
	
	public void validarAutonomia(double autonomia) throws A07E01_AutonomiaInvalidException{
		if (autonomia < 0) throw new A07E01_AutonomiaInvalidException();
		this.autonomia = autonomia;
	}
	
	public void validarEmissaoCO2(double emissaoCO2) throws A07E01_EmissaoCO2InvalidException{
		if (emissaoCO2 < 0) throw new A07E01_EmissaoCO2InvalidException();
		this.emissaoCO2 = emissaoCO2;
	}
	
	public void validarCilindrada(double cilindrada) throws A07E01_CilindradaInvalidException{
		if (cilindrada < 1) throw new A07E01_CilindradaInvalidException();
		this.cilindrada = cilindrada;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public double getEmissaoCO2() {
		return emissaoCO2;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + "\n| Autonomia: " + getAutonomia() + "\n| Emissao CO2: " + getEmissaoCO2() + "\n| Cilindrada: " + getCilindrada();
	}	
}