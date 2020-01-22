package aula10;

import java.util.*;
import java.util.Map.Entry;
import static java.lang.System.*;
import java.io.*;

public class A10E03_Voo {
	private static Scanner sc;
	private static List<List<String>> ficheiroVoo = new ArrayList<>();
	private static List<List<String>> ficheiroCompanhias = new ArrayList<>();
	private static Map<String, String> siglaCompanhia = new LinkedHashMap<>();
	private static Map<String, Integer> atrasoCompanhia = new TreeMap<>();
	private static Map<String, Integer> companhiaVoos = new TreeMap<>();
	private static Map<String, Integer> mediaAtraso = new TreeMap<>();
	private static Map<String, Integer> origemTotal = new TreeMap<>();
	private static List<List<String>> tabela = new ArrayList<>();

	static public void lerFicheiroVoo() {
		try {
			List<String> adicionarDados = new ArrayList<>();
			sc = new Scanner(new File("src\\aula10\\voos.txt"));

			while (sc.hasNextLine()) {
				String word = sc.nextLine();
				String[] dados = word.split("\\t");

				for (int i = 0; i < dados.length; i++) {
					adicionarDados.add(dados[i]);

					if ((i + 1) == dados.length) {
						List<String> adicionarLista = new ArrayList<>();
						adicionarLista.addAll(adicionarDados);
						ficheiroVoo.add(adicionarLista);
						adicionarDados.clear();
					}
				}
			}
		} catch (FileNotFoundException e) {
			err.println("Ficheiro nao existente.");
			exit(0);
		}
	}

	public void lerFicheiroCompanhia() {
		try {
			List<String> adicionarDados = new ArrayList<>();
			sc = new Scanner(new File("src\\aula10\\companhias.txt"));

			while (sc.hasNextLine()) {
				String word = sc.nextLine();
				String[] dados = word.split("\\t");

				for (int i = 0; i < dados.length; i++) {
					adicionarDados.add(dados[i]);

					if ((i + 1) == dados.length) {
						List<String> adicionarLista = new ArrayList<>();
						adicionarLista.addAll(adicionarDados);
						ficheiroVoo.add(adicionarLista);
						adicionarDados.clear();
					}
				}
			}
		} catch (FileNotFoundException e) {
			err.println("Ficheiro nao existente.");
		}

		for (int i = 1; i < ficheiroCompanhias.size(); i++)
			for (int j = 0; j < ficheiroCompanhias.get(i).size(); j++) {
				siglaCompanhia.put(ficheiroCompanhias.get(i).get(j), ficheiroCompanhias.get(i).get(j + 1));
				j++;
			}
	}

