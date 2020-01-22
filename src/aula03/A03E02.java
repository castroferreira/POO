package aula03;

import java.util.Scanner;
import static java.lang.System.*;

public class A03E02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		out.print("Escreva um paragrafo: ");
		String texto = sc.nextLine();
		
		String[] novaFrase = texto.trim().split("[.?!]+");
		int frases = novaFrase.length;
		
		out.println("\nO paragrafo tem " +frases+ " frases.\n");
		
		for(String novaFrase1 : novaFrase)
			out.println(novaFrase1);
	}
}