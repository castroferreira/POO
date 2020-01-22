package aula08;

public class A08E03_UtilCompare {
	public static <T> void sortArray(Comparable<T>[] pratos){
		
		for(int i = 1 ; i < pratos.length ; i++){
			int e = i - 1;
			while(e >= 0){
				if(pratos[i] != null && pratos[e] != null && pratos[e].compareTo((T) pratos[i]) > 0){
					Comparable<T> mudar = pratos[i];
					pratos[i] = pratos[e];
					pratos[e] = mudar;
					--i;
				}
				--e;
			}
		}
	}
}