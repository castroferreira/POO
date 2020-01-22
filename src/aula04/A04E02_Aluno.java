package aula04;

public class A04E02_Aluno {
	private int nmec;
	private String nome, curso;
	public int nEmprestimos=0;
	private int[] emprestimos={-1,-1,-1};
	
	public A04E02_Aluno(int nmec, String nome, String curso){
		this.nmec = nmec;
		this.nome = nome;
		this.curso = curso;
	}

	public int getNmec() {
		return nmec;
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}
	
	public int getEmprestimos(){
		return nEmprestimos;
	}

	public int[] getListEmprestimos(){
		return emprestimos;
	}

	@Override
	public String toString() {
		return "Nmec: " + nmec + "\t" + " Nome: " + nome + " Curso: " + curso;
	}
	
	public void setDevolucao(int id){
		for(int i = 0; i<3; i++)
			if(emprestimos[i] == id){
				emprestimos[i] = -1;
				break;
			}
	}
	
	public void setListEmprestimos(int id){
		for(int i = 0; i<3; i++)
			if(emprestimos[i] == -1){
				emprestimos[i] = id;
				break;
			}
	}
}