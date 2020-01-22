package aula04;

import java.util.Scanner;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A04E02_Bibilioteca {

	public static Scanner sc = new Scanner(System.in);
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static A04E02_Aluno[] aluno = new A04E02_Aluno[10];
	private static A04E02_Aluno[] alunoAux;
	private static A04E02_Livro[] livro = new A04E02_Livro[10];
	private static A04E02_Livro[] livroAux;
	private static int nAlunos=0, nLivros=0;
	
	public static void main(String[] args) throws IOException{
		do{
			switch(menu()){
				case 1:
					out.println("\n1 - REGISTAR ALUNO\n");
					RegistarAluno();
					break;
				case 2:
					out.println("\n2 - REMOVER ALUNO\n");
					RemoverAluno();
					break;
				case 3:
					out.println("\n3 - IMPRIMIR LISTA DE UTILIZADORES\n");
					Utilizadores();
					break;
				case 4:
					out.println("\n4 - REGISTAR NOVO LIVRO\n");
					RegistarLivro();
					break;
				case 5:
					out.println("\n5 - LISTA DE LIVROS\n");
					ListarLivro();
					break;
				case 6:
					out.println("\n6 - REQUISICAO DE UM LIVRO\n");
					RequisitarLivro();
					break;
				case 7:
					out.println("\n7 - DEVOLUCAO DE UM LIVRO\n");
					Devolucao();
					break;
				case 8:
					out.println("\n8 - VERIFICAR DISPONIBILIDADE\n");
					Disponibilidade();
					break;
				case 9: 
					exit(0);break; 
				default: err.println("\nOpcao invalida, tente novamente.\n\n");break;
			}
		}while(menu() != 9);
	}
	
	public static int menu(){
		out.println("\nMENU BIBLIOTECA\n"
				  + "1 - increver aluno\n"
				  + "2 - remover aluno\n"
				  + "3 - imprimir lista de utilizadores\n"
				  + "4 - registar novo livro\n"
				  + "5 - imprimir lista de livros\n"
				  + "6 - emprestar\n"
				  + "7 - devolver\n"
				  + "8 - veificar disponibilidade\n"
				  + "9 - sair\n");
					out.printf("Opcao: ");
					return sc.nextInt();
	}
	
	
	// 1 - Increver aluno
	public static void RegistarAluno() throws IOException{
		
		out.print("1. Numero mecanografico: ");
		int nmec= sc.nextInt();
		
		out.print("2. Nome: ");
		String nome = in.readLine();
		
		out.print("3. Curso: ");
		String curso = in.readLine();
		
		A04E02_Aluno a = new A04E02_Aluno(nmec, nome, curso);
		
		int i;
		for(i = 0; i<nAlunos; i++)
			if(nmec==aluno[i].getNmec()){
				err.println("O numero mecanografico ja se encontra registado.");
				return;
			}
		
		if(nAlunos < nAlunos) return;
		
		int size = aluno.length;
		
		if(nAlunos < size){
			aluno[nAlunos] = a;
			nAlunos++;
		}
		
		else{
			alunoAux = new A04E02_Aluno[size+10];
			arraycopy(aluno, 0, alunoAux, 0, size);
			aluno = alunoAux;
			aluno[nAlunos] = a;
			nAlunos++;
		}
	}
	
	
	// 2 - Remover aluno
	public static void RemoverAluno(){
		
		out.print("1. Escreva o numero mecanografico do aluno que pretende remover: ");
		int nmecRemove = sc.nextInt();

		out.println();
		
		A04E02_Aluno[] aRem = new A04E02_Aluno[aluno.length]; //Aluno a remover
		
		int i = -1;
		
		for(int j = 0; j<nAlunos;j++)
			if(aluno[j].getNmec() == nmecRemove)
				i=j;
		
		if(i>0){
			arraycopy(aluno, 0, aRem, 0, i);
			if(i<nAlunos-1)
				arraycopy(aluno, i+1, aRem, i, aluno.length-2);
			
			aluno=aRem;
			nAlunos--;
		}
		
		else if(i==0){
			arraycopy(aluno, 1, aRem, i, aluno.length-1);
			aluno=aRem;
			nAlunos--;
		}
		else err.println("O aluno nao existe.");
	}
	
	
	// 3 - Imprimir lista de utilizadores
	public static void Utilizadores(){
		out.printf("%-30s%-20s%-20s\n", "Nome", "Curso", "Nmec");
		
		for(int i = 0; i<nAlunos;i++)
			out.printf("%-30s%-20s%-20d\n", aluno[i].getNome(), aluno[i].getCurso(), aluno[i].getNmec());
		
		out.println();
	}
	
	
	// 4 - Registar novo livo
	public static void RegistarLivro() throws IOException{
		out.print("Titulo: ");
			String titulo = in.readLine();
		
		out.print("Tipo de emprestimo:"
				  + "\n1 - Condicional"
				  + "\n2 - Normal");
			int tipoEmprestimo = sc.nextInt();
			
			if(tipoEmprestimo!=1 && tipoEmprestimo!=2){
				err.println("Esse tipo nao existe");
				return;
			}
			
			A04E02_Livro l = new A04E02_Livro(nLivros+1, titulo, tipoEmprestimo);
			
			int i;
			for(i = 0; i<nLivros; i++)
				if(titulo.equals(livro[i].getTitulo())){
					err.println("O livro ja se encontra registado");
					return;
				}
			
			if(i<nLivros) return;
			
			int size = livro.length;
			
			if(nLivros < size){
				livro[nLivros] = l;
				nLivros++;
			}
			
			else{
				livroAux = new A04E02_Livro[size+10];
				arraycopy(livro, 0, livroAux, 0, size);
				livro = livroAux;
				livro[nLivros] = l;
				nLivros++;
			}
			err.println("\nID do livro '" +titulo+ "': " +nLivros+ "\n");
	}
	
	
	// 5 - Lista de livros
	public static void ListarLivro(){
		out.printf("%-5s%-30s%-20s\n", "ID", "Titulo", "Tipo de Emprestimo");
		
		for(int i = 0; i<nLivros;i++)
			out.printf("%-5s%-30s%-20s\n", livro[i].getId(), livro[i].getTitulo(), (livro[i].getTipo()==1 ? "Condicional" : "Normal"));
		
		out.println();
	}
	
	
	// 6 - Requisitar um livro
	public static void RequisitarLivro(){
		out.print("Numero mecanografico: ");
		int nmecReq = sc.nextInt();
		
		out.print("ID: ");
		int idNumerico = sc.nextInt();

		int a = -1;
		
		for(int i = 0; i<nAlunos;i++){
			if(aluno[i].getNmec() == nmecReq)
				a=i;
			
			//Cada aluno só pode requisitar NO MÁXIMO 3 LIVROS
			for(int j = 0; j<3; j++)
				if(aluno[i].getListEmprestimos()[j] == idNumerico){
					err.println("Livro indisponivel\n");
					return;
				}
		}
		
		if (a==-1){
			err.println("Utilizador nao existe\n");
			return;
		}
		
		if (aluno[a].getEmprestimos() > 2){
			err.println("Nao pode requisitar mais livos\n");
			return;
		}
		
		for(int k=0;k<nLivros;k++)
			if (livro[k].getId()==idNumerico)
				nLivros=k;
			
		if (nLivros==-1){
			err.println("O livro nao existe\n");
			return;
		}
		
		
		for(int x=0; x<3;x++)
			if (aluno[a].getListEmprestimos()[x] == -1){
				aluno[a].setListEmprestimos(idNumerico);
				break;
			}
		
		aluno[a].nEmprestimos++;
		livro[nLivros].requisitado=true;
		err.println("Emprestimo feito com sucesso\n");
	}
	
	
	// 7 - Devolver um livro
	public static void Devolucao(){
		out.print("Numero mecanografico: ");
		int nmecDev = sc.nextInt();
		
		out.print("ID numerico: ");
		int idNumerico = sc.nextInt();
		
		int a = -1, pos = -1;
		
		for(int i=0;i<nAlunos;i++)
			if (aluno[i].getNmec() == nmecDev)
				a=i;
	
		
		if (a==-1){
			err.println("O aluno nao existe\n");
			return;
		}
		
		for(int j=0;j<3;j++)
			if (aluno[a].getListEmprestimos()[j]==idNumerico)
				pos=j;
			
		if (pos==-1){
			err.println("O livro nao foi requisitado por este aluno\n");
			return;
		}

		aluno[a].setDevolucao(idNumerico);
		for(int k = 0; k < nLivros; k++){
			if(livro[k].getId()==idNumerico){
				livro[k].requisitado=false;
			}
		}
		aluno[a].nEmprestimos--;
		err.println("A sua devolucao foi concluida com sucesso\n");
	
	}
	
	
	// 8 - Veificar disponibilidade
	public static void Disponibilidade(){
		out.print("ID: ");
		int id = sc.nextInt();
		
		boolean existe = true;
		
		for(int i = 0; i<nLivros;i++)
			if(livro[i].getId() == id && (livro[i].requisitado=true)) existe = false;
		
		if(existe) err.println("O livro esta disponivel");
		else err.println("O livro nao esta disponivel");
		
	}
}