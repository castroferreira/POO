package aula05;

public class A05E01_Main {
	public static void main(String[] args) {
		A05E01_Aluno al = new A05E01_Aluno ("Andreia Melo", 9855678, new A05E01_Data(18, 7, 1990), new A05E01_Data (1, 9, 2014));
		A05E01_Bolseiro bls = new A05E01_Bolseiro ("Igor Santos", 8976543, new A05E01_Data(11, 5, 1985));
		bls.setBolsa(745);
		System.out.println("Aluno: " + al.getNome());
		System.out.println(al);
		System.out.println("Bolseiro: " + bls.getNome() + ", NMec: " + bls.getNmec() + ", Bolsa: " + bls.getBolsa() + " €");
		System.out.println(bls);
		}
}