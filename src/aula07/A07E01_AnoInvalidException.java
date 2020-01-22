package aula07;

@SuppressWarnings("serial")

public class A07E01_AnoInvalidException extends IllegalArgumentException {
	public A07E01_AnoInvalidException() {
		super("Ano invalido");
	}
}