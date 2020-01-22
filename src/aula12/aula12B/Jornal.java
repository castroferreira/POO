package aula12.aula12B;

public class Jornal extends Publicacao {
	private Ver versao;
	
	public Jornal(String titulo, String editora, Ver versao) {
		super(titulo, editora);
		this.versao = versao;
	}

	public Ver getVersao() {
		return versao;
	}

	public void setVersao(Ver versao) {
		this.versao = versao;
	}

	public void setPeriodicidade(Period bimestral) {
	}
}