package aula08;

public class A08E03_Test {
	public static void main(String[] args) {
		A08E03_Ementa ementa = new A08E03_Ementa("Especial Caloiro", "Snack da UA");
		A08E03_Prato[] pratos = new A08E03_Prato[10];
		
		for (int i=0; i < pratos.length; i++){
			pratos[i] = randPrato(i);
			
			int cnt = 0;
			while (cnt <2){ // Adicionar 2 Ingredientes a cada Prato
				A08E03_Alimento aux = randAlimento();
			
				if (pratos[i].addIngrediente(aux)) cnt++;
				else System.out.println("ERRO: Não é possivel adicionar '" + aux + "' ao -> " + pratos[i]);
			}
		ementa.addPrato(pratos[i], A08E03_DiaSemana.rand()); // Dia Aleatório
		}
		
		System.out.println("\n" + ementa);
	}
	
	//Retorna um Alimento Aleatoriamente
	public static A08E03_Alimento randAlimento() {
		switch ((int) (Math.random() * 4)) {
		default:
			case 0: return new A08E03_Carne(A08E03_VariedadeCarne.frango, 22.3, 345.3, 300);
			case 1: return new A08E03_Peixe(A08E03_TipoPeixe.congelado, 31.3, 25.3, 200);
			case 2: return new A08E03_Legume("Couve Flor", 21.3, 22.4, 150);
			case 3: return new A08E03_Cereal("Milho", 19.3, 32.4, 110);
		}
	}
	
	//Retorna um Tipo de Prato Aleatoriamente
	public static A08E03_Prato randPrato(int i) {
		switch ((int) (Math.random() * 3)) {
		default:
			case 0: return new A08E03_Prato("Prato N." + i);
			case 1: return new A08E03_PratoVegetariano("Prato N." + i + " (Vegetariano)");
			case 2: return new A08E03_PratoDieta("Prato N." + i + " (Dieta)", 90.8);
		}
	}
}