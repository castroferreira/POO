package aula06;

public abstract class A06E03_Passageiro {
	private String nome, sexo;
	private int nMilhas, nViagens;
	private A06E03_Data dataNasc;
	
	public A06E03_Passageiro(String nome, A06E03_Data dataNasc, String sexo, int nViagens, int nMilhas){
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.nViagens = nViagens;
		this.nMilhas = nMilhas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getnMilhas() {
		return nMilhas;
	}

	public void setnMilhas(int nMilhas) {
		this.nMilhas = nMilhas;
	}

	public int getnViagens() {
		return nViagens;
	}

	public void setnViagens(int nViagens) {
		this.nViagens = nViagens;
	}

	public A06E03_Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(A06E03_Data dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
    public String toString() {
        return "Passageiro\n" + "Nome: " + nome + "\nData de Nascimento: " + dataNasc + "\nSexo: " + sexo  + "\nNumero de Viagens: " + nViagens + "\nNumero de milhas: " + nMilhas;
    }

	public abstract void milhas();
}