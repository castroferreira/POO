package aula12.aula12Av2;

public class CabineComVaranda extends Cabine {
	private TipoDeVaranda tipoVaranda;
	private LocalJantar local;
	
	public CabineComVaranda(int id, int capacidadeMax, TipoDeVaranda tipoVaranda) {
		super(id, capacidadeMax);
		this.tipoVaranda = tipoVaranda;
	}

	public TipoDeVaranda getTipoVaranda() {
		return tipoVaranda;
	}

	public LocalJantar getLocal() {
		return local;
	}

	public void setLocal(LocalJantar local) {
		this.local = local;
	}

	public void setPassageiros(String[] split){
		super.setPassageiros(split);
	}

	public void setTipoVaranda(TipoDeVaranda tipoVaranda) {
		this.tipoVaranda = tipoVaranda;
	}
	
	public String toString() {
		return "Cabine com " + this.tipoVaranda 
				+ " Jantar=" + this.getLocal() 
				+ super.toString();
	}

	public boolean hasLocal() {
		return false;
	}
}