package aula05;

public class A05E03_Conjunto {
	int[] num = new int[0];

	// Para inserir um elemento novo no conjunto. Caso este elemento ja exista, 
	//a funcao nao faz nada. Inicialmente nao se sabe quantos elementos vamos inserir.
	public void insert(int n) {	
		if(contains (n) == false){
			int[] numero = new int[num.length +1];
			System.arraycopy(num, 0, numero, 0, num.length);
			numero[numero.length - 1] = n;
			num = numero;
		}
	}

	// Para indicar se um dado elemento esta no conjunto.
	public boolean contains(int n) {
		for(int i = 0; i < num.length;i++)
			if(num[i] == n)
				return true;
		return false;
	}
	
	// Para remover um elemento do conjunto. 
	// Caso este elemento nao se encontre no conjunto, a funcao nao faz nada.
	public void remove(int n) {
		int[] rem = new int[num.length - 1];
		int pos=0, i=0;

		if(!contains(n)) return;
				
		for(i = 0; i< num.length; i++)
			if(n == num[i]){
				pos = i;
				break;
			}
		
		for(i=pos; i<num.length-1;i++)
			num[i] = num[i+1];
		
		
		System.arraycopy(num, 0, rem, 0, num.length-1);
		num = rem;
	}

	// Para apagar todos os elementos do conjunto.
	public void empty() {
		num = new int[0];
	}
	
	// Para converter os elementos do conjunto numa String.
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i <num.length; i++){
			sb.append(num[i]);
			sb.append(" ");
		}
		return sb.toString();
	}
	
	// Para calcular o numero de elementos no conjunto.	
	public int size() {
		return num.length;
	}

	// Para construir um conjunto novo que representa a uniao de dois conjuntos. 
	// O conjunto resultante nao deve conter elementos repetidos.
	public A05E03_Conjunto unir(A05E03_Conjunto add) {
		A05E03_Conjunto c = new A05E03_Conjunto();
		
		for(int i  = 0; i < size(); i++)
			c.insert(num[i]);
		
		for(int j  = 0; j < add.size(); j++)
			c.insert(add.num[j]);
		
		return c;
	}

	// Para construir um conjunto novo que representa a diferenaa do this e 
	// dos elementos do conjunto representado pelo objeto dif.
	public A05E03_Conjunto subtrair(A05E03_Conjunto dif) {
		A05E03_Conjunto c = new A05E03_Conjunto();
		
		for(int i  = 0; i < size(); i++)
			if(dif.contains(num[i]) == false)
				c.insert(num[i]);
		
		return c;
	}

	// Para construir um conjunto novo que representa a interseccao do this com 
	// os elementos do conjunto representado pelo objeto inter. 
	//O conjunto resultante nao deve conter elementos repetidos.
	public A05E03_Conjunto interset(A05E03_Conjunto inter) {
		A05E03_Conjunto c = new A05E03_Conjunto();
		
		for(int i  = 0; i < size(); i++)
			if(inter.contains(num[i]))
				c.insert(num[i]);
		
		return c;
	}
}


/*
 * 
OUTPUT 
4 7 6 5
7 2 4
Número de elementos em c1: 4
Número de elementos em c2: 3
c1 contém 6?: sim
c2 contém 6?: não
União:4 7 6 5 2
Interseção:7 4
Diferença:6 5
c1:*/