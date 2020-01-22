package aula01;

import java.util.Scanner;

public class A01E05 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Indique o tempo em segundos: ");
        int ss = sc.nextInt();
        
        int hh = ss/3600;
        int mm = (ss%3600)/60;
        ss = ss%60;
        
        System.out.printf("%02d:%02d:%02d", hh, mm, ss);
    }
}