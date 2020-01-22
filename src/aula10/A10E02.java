package aula10;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import static java.lang.System.*;

public class A10E02 {
	public static void main(String[] args) {
		List<String> ficheiro = new ArrayList<String>();

		try {
			File f = new File("src\\aula10\\major.txt");
			Scanner sc = new Scanner(new FileInputStream(f));

			while (sc.hasNextLine()) {
				String word = sc.nextLine();
				String[] dados = word.split("[\\s\\t\\n\\.,:'‘’;\\?!-\\*\\{\\}=\\+&/\\(\\)\\[\\]”“\"\']");

				for (int i = 0; i < dados.length; i++) {
					if (dados[i].length() >= 3)
						ficheiro.add(dados[i].toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			out.print("Ficheiro nao existente.");
		}
		
		out.println(ficheiro);
		Map<String, Map<String, Integer>> pares = new TreeMap<>();
		
		for(int i=0; i+1<ficheiro.size(); i++){
			if(!pares.containsKey(ficheiro.get(i))){
				Map<String, Integer> m = new TreeMap<>(); 
				if(m.containsKey(ficheiro.get(i+1)))
					m.put(ficheiro.get(i+1), m.get(ficheiro.get(i+1))+1);
				else
					m.put(ficheiro.get(i+1), 1);
				pares.put(ficheiro.get(i), m);
			}
			else{
				Map<String, Integer> m1 = pares.get(ficheiro.get(i));
				if(m1.containsKey(ficheiro.get(i+1)))
					m1.put(ficheiro.get(i+1), m1.get(ficheiro.get(i+1))+1);
				else
					m1.put(ficheiro.get(i+1), 1);
				pares.put(ficheiro.get(i), m1);
			}
		}
		Set<Entry<String, Map<String, Integer>>> s = pares.entrySet();
		for(Entry<String, Map<String, Integer>> d : s)
			out.println(d);
	}
}