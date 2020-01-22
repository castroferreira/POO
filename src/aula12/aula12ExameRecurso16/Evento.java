/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Evento
{
	private String t�tulo, hor�rio;
	
	public Evento(String t�tulo, String hor�rio)
	{
		this.t�tulo = t�tulo;
		this.hor�rio = hor�rio;
	}


	
	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}

	public String getHor�rio() {
		return hor�rio;
	}

	public void setHor�rio(String hor�rio) {
		this.hor�rio = hor�rio;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hor�rio == null) ? 0 : hor�rio.hashCode());
		result = prime * result + ((t�tulo == null) ? 0 : t�tulo.hashCode());
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
		Evento other = (Evento) obj;
		if (hor�rio == null) {
			if (other.hor�rio != null)
				return false;
		} else if (!hor�rio.equals(other.hor�rio))
			return false;
		if (t�tulo == null) {
			if (other.t�tulo != null)
				return false;
		} else if (!t�tulo.equals(other.t�tulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Evento: " + t�tulo + ", dia " + hor�rio;
	}	
}
