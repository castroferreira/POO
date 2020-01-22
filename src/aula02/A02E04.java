package aula02;

import java.util.Scanner;
import static java.lang.System.*;

public class A02E04 {
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
                
        double num = 0, n = 0, max, min, media;
        out.print("Escreva um valor: ");
        num = sc.nextDouble();
        int valores = 1;
        //int tamanhoLista = 0;

//        do{
//            out.print("Numero de valores que contem a lista: ");
//            tamanhoLista = sc.nextInt();  
//        }while(tamanhoLista < 2);
        
//        out.print("Dentro desse intervalo indique "+ tamanhoLista+ " numeros a sua escolha contidos na lista: \n:");
//        num = sc.nextDouble();
//        sc.next();
//        double[] array = new double[tamanhoLista];  
        
        double soma = num;
        max = num;
        min = num;
               
       do{            
            out.print("Escreva um valor: ");
            n = sc.nextDouble();        
            valores++;
            soma+=n;
            if(n>max) max=n;
            else if(n<min) min=n;
        }while(n != num);
        
        media = (double)(soma/valores);
                            
        out.println("");
        out.println("Maximo: " + max);
        out.println("Minimo: " + min);
        out.println("Media: " + media);
        out.println("Numero de elementos lidos: " + valores);
        sc.close();
        }
}