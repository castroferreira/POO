package aula06_tp;

public class Peixe extends Vertebrado implements ConsegueNadar{
	private String nome;
	
	public Peixe(int idade, int ossos, String nome) {
		super(idade, ossos);
		this.nome = nome;
		System.out.println("Criar um Peixe!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Peixe [nome=" + nome + ", " + super.toString() + "]";
	}
	
	public void comer(){
		System.out.println("O Peixe vai comer!");
	}
	
	public void dormir(){
		System.out.println("O Peixe vai dormir!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Peixe))
			return false;
		Peixe other = (Peixe) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public void nadar() {
		System.out.println("Peixe nada!");
	}
	
	
}
