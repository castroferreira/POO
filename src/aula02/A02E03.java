package aula02;

import static java.lang.System.*;
import java.util.Scanner;

public class A02E03 {
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int n = 0;
        
        do{
            out.print("Escreva um número: ");
            n = sc.nextInt();
        }while(n<0);
       
        if(primo(n))
            out.println("O numero " +n+ " é primo.");
        
        else
            out.println("O numero " +n+ " não é primo.");
    }
        
        public static boolean primo(int n){
            
            if(n == 1) return true;
            
            else if (n == 2) return true;
            
            for(int i = 2; i<n; i++)
                if(n%i == 0)
                    return false;
            
            return true;
        }
}