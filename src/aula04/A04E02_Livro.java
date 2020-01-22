package aula04;

public class A04E02_Livro {
	private int id, tipo;
	String titulo;
	boolean requisitado = false;
	
	public A04E02_Livro(int id, String titulo, int tipo){
		this.id = id;
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\t" + " Titulo: " + titulo + "\t" + " Tipo de emprestimo: " + tipo;
	}
	
	
}