/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Animacao extends Evento
{
	private int lota��o;
	private double custo;
	
	public Animacao (String t�tulo, String hor�rio, int lota��o, double custo)
	{
		super(t�tulo, hor�rio);
		this.lota��o = lota��o;
		this.custo = custo;
	}

	public int getLota��o() {
		return lota��o;
	}

	public void setLota��o(int lota��o) {
		this.lota��o = lota��o;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(custo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + lota��o;
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
		Animacao other = (Animacao) obj;
		if (Double.doubleToLongBits(custo) != Double.doubleToLongBits(other.custo))
			return false;
		if (lota��o != other.lota��o)
			return false;
		return true;
	}

	@Override
	public String toString() { 
		return super.toString() + ", (Anima��o com lota��o = " + lota��o + ", custo = " + custo + " euros)";
	}
	
	
}
