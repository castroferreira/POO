/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Tasca
{
	private String menuFixo;
	private double pre�o;
	
	public Tasca (String menuFixo, double pre�o)
	{
		this.menuFixo = menuFixo;
		this.pre�o = pre�o;
	}
	
	public String getMenuFixo() {
		return menuFixo;
	}



	public void setMenuFixo(String menuFixo) {
		this.menuFixo = menuFixo;
	}



	public double getPre�o() {
		return pre�o;
	}



	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuFixo == null) ? 0 : menuFixo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pre�o);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Tasca other = (Tasca) obj;
		if (menuFixo == null) {
			if (other.menuFixo != null)
				return false;
		} else if (!menuFixo.equals(other.menuFixo))
			return false;
		if (Double.doubleToLongBits(pre�o) != Double.doubleToLongBits(other.pre�o))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tasca: " + menuFixo + " (custo = " + pre�o + " euros)";
	}
	
	
}
