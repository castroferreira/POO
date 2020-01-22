package aula02;

import java.util.Scanner;

public class A02E08 {
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int cont = 0;
        
        System.out.print("Escreva um valor no intervalo [-128,127]: ");
        byte valor = sc.nextByte();
        
        int v = valor;
        
        for(int i = 0; i<8; i++){
            if( (v & 1) == 1 ) cont++;
            v >>>= 1;
        }
        System.out.print("" + valor + " tem " + cont + " bit(s) a um.\n\n");
    }
}