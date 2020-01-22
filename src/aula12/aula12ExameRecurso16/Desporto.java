/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Desporto extends Evento
{
	private boolean arLivre;
	
	public Desporto (String nome, String horário)
	{
		super(nome, horário);
	}
	
	public Desporto (String nome, String horário, boolean arLivre)
	{
		super(nome, horário);
		this.arLivre = arLivre;
	}

	public boolean isArLivre() {
		return arLivre;
	}

	public void setArLivre(boolean arLivre) {
		this.arLivre = arLivre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (arLivre ? 1231 : 1237);
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
		Desporto other = (Desporto) obj;
		if (arLivre != other.arLivre)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", (" + arLivre + ")";
	}
	
	
}
