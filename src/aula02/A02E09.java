package aula02;

import java.util.Scanner;

public class A02E09 {
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Escreva um valor no intervalo [-128,127]: ");
        byte valor = sc.nextByte();
        
        int binario = valor;
        System.out.print("Resultado em binario: ");
        
        for(int i = 0; i<8; i++){
            System.out.print( ( (binario & 0x80) == 0 ) ? 0:1 );
            binario <<= 1;
        }
        
        System.out.print("\n\n");
    }
}