package aula06_tp;

public class Vertebrado extends Animal {
	private int ossos;
	
	public Vertebrado(int idade, int ossos) {
		super(idade);
		this.ossos = ossos;
		System.out.println("Criar um Vertebrado!");
	}
	
	public int getOssos() {
		return ossos;
	}
	
	public void setOssos(int ossos) {
		this.ossos = ossos;
	}

	@Override
	public String toString() {
		return "Vertebrado [ossos=" + ossos + ", " + super.toString() + "]";
	}
	
	public void dormir(){};
}
