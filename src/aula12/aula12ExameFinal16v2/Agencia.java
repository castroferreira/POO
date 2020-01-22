package aula12.aula12ExameFinal16v2;

import java.util.ArrayList;

public class Agencia
{
	private String nome, endereço;
	
	ArrayList<Cruzeiro> cruzeiro = new ArrayList<>();
	ArrayList<Circuito> circuito = new ArrayList<>();
	ArrayList<Excursao> excursao = new ArrayList<>();
	
	public Agencia (String nome, String endereço)
	{
		this.nome = nome;
		this.endereço = endereço;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereço() {
		return endereço;
	}



	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}



	public ArrayList<Cruzeiro> getCruzeiro() {
		return cruzeiro;
	}



	public void setCruzeiro(ArrayList<Cruzeiro> cruzeiro) {
		this.cruzeiro = cruzeiro;
	}



	public ArrayList<Circuito> getCircuito() {
		return circuito;
	}



	public void setCircuito(ArrayList<Circuito> circuito) {
		this.circuito = circuito;
	}



	public ArrayList<Excursao> getExcursao() {
		return excursao;
	}



	public void setExcursao(ArrayList<Excursao> excursao) {
		this.excursao = excursao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((circuito == null) ? 0 : circuito.hashCode());
		result = prime * result + ((cruzeiro == null) ? 0 : cruzeiro.hashCode());
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
		result = prime * result + ((excursao == null) ? 0 : excursao.hashCode());
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
		Agencia other = (Agencia) obj;
		if (circuito == null) {
			if (other.circuito != null)
				return false;
		} else if (!circuito.equals(other.circuito))
			return false;
		if (cruzeiro == null) {
			if (other.cruzeiro != null)
				return false;
		} else if (!cruzeiro.equals(other.cruzeiro))
			return false;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (excursao == null) {
			if (other.excursao != null)
				return false;
		} else if (!excursao.equals(other.excursao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}



	public void add(Cruzeiro cr) {cruzeiro.add(cr);}
	
	public void add(Circuito cir) {circuito.add(cir);}
	
	public void add(Excursao exc) {excursao.add(exc);}
	
	public void remove(Cruzeiro cr) {cruzeiro.remove(cr);}
	
	public void remove(Circuito cir) {circuito.remove(cir);}
	
	public void remove(Excursao exc) {excursao.remove(exc);}



	@Override
	public String toString() {
		String agencia = "Agência " + nome + " localizada em " + endereço + "\n";
		
		for(Cruzeiro cruzeiro1 : cruzeiro)
			agencia += cruzeiro.toString() + "\n";
		
		for(Circuito circuito1 : circuito)
			agencia += circuito.toString() + "\n";
		
		for(Excursao excursao1 : excursao)
			agencia += excursao.toString() + "\n";
	
		return agencia;
	}
	
	
}