package aula06;
import static java.lang.System.*;

public class A06E03_Main {

	public static void main(String[] args) {
		A06E03_Passageiro p1 = new A06E03_PassageiroClasseTuristica("Andreia Ferreira", new A06E03_Data(26, 8, 1993), "Feminino", 3, 320);
		p1.milhas();
		out.println(p1.toString());
		
		A06E03_Passageiro p2 = new A06E03_PassageiroClasseExecutiva("Hugo Neto", new A06E03_Data(8, 5, 1992), "Masculino", 5, 230);
		p2.milhas();
		out.println(p2.toString());
		
		A06E03_Passageiro p3 = new A06E03_PassageiroPrimeiraClasse("Miguel Castro", new A06E03_Data(5, 7, 1998), "Masculino", 7, 410);
		p3.milhas();
		out.println(p3.toString());
		
		A06E03_Passageiro p4 = new A06E03_PassageiroPrimeiraClasse("Fernanda Barbosa", new A06E03_Data(27, 11, 1997), "Feminino", 1, 150);
		p4.milhas();
		out.println(p4.toString());
	}
}