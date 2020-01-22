package aula12.aula12B;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		Main ap = new Main();
		ap.alinea1();
		// ap.alinea2();
		// ap.alinea3();
	}

	public void alinea1() {
		Biblioteca bAveiro = new Biblioteca("Biblioteca Municipal de Aveiro",
				"Largo Dr. Jaime Magalhães Lima, 3800 - 156 Aveiro, Portugal");
		bAveiro.add(new Livro("História da Europa", "Lisboa: Dom Quixote", "Jean-Baptiste Duroselle", "972-20-0824-2"));
		bAveiro.add(new Livro("Papillon", "Amadora: Bertrand", "Henri Charrière"));
		bAveiro.add(new Livro("Branca de neve e os sete anões", "Abril Morumbi", "Jacob Grimm; Wilhelm Grimm"));
		bAveiro.add(new Revista("Revista municipal", "Aveiro: C.M.A.", "0874-727X"));
		// bAveiro.add(new Jornal("Diário de notícias"), Ver.CORES);
		// Jornal gaf = new Jornal("O gafanhoto");
		// gaf.setPeriodicidade(Period.BIMESTRAL);
		// bAveiro.add(gaf);
		System.out.println(bAveiro); // imprime todas as publicações da
		try {
			PrintWriter fl = new PrintWriter(new File("output.txt"));
			fl.println(bAveiro);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}