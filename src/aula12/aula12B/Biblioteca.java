package aula12.aula12B;

public class Biblioteca {
	private String nome, endereço;
	
	public Biblioteca(String nome, String endereço) {
		this.nome = nome;
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Biblioteca other = (Biblioteca) obj;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void add(Livro livro) {
		
	}

	public void add(Revista revista) {
		
	}

	public void add(Jornal jornal, Ver cores) {
		
	}

	public void add(Jornal gaf) {
		
	}
}