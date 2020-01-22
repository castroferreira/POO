package aula12.aula12B;

public class Biblioteca {
	private String nome, endere�o;
	
	public Biblioteca(String nome, String endere�o) {
		this.nome = nome;
		this.endere�o = endere�o;
	}

	public String getNome() {
		return nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endere�o == null) ? 0 : endere�o.hashCode());
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
		if (endere�o == null) {
			if (other.endere�o != null)
				return false;
		} else if (!endere�o.equals(other.endere�o))
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