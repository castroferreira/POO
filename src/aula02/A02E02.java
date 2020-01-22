package aula02;

import java.util.Scanner;
import static java.lang.System.*;

public class A02E02 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int n = 0;
        
        do{
            out.print("Escreva um número positivo: ");
            n = sc.nextInt();
        }while(n<0);
        
        out.print("Contagem decrescente: ");
        
        while(n>0){
            out.print(n + " - ");
            n--;
        }
    }
}