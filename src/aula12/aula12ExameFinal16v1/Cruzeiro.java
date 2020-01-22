package aula12.aula12ExameFinal16v1;

public class Cruzeiro extends Viagem {
	private String nome;
	private String portoSaida;
	private ClasseNavio classe;
	private int duracao;
	private static int duracaoTotal;

	public Cruzeiro(String nome, String portoSaida, String dataInicio, ClasseNavio classe) {
		super(dataInicio);
		this.nome = nome;
		this.portoSaida = portoSaida;
		this.classe = classe;
		this.duracao = 7;
		// ------------
		Cruzeiro.duracaoTotal += this.duracao;
	}

	public static int getDuracaoTotal() {
		return duracaoTotal;
	}

	public static void setDuracaoTotal(int duracaoTotal) {
		Cruzeiro.duracaoTotal = duracaoTotal;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setDuration(int duracao) throws IllegalArgumentException {
		if (duracao < 3 || duracao > 14) {
			throw new IllegalArgumentException();
		}
		this.duracao = duracao;
	}

	public int getDuration() {
		return duracao;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		result = prime * result + duracao;
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
		if (!(obj instanceof Cruzeiro))
			return false;
		Cruzeiro other = (Cruzeiro) obj;
		if (classe != other.classe)
			return false;
		if (duracao != other.duracao)
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
		return "Cruzeiro [" + getDataInicio() + " navio=" + getNome() + ", porto=" + getPortoSaida() + ", classe="
				+ getClasse() + ", duration=" + getDuration();
	}

}
