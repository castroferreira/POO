package aula08;

import java.util.Arrays;

public class A08E03_Ementa {
	private String nome, local;
	private static final int DIM = 1;
	private A08E03_Prato[][] ementa = new A08E03_Prato[7][DIM];
	
	public A08E03_Ementa(String nome, String local) {
		this.nome = nome;
		this.local = local;
	}
	public String getNome() {
		return nome;
	}
	
	public A08E03_Prato[][] getEmenta() {
		return ementa;
	}
	
	public void setEmenta(A08E03_Prato[][] ementa) {
		this.ementa = ementa;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (A08E03_Prato[] p : ementa) {
			if (p == null)continue;
			
			else
				for (A08E03_Prato b : p)
					if (b == null)continue;
					else sb.append(b + ", dia " + b.getDia() + "\n");
		}
		String pratos = sb.toString();
		return pratos;
	}
	
	public void addPrato(A08E03_Prato prato, A08E03_DiaSemana dia) {
		if(ementa[dia.getDia()][0] == null){
			ementa[dia.getDia()][0] = prato;
			prato.setDia(dia);
		}
		
		else{
			A08E03_Prato[][] add = new A08E03_Prato[7][ementa[dia.getDia()].length + DIM];
			
			for (int a = 0; a < ementa[dia.getDia()].length; a++)
				add[dia.getDia()][a] = ementa[dia.getDia()][a];
			
			add[dia.getDia()][ementa[dia.getDia()].length] = prato;
			prato.setDia(dia);
			ementa[dia.getDia()] = add[dia.getDia()];
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(ementa);
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A08E03_Ementa other = (A08E03_Ementa) obj;
		if (!Arrays.deepEquals(ementa, other.ementa))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}