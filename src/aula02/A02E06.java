package aula02;

import java.util.Scanner;
import static java.lang.System.*;

public class A02E06 {
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int numero, tentativas=0;
        int rand = (int)(Math.random()*100);
        String resposta ="";
        
        do{
            out.print("Escreva um numero no intervalo [1,100]: ");
            numero = sc.nextInt();
            tentativas++;
            
            if( numero == rand){
                out.printf("\nParabens, adivinhou o numero ao fim de %d tentativas.\n", tentativas);
                
                out.print("\nNovo Jogo? (Sim/Nao): ");
                resposta = sc.next();
                
                if(resposta.equals("Nao") || resposta.equals("nao") || resposta.equals("NAO"))
                    exit(0);
                
                if(resposta.equals("Sim") || resposta.equals("sim") || resposta.equals("SIM")){
                    tentativas = 0;
                    rand = (int)(Math.random()*100);
                }
            }
            
            else if(numero>rand) err.println("Tente um numero mais baixo.");
            else err.println("Tente um numero mais alto.");
        }while( (numero<1 || numero>100) || numero!=rand || resposta.equals("Sim") || resposta.equals("sim") || resposta.equals("SIM") );
    }
}