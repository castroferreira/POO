package aula07;

@SuppressWarnings("serial")

public class A07E01_MatriculaInvalidException extends IllegalArgumentException{
	public A07E01_MatriculaInvalidException() {
		super("Matricula invalida");
	}
}