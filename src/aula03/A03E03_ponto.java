package aula03;

import static java.lang.System.out;

import java.util.Scanner;

public class A03E03_ponto {
    double x,y;
    
    public A03E03_ponto(int x, int y){
    	this.x=x;
    	this.y=y;
    }

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
        
 /*   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    out.println("Coordenadas do Ponto 1");
    A03E03_ponto p1 = new A03E03_ponto();
    out.print("Coordenada x: ");
    p1.x = sc.nextDouble();
    out.print("Coordenada y: ");
    p1.y = sc.nextDouble();
   
    out.println("Coordenadas do Ponto 2");
    A03E03_ponto p2 = new A03E03_ponto();
    out.print("Coordenada x: ");
    p2.x = sc.nextDouble();
    out.print("Coordenada y: ");
    p2.y = sc.nextDouble();
    
    double distancia = Math.sqrt( Math.pow(p2.x - p1.x , 2) - Math.pow(p2.y - p1.y , 2));
    out.printf("A distância entre o Ponto 1 e o Ponto 2 e %.3f.", distancia);
}*/
}