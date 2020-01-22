package aula12.aula12Av1;

import java.util.List;

public class CabineComJanela extends Cabine {
	private TipoDeJanela tipo;
	private Extra extra;
	
	public CabineComJanela(int id, int capacidadeMax, TipoDeJanela tipo) {
		super(id, capacidadeMax);
		this.tipo = tipo;
	}

	public CabineComJanela(int id, int capacidadeMax, TipoDeJanela tipo, String[] split) {
		super(id, capacidadeMax);
		this.tipo = tipo;
		super.SetPassageiros(split);
	}
	
	public TipoDeJanela getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeJanela tipo) {
		this.tipo = tipo;
	}

	public void setPassageiros(String[] split) {
		super.SetPassageiros(split);
	}

	public Extra getExtra() {
		return extra;
	}
	
	public void pacoteExtra(Extra extra) {
		this.extra = extra;
	}
	
	@Override
	public String toString() {
		return String.format("Cabine com Janela " +tipo.name()+ super.toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((extra == null) ? 0 : extra.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		CabineComJanela other = (CabineComJanela) obj;
		if (extra != other.extra)
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
}