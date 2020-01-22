/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Evento
{
	private String título, horário;
	
	public Evento(String título, String horário)
	{
		this.título = título;
		this.horário = horário;
	}


	
	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public String getHorário() {
		return horário;
	}

	public void setHorário(String horário) {
		this.horário = horário;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horário == null) ? 0 : horário.hashCode());
		result = prime * result + ((título == null) ? 0 : título.hashCode());
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
		if (horário == null) {
			if (other.horário != null)
				return false;
		} else if (!horário.equals(other.horário))
			return false;
		if (título == null) {
			if (other.título != null)
				return false;
		} else if (!título.equals(other.título))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Evento: " + título + ", dia " + horário;
	}	
}
