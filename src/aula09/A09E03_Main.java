package aula09;
import java.util.*;
public class A09E03_Main {
	public static void main(String[] args) {
		A09E03_Localidade cid1 = new A09E03_Localidade("Szohod", 31212, A09E03_TipoLocalidade.Cidade);
		A09E03_Localidade cid2 = new A09E03_Localidade("Wadesdah", 23423, A09E03_TipoLocalidade.Cidade);
		A09E03_Localidade cid3 = new A09E03_Localidade("BedRock", 23423, A09E03_TipoLocalidade.Vila);
		A09E03_Estado est1 = new A09E03_Estado("North Borduria", 223133, cid1);
		A09E03_Estado est2 = new A09E03_Estado("South Borduria", 84321, cid2);
		A09E03_Pais p1 = new A09E03_Pais("Borduria", est1.getCapital());
		A09E03_Pais p2 = new A09E03_Pais("Khemed", cid2);
		A09E03_Pais p3 = new A09E03_Pais("Aurelia");
		A09E03_Pais p4 = new A09E03_Pais("Atlantis");
		p1.addRegiao(est1);
		p1.addRegiao(est2);
		p2.addRegiao(new A09E03_Provincia("Afrinia", 232475, "Aluko Pono"));
		p2.addRegiao(new A09E03_Provincia("Eriador", 100000, "Dumpgase Liru"));
		p2.addRegiao(new A09E03_Provincia("Laurania", 30000, "Mukabamba Dabba"));
		List<A09E03_Pais> org = new ArrayList<A09E03_Pais>();
		org.add(p1);
		org.add(p2);
		org.add(p3);
		org.add(p4);
		
		// Ordenar
		Collections.sort(org, new Comparator<A09E03_Pais>() {
			@Override
			public int compare(A09E03_Pais p1, A09E03_Pais p2) {
				return p1.getNome().compareTo(p2.getNome());
			}
		});

		System.out.println("----Iterar sobre o conjunto");
		Iterator<A09E03_Pais> itr = org.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("-------Iterar sobre o conjunto - For each (java 8)");
		for (A09E03_Pais pais : org)
			System.out.println(pais);
		}
}