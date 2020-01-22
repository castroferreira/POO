/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Musica extends Evento
{
	private String palco;
	
	public Musica (String nome, String horário, String palco)
	{
		super(nome,horário);
		this.palco = palco;
	}


	public String getPalco() {
		return palco;
	}

	public void setPalco(String palco) {
		this.palco = palco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((palco == null) ? 0 : palco.hashCode());
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
		Musica other = (Musica) obj;
		if (palco == null) {
			if (other.palco != null)
				return false;
		} else if (!palco.equals(other.palco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", (Música no palco " + palco + ")";
	}
}
