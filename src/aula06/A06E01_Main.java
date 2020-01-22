package aula06;
import static java.lang.System.*;
public class A06E01_Main {
	public static void main(String[] args) {
		A06E01_Data d = new A06E01_Data(26, 0, 1993);
		A06E01_Pessoa p = new A06E01_Pessoa("Andreia Ferreira", 1234567, d);
		A06E01_Aluno a = new A06E01_Aluno ("Andreia Ferreira", 1234567, new A06E01_Data(26, 0, 1993), new A06E01_Data (20, 3, 2017));
		A06E01_Bolseiro b = new A06E01_Bolseiro ("Hugo Neto", 7654321, new A06E01_Data(8, 5, 1992));
		A06E01_Professor prof = new A06E01_Professor ("António Neves", 1357246, new A06E01_Data(8, 8, 1972), "POO");
		A06E01_AlunoPosGrad apg = new A06E01_AlunoPosGrad ("Miguel Castro", 2461357, new A06E01_Data(5, 7, 1998), prof);
		A06E01_Disciplina dis = new A06E01_Disciplina(prof, "POO");
		b.setBolsa(791);
		out.println("Aluno: " + a.getNome());
		out.println(a);
		out.println("Bolseiro: " + b.getNome() + ", NMec: " + b.getNmec() + ", Bolsa: " + b.getBolsa() + " €");
		out.println(b);
		A06E01_Disciplina.alunosInscrit.add(a);
		A06E01_Disciplina.alunosPosGradInscrit.add(apg);
		out.println(dis.toString());
		
		}
}