	public void formarTabela() {
		for (int i = 1; i < ficheiroVoo.size(); i++) {
			List<String> adicionarTabela = new ArrayList<>();
			for (int j = 0; j < ficheiroVoo.get(i).size(); j++) {
				if (j == 2) {
					if (siglaCompanhia.containsKey(ficheiroVoo.get(i).get(j - 1).substring(0, 2))) {
						adicionarTabela.add(j, siglaCompanhia.get(ficheiroVoo.get(i).get(j - 1).substring(0, 2)));
						if ((j + 1) == ficheiroVoo.get(i).size()) {
							adicionarTabela.add(ficheiroVoo.get(i).get(j));
							if (origemTotal.containsKey(ficheiroVoo.get(i).get(j)))
								origemTotal.put(ficheiroVoo.get(i).get(j),
										origemTotal.get(ficheiroVoo.get(i).get(j)) + 1);
							else
								origemTotal.put(ficheiroVoo.get(i).get(j), 1);
						} else {
							adicionarTabela.add(j, "Não existe companhia");
							if ((j + 1) == ficheiroVoo.get(i).size()) {
								adicionarTabela.add(ficheiroVoo.get(i).get(j));
								if (origemTotal.containsKey(ficheiroVoo.get(i).get(j)))
									origemTotal.put(ficheiroVoo.get(i).get(j),
											origemTotal.get(ficheiroVoo.get(i).get(j)) + 1);
								else
									origemTotal.put(ficheiroVoo.get(i).get(j), 1);
							} else
								adicionarTabela.add(j, "Não existe companhia");

							if ((j + 1) == ficheiroVoo.get(i).size()) {
								adicionarTabela.add(ficheiroVoo.get(i).get(j));
								if (origemTotal.containsKey(ficheiroVoo.get(i).get(j)))
									origemTotal.put(ficheiroVoo.get(i).get(j),
											origemTotal.get(ficheiroVoo.get(i).get(j)) + 1);
							} else
								origemTotal.put(ficheiroVoo.get(i).get(j), 1);
						}
					}
				} else if (j == 3) {
					adicionarTabela.add(j, ficheiroVoo.get(i).get(j - 1));
					if (origemTotal.containsKey(ficheiroVoo.get(i).get(j - 1)))
						origemTotal.put(ficheiroVoo.get(i).get(j - 1),
								origemTotal.get(ficheiroVoo.get(i).get(j - 1)) + 1);
					else
						origemTotal.put(ficheiroVoo.get(i).get(j - 1), 1);

					String[] horasdoVoo = ficheiroVoo.get(i).get(0).split("\\:");
					int horasVoo = Integer.parseInt(horasdoVoo[0]);
					int minutosVoo = Integer.parseInt(horasdoVoo[1]);
					int minutosVooTotal = horasVoo * 60 + minutosVoo;
					String[] horasdoAtraso = ficheiroVoo.get(i).get(j).split("\\:");
					int horasAtraso = Integer.parseInt(horasdoAtraso[0]);
					int minutosAtraso = Integer.parseInt(horasdoAtraso[1]);
					int minutosAtrasoTotal = horasAtraso * 60 + minutosAtraso;
					int minutosTotalVoo_Atraso = minutosVooTotal + minutosAtrasoTotal;
					int segundosTotal = minutosTotalVoo_Atraso * 60;
					String horasPrevistas = String.format("Previsto: %02d:%02d", segundosTotal / 3600,
							(segundosTotal % 3600) / 60);
					adicionarTabela.add(j + 1, ficheiroVoo.get(i).get(j));
					adicionarTabela.add(j + 2, horasPrevistas);
				} else
					adicionarTabela.add(j, ficheiroVoo.get(i).get(j));
			}
			tabela.add(adicionarTabela);
		}
	}

	public void printTabela() {
		out.println("Hora			      Voo		            Companhia		      Origem		        Atraso			      Obs");
		for (List<String> t : tabela) {
			String s = "";
			for (int i = 0; i < t.size(); i++) {
				s += String.format("%-22s", t.get(i));
			}
			out.println(s);
		}
	}

	public void guardarTabela() {
		try {
			FileWriter writer = new FileWriter("src\\aula10\\InfoPublico.txt");
			writer.write("Hora			      Voo		            Companhia		      Origem		        Atraso			      Obs\n");
			for (List<String> t : tabela) {
				for (int i = 0; i < t.size(); i++) {
					writer.write(String.format("%-22s", t.get(i)));
				}
				writer.write("\n");
			}
			writer.close();
		} catch (IOException e) {
		}
	}

	public void atrasos() {
		for (int i = 0; i < tabela.size(); i++) {
			if (tabela.get(i).size() == 6) {
				String[] horasdoAtraso = tabela.get(i).get(4).split("\\:");
				int horasAtraso = Integer.parseInt(horasdoAtraso[0]);
				int minutosAtraso = Integer.parseInt(horasdoAtraso[1]);
				int minutosAtrasoVoo = horasAtraso * 60 + minutosAtraso;
				if (companhiaVoos.containsKey(tabela.get(i).get(2)))
					companhiaVoos.put(tabela.get(i).get(2), companhiaVoos.get(tabela.get(i).get(2)) + 1);

				if (!companhiaVoos.containsKey(tabela.get(i).get(2)))
					companhiaVoos.put(tabela.get(i).get(2), 1);

				if (atrasoCompanhia.containsKey(tabela.get(i).get(2)))
					atrasoCompanhia.put(tabela.get(i).get(2),
							atrasoCompanhia.get(tabela.get(i).get(2)) + minutosAtrasoVoo);

				if (!atrasoCompanhia.containsKey(tabela.get(i).get(2)))
					atrasoCompanhia.put(tabela.get(i).get(2), minutosAtrasoVoo);

			} else
				continue;
		}
	}

