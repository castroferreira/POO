package aula03;
import static java.lang.System.*;
import static java.lang.Math.sqrt;

public class A03E03 {

	public static void main(String[] args) {
		
		A03E03_ponto p1 = new A03E03_ponto(2,3);
		A03E03_ponto p2 = new A03E03_ponto(3,2);
		A03E03_circulo c1 = new A03E03_circulo(2,p1,"amarelo");
		A03E03_circulo c2 = new A03E03_circulo(3,p2,"verde");
		A03E03_quadrado q = new A03E03_quadrado(3, "azul");
		A03E03_retangulo r = new A03E03_retangulo(5,2,"vermelho");
				
		out.println("LISTA DE FIGURAS");
		out.println();
		
		out.print("CIRCULO 1\n");
		out.print("Perimetro: " +c1.perimetro()+ "\n");
		out.print("Area: " +c1.area()+ "\n");
		out.println();
		
		out.print("CIRCULO 2\n");
		out.print("Perimetro: " +c2.perimetro()+ "\n");
		out.print("Area: " +c2.area()+ "\n");
		out.println();
		
		out.print("QUADRADO\n");
		out.print("Perimetro: " +q.perimetro()+ "\n");
		out.print("Area: " +q.area()+ "\n");
		out.println();
		
		out.print("RETANGULO\n");
		out.print("Perimetro: " +r.perimetro()+ "\n");
		out.print("Area: " +r.area()+ "\n");
		out.println();
		
		double distancia = Math.sqrt( Math.pow(p2.x - p1.x , 2) - Math.pow(p2.y - p1.y , 2));
		
		if( (c1.raio + c2.raio) >= distancia )
			out.println("Os circulos intercetam-se.");
		else
			out.println("Os circulos nao se intercetam.");
	}
}