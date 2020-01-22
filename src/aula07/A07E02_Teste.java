package aula07;

import aula05.A05E01_Data;

public class A07E02_Teste {

	public static void main(String[] args) {
		A07E02_IDemo123 id123 = new A07E02_Classe123("Andreia", 14382876, new A05E01_Data (26, 8, 1993));
		metodo123(id123);
		
		A07E02_IDemo1 id1 = new A07E02_Classe123("Daniel", 12345678, new A05E01_Data (8, 5, 1992));
		metodo1(id1);
		
		A07E02_IDemo2 id2 = new A07E02_Classe123("Hugo", 87654321, new A05E01_Data (20, 1, 1997));
		metodo2(id2);
		
		A07E02_IDemo3 id3 = new A07E02_Classe123("Miguel", 14382876, new A05E01_Data (5, 7, 1998));
		metodo3(id3);
		
	}

	private static void metodo123(A07E02_IDemo123 id123) {	
	}

	private static void metodo1(A07E02_IDemo1 id1) {
	}
	
	private static void metodo2(A07E02_IDemo2 id2) {		
	}
	
	private static void metodo3(A07E02_IDemo3 id3) {	
	}
}