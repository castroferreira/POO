package aula12.aula12B;

public class Biblioteca {
	private String nome, enderešo;
	
	public Biblioteca(String nome, String enderešo) {
		this.nome = nome;
		this.enderešo = enderešo;
	}

	public String getNome() {
		return nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enderešo == null) ? 0 : enderešo.hashCode());
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
		if (enderešo == null) {
			if (other.enderešo != null)
				return false;
		} else if (!enderešo.equals(other.enderešo))
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