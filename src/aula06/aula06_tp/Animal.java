package aula06_tp;

public abstract class Animal {
	private int idade;
	
	public Animal(int idade) {
		System.out.println("Criar um Animal!");
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Animal [idade=" + idade + "]";
	}
	
	public void comer(){}
	public abstract void dormir();
}
