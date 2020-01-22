package aula05;

import static java.lang.System.*;

public class A05E02 {

	public static void main(String[] args) {
		
		A05E02_ponto p1 = new A05E02_ponto(2,3);
		A05E02_ponto p2 = new A05E02_ponto(3,2);
		A05E02_circulo c1 = new A05E02_circulo(2,p1,"amarelo");
		A05E02_circulo c2 = new A05E02_circulo(3,p2,"verde");
		A05E02_quadrado q1 = new A05E02_quadrado(3,p1,"azul");
		A05E02_quadrado q2 = new A05E02_quadrado(4,p2,"rosa");
		A05E02_retangulo r1 = new A05E02_retangulo(5,2,p2,"vermelho");
		A05E02_retangulo r2 = new A05E02_retangulo(2,5,p2,"preto");
				
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
		
		out.print("\nQUADRADO 1\n");
		out.print("Perimetro: " +q1.perimetro()+ "\n");
		out.print("Area: " +q1.area()+ "\n");
		out.println(q1);
		out.println();
		
		out.print("\nQUADRADO 2\n");
		out.print("Perimetro: " +q2.perimetro()+ "\n");
		out.print("Area: " +q2.area()+ "\n");
		out.println(q2);
		out.println();
		
        out.print("RETANGULO 1\n");
		out.print("Perimetro: " +r1.perimetro()+ "\n");
		out.print("Area: " +r1.area()+ "\n");
		out.println(r1);
		out.println();
		
		out.print("RETANGULO 2\n");
		out.print("Perimetro: " +r2.perimetro()+ "\n");
		out.print("Area: " +r2.area()+ "\n");
		out.println(r2);
		out.println();
		
		double distancia = Math.sqrt( Math.pow(p2.getX() - p1.getX() , 2) - Math.pow(p2.getY() - p1.getY() , 2));
		
		if( (c1.getRaio() + c2.getRaio()) >= distancia )
			err.print("Os circulos intercetam-se ");
		else
			err.print("Os circulos nao se intercetam ");
		
		err.print(c1.equals(c2) ? "e sao iguais.\n" : "e sao diferentes.\n");
		
		err.println("1º Quadrado com o 1º Retangulo");
        err.println(q1.equals(r1) ? "Iguais" : "Diferentes");
        
        err.println("1º Quadrado com o 2º Retangulo");
        err.println(q1.equals(r2) ? "Iguais" : "Diferentes");
        
        err.println("2º Quadrado com o 1º Retangulo");
        err.println(q2.equals(r1) ? "Iguais" : "Diferentes");
        
        err.println("2º Quadrado com o 2º Retangulo");
        err.println(q2.equals(r2) ? "Iguais" : "Diferentes");
	}
}