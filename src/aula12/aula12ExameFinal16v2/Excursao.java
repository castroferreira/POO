package aula12.aula12ExameFinal16v2;

public class Excursao extends Viagem
{
	private String local;
	TipoExcursao transporte;
	
	public Excursao(String data, String local, TipoExcursao transporte)
	{
		super(data);
		this.local = local ;
		this.transporte = transporte;
	}
	
	public Excursao(String data, String local)
	{
		super(data);
		this.local = local;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public TipoExcursao getTransporte() {
		return transporte;
	}

	public void setTransporte(TipoExcursao transporte) {
		this.transporte = transporte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((transporte == null) ? 0 : transporte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Excursao other = (Excursao) obj;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (transporte != other.transporte)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Excursão tipo: " + transporte + " Local: " + local + "\n";
	}
}
