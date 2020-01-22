/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

public class Tasca
{
	private String menuFixo;
	private double preço;
	
	public Tasca (String menuFixo, double preço)
	{
		this.menuFixo = menuFixo;
		this.preço = preço;
	}
	
	public String getMenuFixo() {
		return menuFixo;
	}



	public void setMenuFixo(String menuFixo) {
		this.menuFixo = menuFixo;
	}



	public double getPreço() {
		return preço;
	}



	public void setPreço(double preço) {
		this.preço = preço;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuFixo == null) ? 0 : menuFixo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preço);
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
		if (Double.doubleToLongBits(preço) != Double.doubleToLongBits(other.preço))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tasca: " + menuFixo + " (custo = " + preço + " euros)";
	}
	
	
}
