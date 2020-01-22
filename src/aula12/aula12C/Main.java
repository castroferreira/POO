package aula12.aula12C;

import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main ap = new Main();
		ap.alinea1();
		ap.alinea2();
		ap.alinea3();
	}

	public void alinea1() {
		System.out.println("\nA1)");
		Escola ih = new Escola("International House Aveiro", "Rua Domingos Carrancho, 1, 3800-145 Aveiro");
		out.printf("Tipo  \tTitulo \tProfessor \tData/Hora  \tSalas \n");
		ExameEscrito e1 = new ExameEscrito("Inglês para Empresas", "Anthony Laurel", "12.06.2015 15h", "15; 22", 4); // 4 versões
		e1.setConsulta(true);
		e1.setPrazo(6);
		ih.add(e1);
		ih.add(new ExameEscrito("Alemão", "Manfred Glesner", "12.06.2015 10h", "13"));
		TesteComputador t1 = new TesteComputador("Italiano Intermédio", "Luca Benini", "01.06.2015 10h", "25");
		t1.setLink("http://www.ihaveiro.com/outras-linguas/tii");
		ih.add(t1);
		ih.add(new ProvaOral("Inglês Avançado", "Anthony Laurel", "05.06.2015 10h", "3", Lingua.UK));
		System.out.println(ih); // imprime todas as provas da escola
		System.out.println(ih);
		try {
			PrintWriter fl = new PrintWriter(new File("output2.txt"));
			fl.println(ih);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void alinea2() {
		System.out.println("\nA2)");
		Escola ih = new Escola("International House Aveiro", "Rua Domingos Carrancho, 1, 3800-145 Aveiro");
		ExameEscrito e1 = new ExameEscrito("Inglês para Empresas", "Anthony Laurel", "12.06.2015 15h", "15 e 22", 4); // versões
		e1.setConsulta(true);
		e1.setPrazo(6);
		ih.add(e1);
		ih.add(new ExameEscrito("Alemão", "Manfred Glesner", "12.06.2015 10h", "13"));
		TesteComputador t1 = new TesteComputador("Italiano Intermédio", "Luca Benini", "01.06.2015 10h", "25");
		t1.setLink("http://www.ihaveiro.com/outras-linguas/tii");
		ih.add(t1);
		ih.add(new ProvaOral("Inglês Avançado", "Anthony Laurel", "05.06.2015 10h", "3", Lingua.UK));

		// ordenacao por nome de curso
		Collections.sort(ih.getTestesOrdenados(), new Comparator<Teste>() {
			@Override
			public int compare(Teste t1, Teste t2) {
				return t1.getNomeDisciplina().compareTo(t2.getNomeDisciplina());
			}
		});
		// print da ordenacao: Teste + prazo
		System.out.println("Apenas provas ordenadas: ");
		System.out.println(ih.getTestesOrdenados());

		System.out.println("\nTodas as provas da escola: ");
		System.out.println(ih); // imprime todas as provas da escola

		try {
			PrintWriter fl = new PrintWriter(new File("output22.txt"));
			fl.println(ih);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void alinea3() {
		System.out.println("\nA3)");
		String[] str = { "Anthony Laurel", "Luca Benini", "Adolfo Mendoza", "Manfred Glesner" };
		int countAnthony = 0, countLuca = 0, countAdolfo = 0, countManfred = 0;
		try {
			Scanner scanner = new Scanner(new File("samples_s2.txt"));
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				if (linha.contains(str[0])) {
					countAnthony++;
				}
				if (linha.contains(str[1])) {
					countLuca++;
				}
				if (linha.contains(str[2])) {
					countAdolfo++;
				}
				if (linha.contains(str[3])) {
					countManfred++;
				}
			}
			StringBuilder s = new StringBuilder();
			s.append(str[0] + ":" + countAnthony + " provas\n" + str[1] + ":" + countLuca + " provas\n" + str[2] + ":"
					+ countAdolfo + " provas\n" + str[3] + ":" + countManfred + " provas\n");
			System.out.println(s);
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		
		//out.printf("%s  \t %s \t %s \t %s  \t %s \n",pratica,teorica,notaF);
	}
}
