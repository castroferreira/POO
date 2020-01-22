package aula01;

import java.util.Scanner;

public class A01E04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double v1, v2, vm;
        
        System.out.print("Indique a velocidade da 1ª metade do caminho: ");
        v1 = sc.nextDouble();
        
        System.out.print("Indique a velocidade da 2ª metade do caminho: ");
        v2 = sc.nextDouble();

        vm = (2*v1*v2) / (v1+v2);
        System.out.printf("A velocidade média de transporte do ponto A para o ponto B é %.2f.", vm);
    }
}