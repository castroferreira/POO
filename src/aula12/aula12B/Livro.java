package aula12.aula12B;

public class Livro extends Publicacao {
	private String ISBN, listaAutores;
	
	public Livro(String titulo, String editora, String ISBN, String listaAutores) {
		super(titulo, editora);
		this.ISBN = ISBN;
		this.listaAutores = listaAutores;
	}

	public Livro(String titulo, String editora, String listaAutores) {
		super(titulo, editora);
		this.listaAutores = listaAutores;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getListaAutores() {
		return listaAutores;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setListaAutores(String listaAutores) {
		this.listaAutores = listaAutores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((listaAutores == null) ? 0 : listaAutores.hashCode());
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
		Livro other = (Livro) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (listaAutores == null) {
			if (other.listaAutores != null)
				return false;
		} else if (!listaAutores.equals(other.listaAutores))
			return false;
		return true;
	}
}