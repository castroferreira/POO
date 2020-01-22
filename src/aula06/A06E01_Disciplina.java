package aula06;

import java.util.ArrayList;
import java.util.List;

public class A06E01_Disciplina {
	private A06E01_Professor regente;
	private String nome;
	static List <A06E01_Aluno> alunosInscrit;
	static List <A06E01_AlunoPosGrad> alunosPosGradInscrit;
	
	public A06E01_Disciplina(A06E01_Professor regente, String nome) {
		this.regente = regente;
		this.nome = nome;
		alunosInscrit = new ArrayList<>();
		alunosPosGradInscrit = new ArrayList<>();
	}
	
	public A06E01_Professor getRegente() {
		return regente;
	}

	public void setRegente(A06E01_Professor regente) {
		this.regente = regente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		String disciplina = nome + "\n";
		
		for(A06E01_Aluno alunosInscritos : alunosInscrit)
			nome += alunosInscritos.toString() + "\n";
		
		for(A06E01_AlunoPosGrad alunosPosGradInscritos : alunosPosGradInscrit)
			nome += alunosPosGradInscritos.toString() + "\n";
		
		nome += regente.toString();
		return nome;
	}
	
	
}