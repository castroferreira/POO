package aula02;

import static java.lang.System.*;
import java.util.Random;
import java.util.Scanner;

public class A02E07 {
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        Random gerador = new Random();
	
        int[][] matriz = new int[16][3];
        out.println("Notas de Programacao Orientada a Objetos - 2016/2017\n");
        System.out.println("NotaT  \t NotaP \t Pauta");
        
        for(int linha=0 ; linha <= matriz[linha].length ; linha++){
            for(int coluna = 0; coluna <= matriz[coluna].length ; coluna++){
                
                int notaP = gerador.nextInt(201);
                int notaT = gerador.nextInt(201);
                double notaF = 0;
                double pratica = (double) notaP;
                double teorica = (double) notaT;
                
                pratica = pratica/10;
                teorica = teorica/10;
    			
                notaF = 0.4*notaT + 0.6*notaP;
                notaF = notaF/10;
            	
            	if(coluna == 2) matriz[linha][coluna]=(int) notaF;
            	
            	if(pratica<7 || teorica<7)notaF=66;

                out.printf("%.1f  \t %.1f \t %2.0f \n",pratica,teorica,notaF);
            }
        }
        }
}

 
        



/*
        public static void imprimirTabela (double nota[][]){
            double notaT=0, notaF=0;
            
            out.print("NotaT \t NotaP \t Pauta");
            
            for(int i = 0; i < nota[0].length; i++){
                out.println("");
                for(int j = 0; j < nota.length; j++){
                    if(j==0){
                        out.printf("%.1f \t", nota[j][i]);
                        notaT = nota[0][i];
                    }
                    else{
                        notaF = (int) ( (notaT*0.4) +(nota[1][i]) );
                        
                        if(notaT < 7.0 || nota[1][i] < 7.0) notaF = 66;
                        
                        out.printf("%.1f \t %d", nota[j][j], notaF);
                    }
                }
            }
        }*/