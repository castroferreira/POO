package aula02;

import java.util.Scanner;
import static java.lang.System.*;

public class A02E05 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int mes = 0 , ano = 0, dia=0;
        
        out.println("Formato Data (Mes e Ano)");
        
        do{
            out.print("Escreva o numero do mes: ");
            mes = sc.nextInt();
        }while(mes < 0 || mes>12);
        
        do{
            out.print("Escreva o ano: ");
            ano = sc.nextInt();
        }while(ano < 0 );
        
        switch(mes){
            case 1: dia=31;  out.print("O mes de Janeiro"); break;
            case 2:
                if(bissexto(ano)) dia=29;
                else dia=28;
                out.print("O mes de Fevereiro");
                break;
            case 3: dia=31; out.print("O mes de Março"); break;
            case 4: dia=30; out.print("O mes de Abril"); break;
            case 5: dia=31; out.print("O mes de Maio"); break;
            case 6: dia=30; out.print("O mes de Junho"); break;
            case 7: dia=31; out.print("O mes de Julho"); break;
            case 8: dia=31; out.print("O mes de Agosto"); break;
            case 9: dia=30; out.print("O mes de Setembro"); break;
            case 10: dia=31; out.print("O mes de Outubro"); break;
            case 11: dia=30; out.print("O mes de Novembro"); break;
            case 12: dia=31; out.print("O mes de Dezembro"); break;
        } out.println(" no ano " +ano+ " tem " +dia + " dias.");
    }
    
    private static boolean bissexto(int ano){
        if( (ano%4==0) && ( (ano%100!=0) || (ano%400==0) ) ) return true;
        return false;
    }
}