package aula07;

@SuppressWarnings("serial")

public class A07E01_RodasInvalidException extends IllegalArgumentException {
	public A07E01_RodasInvalidException() {
		super("Numero de rodas invalido");
	}
}