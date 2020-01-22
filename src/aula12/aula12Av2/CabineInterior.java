package aula12.aula12Av2;

public class CabineInterior extends Cabine {
	private boolean capacidadesEspeciais;

	public CabineInterior(int numero, int capacidade) {
		super(numero, capacidade);
	}

	public CabineInterior(int numero, int capacidade, String[] split) {
		super(numero, capacidade);
		this.setPassageiros(split);
	}

	public void suportaNecessidadesEspeciais() {
		this.capacidadesEspeciais = true;
	}

	public String necessidadesEspeciais() {
		if (capacidadesEspeciais) {
			return "com Suporte Nec. Especiais ";
		} else {
			return "";
		}

	}

	public String toString() {
		return "Cabine Interior " + this.necessidadesEspeciais() + super.toString();
	}
}
