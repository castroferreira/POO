package aula08;

import java.util.*;

public class A08E02_Conjunto<E> {
	List<E> numeros = new ArrayList<E>();

	public List<E> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<E> numeros) {
		this.numeros = numeros;
	}

	public void insert(E n) {
		if (!(numeros.contains(n)))
			numeros.add(n);
	}

	public boolean contains(E n) {
		return numeros.contains(n);
	}

	public void remove(E n) {
		numeros.remove(n);
	}

	public void empty() {
		numeros.clear();
	}

	public int size() {
		return numeros.size();
	}

	@Override
	public String toString() {
		return "" + numeros;
	}

	A08E02_Conjunto<E> unir(A08E02_Conjunto<E> C2) {
		A08E02_Conjunto<E> uniao = new A08E02_Conjunto<E>();
		
		for (E i : numeros)
			uniao.insert(i);
		
		for (E i : C2.getNumeros())
			uniao.insert(i);
		
		return uniao;
	}

	A08E02_Conjunto<E> interset(A08E02_Conjunto<E> inter) {
		A08E02_Conjunto<E> intersacao = new A08E02_Conjunto<E>();
		for (E i : numeros) 
			for (E z : inter.getNumeros()) 
				if (numeros.contains(z) && inter.contains(i))
					intersacao.insert(z);
			
		return intersacao;
	}

	A08E02_Conjunto<E> subtrair(A08E02_Conjunto<E> dif) {
		A08E02_Conjunto<E> subt = new A08E02_Conjunto<E>();

		for (E i : numeros)
			for (E x : dif.getNumeros())
				if (!(numeros.contains(x) && dif.contains(i)))
					subt.remove(i);
		return subt;
	}
	 

}
