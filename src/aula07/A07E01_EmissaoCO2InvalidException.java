package aula07;

@SuppressWarnings("serial")

public class A07E01_EmissaoCO2InvalidException extends IllegalArgumentException {
	public A07E01_EmissaoCO2InvalidException() {
		super("Emissão de CO2 invalida");
	}
}