/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Animacao extends Evento
{
	private int lotação;
	private double custo;
	
	public Animacao (String título, String horário, int lotação, double custo)
	{
		super(título, horário);
		this.lotação = lotação;
		this.custo = custo;
	}

	public int getLotação() {
		return lotação;
	}

	public void setLotação(int lotação) {
		this.lotação = lotação;
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
		result = prime * result + lotação;
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
		if (lotação != other.lotação)
			return false;
		return true;
	}

	@Override
	public String toString() { 
		return super.toString() + ", (Animação com lotação = " + lotação + ", custo = " + custo + " euros)";
	}
	
	
}
