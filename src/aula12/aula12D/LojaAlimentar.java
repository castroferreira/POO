package aula12.aula12D;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class LojaAlimentar {
	private String nome, endereco;
	private List<Alimento> alimentos = new ArrayList<>();
	private List<List<String>> ficheiro = new ArrayList<>();
	private Map<String, Integer> map = new TreeMap<>();

	public LojaAlimentar(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
	}

	public List<List<String>> getFicheiro() {
		return ficheiro;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public void setFicheiro(List<List<String>> ficheiro) {
		this.ficheiro = ficheiro;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public void add(Alimento a) {
		alimentos.add(a);
	}

	public void ordenar() {
		List<String> a = new ArrayList<>();
		
		for (int i = 0; i < alimentos.size(); i++)
			if (alimentos.get(i) instanceof Frigorifico)
				a.add(alimentos.get(i).getNome());
			
		
		Collections.sort(a);
		for (int i = 0; i < a.size(); i++)
			for (int e = 0; e < alimentos.size(); e++)
				if (a.get(i).equals(alimentos.get(e).getNome()))
					System.out.println(alimentos.get(e));	
	}
	
	public void lerFicheiro() {
		Scanner input;
		try {
			List<String> adicionarDados=new ArrayList<>();
			File f=new File("samples.txt");
			input =new Scanner(new FileInputStream(f));
			while (input.hasNextLine()) {
				String word = input.nextLine();
				String[] dados=word.split("\\t");
				for (int i=0;i<dados.length;i++) {
					adicionarDados.add(dados[i]);
					if ((i+1)==dados.length) {
						List<String> adicionarLista=new ArrayList<>();
						adicionarLista.addAll(adicionarDados);
						ficheiro.add(adicionarLista);
						adicionarDados.clear();
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro nao existente.");
		}
	}
	public void dataAlimentos() {
		for (int i=1;i<ficheiro.size();i++)
			for (int e=0;e<ficheiro.get(i).size();e++)
				if (e==4) {
					if (map.containsKey(ficheiro.get(i).get(e)))
						map.put(ficheiro.get(i).get(e), map.get(ficheiro.get(i).get(e))+1);
					
					else map.put(ficheiro.get(i).get(e), 1);	
				}
			
		
	}
	public void dataAlimentos2() {
		for (int i=1;i<ficheiro.size();i++) 
			for (int e=0;e<ficheiro.get(i).size();e++)
				if (e==4) {
					if (map.containsKey(ficheiro.get(i).get(e))) 
						map.put(ficheiro.get(i).get(e), map.get(ficheiro.get(i).get(e))+1);
					
					else map.put(ficheiro.get(i).get(e), 1);
				}
	}
	
	public void printMap() {
		Set<Entry<String, Integer>> set=map.entrySet();
		System.out.println("Data de Validade      Alimentos");
		for (Entry<String,Integer> el:set)
			System.out.println(el.getKey()+"                "+el.getValue());
	}
	
	@Override
	public String toString() {
		String a="" +getNome()
		+ ", " + getEndereco()
		+ "\n\nALIMENTOS\n";
		StringBuilder sb=new StringBuilder();
		for (Alimento el:alimentos) {
			sb.append(el+"\n");
		}
		String alimentos=sb.toString();
		return a+alimentos;
	}
}