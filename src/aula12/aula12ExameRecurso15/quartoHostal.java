package aula12.aula12ExameRecurso15;

public class quartoHostal extends Apartamento
{
	private ROOM_TYPE Type;
	
	public quartoHostal (String nome, String morada, double Preco, double Temp, int ArCond)
	{
		super (nome, morada, Preco, Temp, ArCond);
	}

	public ROOM_TYPE getType() {
		return Type;
	}

	public void setType(ROOM_TYPE type) {
		Type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
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
		quartoHostal other = (quartoHostal) obj;
		if (Type != other.Type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Type: " + Type;
	}
}
