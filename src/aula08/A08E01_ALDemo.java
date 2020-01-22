package aula08;

import java.util.*;
import static java.lang.System.*;

public class A08E01_ALDemo {
	public static void main(String[] args) {
		List<Integer> c1 = new ArrayList<>();// lista de integers
		
		for (int i = 10; i <= 100; i += 10)
			c1.add(i);
		
		// adicionamos 10 a 10 numa lista anteriormente vazia
		out.println("Size: " + c1.size());
		
		for (int i = 0; i < c1.size(); i++)
			out.println("Elemento: " + c1.get(i));
		
		// size = 10 , iteraremos a lista anterior e vamos imprimir os seus valores
		List<String> c2 = new ArrayList<>(); // lista de strings
		c2.add("Chuva");
		c2.add("Frio");
		c2.add("Vento");
		out.println("Size: " + c2.size());
		
		
		for (int i = 0; i < c2.size(); i++)
			out.println("Elemento: " + c2.get(i));
		
		c2.remove(0); // frio, vento
		c2.remove(0);// vento
		// c2.remove(0);
		// if (c2.isEmpty()){System.out.println("Esta lista está vazia");}
		// else {System.out.println("Esta Lista Não Está Vazia");}
		for (int i = 0; i < c2.size(); i++)
			out.println("Elemento: " + c2.get(i));
		
	}
}