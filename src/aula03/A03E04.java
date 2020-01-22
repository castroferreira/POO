package aula03;

import java.util.Scanner;

import javax.crypto.CipherInputStream;

import static java.lang.System.*;

public class A03E04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaSemana = 0, mes, ano, diaMes;
		out.print("CALENDARIO\n\n");
        do{
            out.print("Escreva o numero do mes: ");
            mes = sc.nextInt();
        }while(mes < 0 || mes>12);
        
        do{
            out.print("Escreva o ano: ");
            ano = sc.nextInt();
        }while(ano < 0 );
        
        out.print("\n(1=segunda, 2=terca, 3=quarta, 4=quinta, 5=sexta, 6=sabado, 7=domingo)\nEm que dia da semana comeca o mes? ");
        diaSemana=sc.nextInt();
        out.print("\n----------------------\n");
        
        diaMes = diasMes(ano, mes);
        
        switch(mes){
        case 1: out.printf("|    january %4d    |\n", ano); break;
        case 2: out.printf("|    february %4d   |\n", ano); break;
        case 3: out.printf("|     march %4d     |\n", ano); break;
        case 4: out.printf("|     april %4d     |\n", ano); break;
        case 5: out.printf("|      may %4d      |\n", ano); break;
        case 6: out.printf("|      june %4d     |\n", ano); break;
        case 7: out.printf("|      july %4d     |\n", ano); break;
        case 8: out.printf("|     august %4d    |\n", ano); break;
        case 9: out.printf("|   september %4d   |\n", ano); break;
        case 10: out.printf("|    october %4d    |\n", ano); break;
        case 11: out.printf("|    november %4d   |\n", ano); break;
        case 12: out.printf("|    december %4d   |\n", ano); break;
        default: break;
        }
        calendario(diaSemana, diaMes);
	}
	
	public static int diasMes(int a, int m){
		int d = 0;
		
		boolean bissexto;
        if( (a%4==0) && ( (a%100!=0) || (a%400==0) ) ) bissexto = true;
        else bissexto = false;
        
		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) d=31;
		else if(m==4 || m==6 || m==9 || m==11) d=30;
        else if(m==2){
        	if(bissexto==true) d=28;
        	else d=28;
        }
        
        return d;
	}
	
	public static void calendario(int diaS, int diaM){
		int contDias=1,contSemanas=1;
		boolean espacos = true;
		
		out.print("----------------------\n");
		out.print("|Mo Tu We Th Fr Sa Su|\n");
		out.print("----------------------\n");
		
		for(contDias=1; contDias<= diaM;){
			out.printf("|");
			
			while(contSemanas < diaS){
				out.printf("   ");
				contSemanas++;
			}
			
			if(contSemanas == diaS) diaS=0;
			
			while(contSemanas<7 && contDias<=diaM){
				out.printf("%2d ", contDias);
				contDias++;
				contSemanas++;
			}
			
			if(contSemanas==7 && contDias<=diaM){
				out.printf("%2d|\n", contDias);
				if(contDias == diaM) espacos=false;
				contDias++;
				contSemanas=1;
			}
		}
		
		if(espacos==true){
			if(contSemanas==7) out.printf("  |\n");
			else if(contSemanas==1) out.printf("   ");
			else if(contSemanas<7 && contSemanas>1) out.printf("   ");
			contSemanas++;
		}
		
		out.print("----------------------");
	}
}