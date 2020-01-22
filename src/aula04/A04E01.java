package aula04;

import static java.lang.System.*;

public class A04E01 {

	public static void main(String[] args) {
		
		A04E01_ponto p1 = new A04E01_ponto(2,3);
		A04E01_ponto p2 = new A04E01_ponto(3,2);
		A04E01_circulo c1 = new A04E01_circulo(2,p1,"amarelo");
		A04E01_circulo c2 = new A04E01_circulo(3,p2,"verde");
		A04E01_quadrado q = new A04E01_quadrado(3,p1,"azul");
		A04E01_retangulo r = new A04E01_retangulo(5,2,p2,"vermelho");
				
		out.println("LISTA DE FIGURAS");
		out.println();
		
		out.print("CIRCULO 1\n");
		out.print("Perimetro: " +c1.perimetro()+ "\n");
		out.print("Area: " +c1.area()+ "\n");
		out.println(c1);
		out.println();
		
		out.print("CIRCULO 2\n");
		out.print("Perimetro: " +c2.perimetro()+ "\n");
		out.print("Area: " +c2.area()+ "\n");
		out.println(c2);
		out.println();
		
			double distancia = Math.sqrt( Math.pow(p2.getX() - p1.getX() , 2) - Math.pow(p2.getY() - p1.getY() , 2));
			
			if( (c1.getRaio() + c2.getRaio()) >= distancia )
				err.print("Os circulos intercetam-se ");
			else
				err.print("Os circulos nao se intercetam ");
			
			err.print(c1.equals(c2) ? "e sao iguais.\n" : "e sao diferentes.\n");
		
		out.print("\nQUADRADO\n");
		out.print("Perimetro: " +q.perimetro()+ "\n");
		out.print("Area: " +q.area()+ "\n");
		out.println(q);
		out.println();
		
		out.print("RETANGULO\n");
		out.print("Perimetro: " +r.perimetro()+ "\n");
		out.print("Area: " +r.area()+ "\n");
		out.println(r);
		out.println();
	}
}