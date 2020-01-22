package aula12.aula12ExameFinal16v2;

public class Cruzeiro extends Viagem
{
	private String nome, portoSaida;
	ClasseNavio classe;
	private int duration;
	
	public Cruzeiro(String nome, String portoSaida, String data, ClasseNavio classe)
	{
		super(data);
		this.nome = nome;
		this.portoSaida = portoSaida;
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPortoSaida() {
		return portoSaida;
	}

	public void setPortoSaida(String portoSaida) {
		this.portoSaida = portoSaida;
	}

	public ClasseNavio getClasse() {
		return classe;
	}

	public void setClasse(ClasseNavio classe) {
		this.classe = classe;
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
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		result = prime * result + duration;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((portoSaida == null) ? 0 : portoSaida.hashCode());
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
		Cruzeiro other = (Cruzeiro) obj;
		if (classe != other.classe)
			return false;
		if (duration != other.duration)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (portoSaida == null) {
			if (other.portoSaida != null)
				return false;
		} else if (!portoSaida.equals(other.portoSaida))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cruzeiro " + nome + " Porto de Saida: " + portoSaida + " Classe: " + classe + " Duração: " + duration + "\n";
	}
}
