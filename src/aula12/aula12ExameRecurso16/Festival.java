/** Andreia Castro Ferreira - 65791 */

package aula12.aula12ExameRecurso16;

import java.util.ArrayList;

public class Festival
{
	private String nome, local;
	
	ArrayList<Evento> eventos = new ArrayList<>();
	ArrayList<Tasca> tascasRefei��es = new ArrayList<>();
	
	public Festival(String nome, String local)
	{
		this.nome = nome;
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public ArrayList<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}

	public ArrayList<Tasca> getTascasRefei��es() {
		return tascasRefei��es;
	}

	public void setTascasRefei��es(ArrayList<Tasca> tascasRefei��es) {
		this.tascasRefei��es = tascasRefei��es;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventos == null) ? 0 : eventos.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tascasRefei��es == null) ? 0 : tascasRefei��es.hashCode());
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
		Festival other = (Festival) obj;
		if (eventos == null) {
			if (other.eventos != null)
				return false;
		} else if (!eventos.equals(other.eventos))
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
		if (tascasRefei��es == null) {
			if (other.tascasRefei��es != null)
				return false;
		} else if (!tascasRefei��es.equals(other.tascasRefei��es))
			return false;
		return true;
	}

	public void add(Evento e) {eventos.add(e);}

	public void add(Tasca t) {tascasRefei��es.add(t);}
	
	@Override
	public String toString() {
		String festival = "Festival '" + nome + "' (Local: " + local + ")";
		
		for(Evento e1 : eventos)
			festival += e1.toString() + "\n";
		
		for(Tasca t1 : tascasRefei��es)
			festival += tascasRefei��es.toString() + "\n";
		
		return festival;
	}

	public String totalEventos(String eventos) 
	{
		return eventos;
	}

	public Object getEventosOrdenadosPorData() {
		return null;
	}

	

}
