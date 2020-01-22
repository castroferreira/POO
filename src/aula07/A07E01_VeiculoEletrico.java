package aula07;

public abstract class A07E01_VeiculoEletrico extends A07E01_VeiculoMotorizado implements A07E01_MotorEletrico {

	private double autonomia;
	
	public A07E01_VeiculoEletrico(int ano, String matricula, String cor, int rodas, double velocidadeMax, double autonomia)
			throws A07E01_RodasInvalidException, A07E01_MatriculaInvalidException {
		super(ano, matricula, cor, rodas, velocidadeMax);
	}
	
	public void validarAutonomia(double autonomia) throws A07E01_AutonomiaInvalidException{
		if (autonomia < 0) throw new A07E01_AutonomiaInvalidException();
		this.autonomia = autonomia;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public String toString() {
		return super.toString() + "\n| Autonomia: " + getAutonomia();
	}
	
	
}