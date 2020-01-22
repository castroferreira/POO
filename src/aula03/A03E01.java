package aula03;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.String;

public class A03E01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase1, frase2;
		
		out.print("Escreva uma frase: ");
		frase1 = sc.nextLine();
		
		out.print("Escreva outra frase: ");
		frase2 = sc.nextLine();
		
		int nCharFrase1 = frase1.length();
		int nCharFrase2 = frase2.length();
		
		// Imprimir numero total de carateres em ambas as Strings
		out.print("\nA primeira frase contem " +nCharFrase1+" caracteres e a segunda frase contem " +nCharFrase2+ " caracteres.");
		
		// Imprimir o ultimo carater da primeira String
		char charFrase1 = frase1.charAt(nCharFrase1 - 1);
		out.print("\nO ultimo caracter da primeira frase: " +charFrase1);
		
		// Indicar se as duas Strings são iguais
		if(frase1.equals(frase2)) out.print("\nAs frases sao iguais.");
		else out.print("\nAs frases sao diferentes.");
		
		// Indicar se a segunda String acaba com “.” (ponto)
		if(frase2.charAt(nCharFrase2 - 1) == '.') out.println("\nA segunda frase termina com ponto.");
		else out.print("\nA segunda frase nao termina com ponto.");
		
		// Indicar se a segunda String só tem minusculas
		boolean minusculas = true;
		
		for(int i = 0; i<nCharFrase2; i++){
			Character letra = frase2.charAt(i);
			
			if(!Character.isLowerCase(letra)){
				minusculas=false; break;
			}
		}
		
		if(minusculas) out.print("\nA segunda frase esta toda em minusculas.");
		else out.print("\nA segunda frase nao esta toda em minusculas.");
		
		// Converter todos os carateres ds Strings para minusculas e imprimir o resultado
		out.print("\nA segunda frase em minusculas fica assim: " +frase2.toLowerCase());
		
		// Substituir todas as ocorrencias de varios espaços seguidos por um unico espaço
		//Sugestão (1): para manipular Strings recorra aos metodos da classe java.lang.String.
		frase1 = frase1.replaceAll(" +"," ");
		out.printf("\nA primeira frase sem espacos fica assim: "+ frase1);
		
		frase2 = frase2.replaceAll(" +"," ");
		out.printf("\nA segunda frase sem espacos fica assim: "+ frase2);
	}
}