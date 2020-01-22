package aula07;

@SuppressWarnings("unchecked")

public class A07E01_UtilCompare {
	public static <T> void ordenarVeiculo(Comparable<T>[] veiculos){
		Comparable<T>[] veiculosOrdenados = veiculos;
		
		for(int i = 1; i<veiculosOrdenados.length;i++){
			int j = i-1;
			while(j>=0){
				if(veiculosOrdenados[i] != null
				&& veiculosOrdenados[j] != null
				&& veiculosOrdenados[i].compareTo((T) veiculosOrdenados[i])>0){
					Comparable<T> v = veiculosOrdenados[i];
					veiculosOrdenados[i] = veiculosOrdenados[j];
					veiculosOrdenados[j] = v;
					--i;
				}
				--j;
			}
		}
	}
}