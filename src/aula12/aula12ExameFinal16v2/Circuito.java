package aula12.aula12ExameFinal16v2;

import java.util.Arrays;

public class Circuito extends Viagem
{
	private String[] listaCidades;
	private int duration;
	
	public Circuito(String data, String[] listaCidades, int duration)
	{
		super(data);
		this.listaCidades = listaCidades;
		this.duration = duration;
	}

	public Circuito(String data, String[] listaCidades) 
	{
		super(data);
		this.listaCidades = listaCidades;
	}

	public String[] getListaCidades() {
		return listaCidades;
	}

	public void setListaCidades(String[] listaCidades) {
		this.listaCidades = listaCidades;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + duration;
		result = prime * result + Arrays.hashCode(listaCidades);
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
		Circuito other = (Circuito) obj;
		if (duration != other.duration)
			return false;
		if (!Arrays.equals(listaCidades, other.listaCidades))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String circuito = super.toString() + "\n";
		
		for(int i = 0; i<listaCidades.length; i++)
			circuito += listaCidades[i];
		
		return "Circuito: " + Arrays.toString(listaCidades) + " Duração: " + duration + "\n";
	}
}
