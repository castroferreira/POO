package aula12.aula12Av2;

public class CabineComJanela extends Cabine {
	private TipoDeJanela tipo;
	private LocalJantar local;

	public CabineComJanela(int id, int capacidadeMax, TipoDeJanela tipo) {
		super(id, capacidadeMax);
		this.tipo = tipo;
	}

	public CabineComJanela(int id, int capacidadeMax, TipoDeJanela tipo, String[] split) {
		super(id, capacidadeMax);
		this.tipo = tipo;
		super.setPassageiros(split);
	}
	
	public TipoDeJanela getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeJanela tipo) {
		this.tipo = tipo;
	}

	public String toString() {
		return "Cabine com Janela " + this.getTipo() 
		+ " " + super.toString();
	}
	
	
}