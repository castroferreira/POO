package aula07;

import java.util.*;

//Lista de Veiculos
public class A07E01_Lista {
	private ArrayList<A07E01_Veiculo> listaVeiculos = new ArrayList<A07E01_Veiculo>();

	public void addVeiculos(A07E01_Veiculo v) {
		try {
			if(!listaVeiculos.contains(v)) 
				listaVeiculos.add(v);
		} catch (Exception e) {
		}
	}

	public ArrayList<A07E01_Veiculo> getVeiculo() {
		return listaVeiculos;
	}
}