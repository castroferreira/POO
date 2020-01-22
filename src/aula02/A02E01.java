package aula02;
import java.util.Scanner;
import static java.lang.System.*;
public class A02E01 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double notaP, notaT, notaF;
        
        out.println("Notas de Programação Orientada a Objetos");
        
        do{
            out.print("\nNota da componente teórica: ");
            notaT = sc.nextDouble();
            
            if(notaT < 7.0)
                out.print("66 - Reprovado por nota mínima.");
        }while(notaT < 0 || notaT > 20);
        
        do{
            out.print("Nota da componente prática: ");
            notaP = sc.nextDouble();
            
            if(notaP < 7.0)
                out.print("66 - Reprovado por nota mínima.");
        }while(notaP < 0 || notaP > 20);
        
        notaF = Math.round( (0.4*notaT) + (0.6*notaP) );
        
        if(notaF < 9.5)
            out.println("O aluno obteve uma nota final de " + notaF + " valores: Reprovado");
        
        else
            out.println("O aluno obteve uma nota final de " + notaF + " valores: Aprovado");
    }
}