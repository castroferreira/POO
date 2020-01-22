package aula06_tp;

public class Exemplo1 {

	public static void main(String args[]){
		Animal a = new Peixe(10, 100, "Nemo");

		// métodos declarados na classe abstrata Animal
		a.comer();
		a.dormir();
		
		if(a instanceof Peixe)
			((Peixe)a).nadar();
			
		System.out.println(a instanceof Peixe);
		
		// interface ConsegueNadar
		ConsegueNadar p = new Peixe(10, 200, "sardinha");
		System.out.println(p);
		
		if(a instanceof ConsegueNadar){
			p = (ConsegueNadar)a;
			p.nadar();
		}
	}


}
