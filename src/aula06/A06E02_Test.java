package aula06;

public class A06E02_Test {
public static void main(String[] args) {
	A06E02_Circulo c1 = new A06E02_Circulo(2);
	A06E02_Circulo c2 = new A06E02_Circulo(1, 3, 2);
	A06E02_Quadrado q1 = new A06E02_Quadrado(2);
	A06E02_Quadrado q2 = new A06E02_Quadrado(3, 4, 2);
	A06E02_Retangulo r1 = new A06E02_Retangulo(2, 3);
	A06E02_Retangulo r2 = new A06E02_Retangulo(3, 4, 2, 3);
	A06E02_ColecaoFiguras col = new A06E02_ColecaoFiguras(42.0);// MaxArea
	System.out.println(col.addFigura(c2));
	System.out.println(col.addFigura(r1));
	System.out.println(col.addFigura(r1));
	System.out.println(col.addFigura(r2));
	System.out.println(col.addFigura(c1));
	System.out.println(col.addFigura(q2));
	System.out.println(col.addFigura(q1));
	System.out.println(col.delFigura(r1));
	System.out.println(col.addFigura(q1));
	System.out.println("\nArea Total: " + col.areaTotal());
	System.out.println("\nLista de Figuras:");
	for (A06E02_Figura f: col.getFiguras())
		System.out.println(f);
	System.out.println("\n\nCirculos na Lista de Figuras:");
	for (A06E02_Figura f: col.getFiguras())
		if (f instanceof A06E02_Circulo)
			System.out.println(f);
	System.out.println("\n\nCentro das Figuras:");
	for (A06E02_Ponto p: col.getCentros())
		System.out.println(p);
}
}