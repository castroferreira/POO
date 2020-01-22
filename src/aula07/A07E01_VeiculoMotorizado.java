package aula07;

public abstract class A07E01_VeiculoMotorizado extends A07E01_Veiculo {

	private String matricula;
	
	public A07E01_VeiculoMotorizado(int ano, String matricula, String cor, int rodas, double velocidadeMax)
			throws A07E01_RodasInvalidException, A07E01_MatriculaInvalidException {
		super(ano, cor, rodas, velocidadeMax);
		matriculaValida(matricula);
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void matriculaValida(String matricula) throws A07E01_MatriculaInvalidException{
		if(matricula.matches("[A-Z]{2}\\-\\d{2}\\-\\d{2}")){
			if(matricula.matches("[A-Z]{2}\\-0{2}\\-0{2}"))
				throw new A07E01_MatriculaInvalidException();
		}
		else if(matricula.matches("\\d{2}\\-[A-Z]{2}\\-\\d{2}")){
			if(matricula.matches("0{2}\\-[A-Z]{2}\\-0{2}"))
				throw new A07E01_MatriculaInvalidException();
		}
		else if(matricula.matches("\\d{2}\\-\\d{2}\\-[A-Z]{2}")){
			if(matricula.matches("0{2}\\-0{2}\\-[A-Z]{2}"))
				throw new A07E01_MatriculaInvalidException();
		}
		else throw new A07E01_MatriculaInvalidException();
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n| Matricula: " + getMatricula();
	}
}