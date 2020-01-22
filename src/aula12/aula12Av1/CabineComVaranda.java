package aula12.aula12Av1;

public class CabineComVaranda extends Cabine {
	private TipoDeVaranda tipoVaranda;
	private Extra extra;
	
	public CabineComVaranda(int id, int capacidadeMax, TipoDeVaranda tipoVaranda) {
		super(id, capacidadeMax);
		this.tipoVaranda = tipoVaranda;
	}

	public TipoDeVaranda getTipoVaranda() {
		return tipoVaranda;
	}

	public Extra getExtra() {
		return extra;
	}

	public void pacoteExtra(Extra extra) {
		this.extra = extra;
	}

	public void setPassageiros(String[] split){
		super.SetPassageiros(split);
	}

	@Override
	public String toString() {
		return String.format("Cabine com Varanda " +tipoVaranda.name()+ super.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((extra == null) ? 0 : extra.hashCode());
		result = prime * result + ((tipoVaranda == null) ? 0 : tipoVaranda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CabineComVaranda other = (CabineComVaranda) obj;
		if (extra != other.extra)
			return false;
		if (tipoVaranda != other.tipoVaranda)
			return false;
		return true;
	}

	public void setTipoVaranda(TipoDeVaranda tipoVaranda) {
		this.tipoVaranda = tipoVaranda;
	}
}