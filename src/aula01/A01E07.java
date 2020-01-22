package aula01;

import java.util.Scanner;
import static java.lang.System.*;

public class A01E07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a, b;
        
        out.print("Introduza o valor do cateto A: ");
        a = sc.nextInt();
        
        out.print("Introduza o valor do cateto B: ");
        b = sc.nextInt();
        
       double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
       out.printf("A soma do quadrado dos catetos é igual à hipotnusa, assim obtém-se: %.2f",c);
       
       out.println();
       double angulo = Math.toDegrees( Math.acos(a/c));
       out.printf("O ângulo formado entre o cateto A e a Hipotenusa tem um valor de %.3f", angulo);
    }
}