	public void mediaAtrasos() {
		for (int i = 0; i < tabela.size(); i++) {
			if (atrasoCompanhia.containsKey(tabela.get(i).get(2))) {
				if (mediaAtraso.containsKey(tabela.get(i).get(2)))
					continue;
				else {
					int mediaMinutos = (atrasoCompanhia.get(tabela.get(i).get(2)))/ (companhiaVoos.get(tabela.get(i).get(2)));
					int mediaSegundos = mediaMinutos * 60;
					mediaAtraso.put(tabela.get(i).get(2), mediaSegundos);
				}
			}
		}
		out.println("\n");
		A10E03_OrdenarAtrasoMedio sort = new A10E03_OrdenarAtrasoMedio(mediaAtraso);
		TreeMap<String, Integer> ordenarValores = new TreeMap<String, Integer>(sort);
		ordenarValores.putAll(mediaAtraso);
		Set<Entry<String, Integer>> set = ordenarValores.entrySet();
		System.out.println("Companhia         Atraso médio");
		for (Entry<String, Integer> a : set) {
			System.out.printf("%-22s %02d:%02d", a.getKey(), a.getValue() / 3600, (a.getValue() % 3600) / 60);
			System.out.println();
		}
	}

	public void origemTotal() {
		out.println("\n");
		A10E03_Origem sort = new A10E03_Origem(origemTotal);
		TreeMap<String, Integer> ordenarValores = new TreeMap<String, Integer>(sort);
		ordenarValores.putAll(origemTotal);
		Set<Entry<String, Integer>> set = ordenarValores.entrySet();
		out.println("Origens               Voos");
		for (Entry<String, Integer> o : set) {
			out.printf("%-22s %d", o.getKey(), o.getValue());
			out.println();
		}
	}

	public void guardarFicheiroCidades() {
		try {
			FileWriter writer = new FileWriter("src\\aula10\\cidades.txt");
			A10E03_Origem sort = new A10E03_Origem(origemTotal);
			TreeMap<String, Integer> ordenarValores = new TreeMap<String, Integer>(sort);
			ordenarValores.putAll(origemTotal);
			Set<Entry<String, Integer>> set = ordenarValores.entrySet();
			writer.write("Origens               Voos\n");
			for (Entry<String, Integer> el : set) {
				String a = String.format("%-22s %d\n", el.getKey(), el.getValue());
				writer.write(a);
			}
			writer.close();
		} catch (IOException e) {
		}
	}

	public void guardarFicheiroBin() {
		try {
			RandomAccessFile file = new RandomAccessFile("src\\aula10\\Infopublico.bin", "rw");
			file.writeChars("Hora			      Voo		            Companhia		      Origem		        Atraso			      Obs\n");
			for (List<String> el : tabela) {
				for (int i = 0; i < el.size(); i++)
					file.writeChars(String.format("%-22s", el.get(i)));

				file.writeChars("\n");
			}
			file.close();
		} catch (IOException e) {
		}
	}

	public void lerFicheiroBin() throws IOException {
		try {
			out.println("\n");
			RandomAccessFile file = new RandomAccessFile("src\\aula10\\Infopublico.bin", "rw");
			for (int i = 0; i < file.length(); i++)
				out.print(file.readChar());

			file.close();
		} catch (FileNotFoundException e) {
			out.println("Ficheiro nao existente.");
		} catch (EOFException e) {
		}
	}
}