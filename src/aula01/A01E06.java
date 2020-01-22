package aula01;

import java.util.Scanner;
import static java.lang.System.*;


public class A01E06 {
        private double x,y;
        
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        out.println("Coordenadas do Ponto 1");
        A01E06 p1 = new A01E06();
        out.print("Coordenada x: ");
        p1.x = sc.nextDouble();
        out.print("Coordenada y: ");
        p1.y = sc.nextDouble();
       
        out.println("Coordenadas do Ponto 2");
        A01E06 p2 = new A01E06();
        out.print("Coordenada x: ");
        p2.x = sc.nextDouble();
        out.print("Coordenada y: ");
        p2.y = sc.nextDouble();
        
        double distancia = Math.sqrt( Math.pow(p2.x - p1.x , 2) - Math.pow(p2.y - p1.y , 2));
        out.printf("A distância entre o Ponto 1 e o Ponto 2 e %.3f.", distancia);
    }
}