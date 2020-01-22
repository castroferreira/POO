package aula01;

import java.util.Scanner;

public class A01E03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escreva a temperatura em Célsius: ");
        double c = sc.nextDouble();
        
        // Conversão de Célsius  para Farenheit
        double f = (1.8 * c) +32;
        
        System.out.printf("%.2f Célsius é o equivalente a %.2f Farenheit.", c, f);
    }
}