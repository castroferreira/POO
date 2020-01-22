package aula10;

import java.io.*;
import java.util.*;

public class A10E01_Teste {
	public static void main(String[] args) {
		Scanner input;
		try {
			input = new Scanner(new File("src\\aula10\\words.txt"));
			while (input.hasNext()) {
				String word = input.next();
				System.out.println(word);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro não existente.");
		}
	}
}