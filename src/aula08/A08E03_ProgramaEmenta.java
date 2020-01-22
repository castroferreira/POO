package aula08;

import java.util.*;
import static java.lang.System.*;

public class A08E03_ProgramaEmenta {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String nome, local;
		
		do{
			out.print("Nome da ementa: ");
			nome = sc.nextLine();
		}while(nome.length() == 0);
		
		do{
			out.print("Local da ementa: ");
			local = sc.nextLine();
		}while(local.length() == 0);
		
		A08E03_Ementa ementa = new A08E03_Ementa(nome, local);
		A08E03_Prato[] prato = new A08E03_Prato[1];
		
		int numPratos=0, op=0;
		
		do{
			try{
				menu();
				out.print("Opcao: ");
				op = sc.nextInt();
				
				switch (op) {
				case 1:
					if(Arrays.equals(prato, new A08E03_Prato[0]) || prato[0] == null){
						err.println("Nao se encontra nenhum prato criado logo nao e possivel adicionar pratos a ementa");
						prato = new A08E03_Prato[1];
						break;
					}
					else{
						adicionarPrato(ementa, prato);
						break;
					}
				case 2:
					if (Arrays.deepEquals(ementa.getEmenta(), new A08E03_Prato[ementa.getEmenta().length][1])
							|| Arrays.deepEquals(ementa.getEmenta(),
									new A08E03_Prato[ementa.getEmenta().length][])) {
						err.println("Não é possivel remover qualquer prato da ementa");
						break;
					} else {
						removerPrato(ementa);
						break;
					}
				case 3:
					if (Arrays.deepEquals(ementa.getEmenta(), new A08E03_Prato[ementa.getEmenta().length][1])
							|| Arrays.deepEquals(ementa.getEmenta(),
									new A08E03_Prato[ementa.getEmenta().length][])) {
						err.println("Não é existe nenhum prato da ementa");
						break;
					} else {
						out.println(ementa);
						break;
					}
				case 4:
					if (Arrays.equals(prato, new A08E03_Prato[0])) {
						prato = new A08E03_Prato[1];
						prato = criaPrato(prato, numPratos);
						numPratos++;
						break;
					} else {
						prato = criaPrato(prato, numPratos);
						break;
					}
				case 5:
					if (Arrays.equals(prato, new A08E03_Prato[0])) {
						prato = new A08E03_Prato[1];
						err.println("Não é possivel remover qualquer prato");
						break;
					} else {
						prato = apagarPrato(prato);
						numPratos--;
						break;
					}
				case 6:
					if (Arrays.equals(prato, new A08E03_Prato[0])) {
						prato = new A08E03_Prato[1];
						err.println("Não é possivel adicionar ingredientes");
						break;
					} else {
						adicionarIngrediente(prato);
						break;
					}
				case 7:
					if (Arrays.equals(prato, new A08E03_Prato[0])) {
						prato = new A08E03_Prato[1];
						err.println("Não é possivel remover nenhum ingrediente");
						break;
					} else {
						removerIngrediente(prato);
						break;
					}
				}
			} catch(InputMismatchException e){
				err.println("Opcao invalida.\nTente novamente.");
			} sc.nextLine();
		}while(op != 8);
	}

	public static void menu(){
		out.println("\n--------------------------");
		out.println("          EMENTA          ");
		out.println("--------------------------");
		out.println("1 - Adicionar prato");
		out.println("2 - Remover prato");
		out.println("3 - Imprimir ementa");
		out.println("4 - Criar prato");
		out.println("5 - Apagar prato");
		out.println("6 - Adicionar ingredientes");
		out.println("7 - Remover ingredientes");
		out.println("8 - Sair");
		out.println("--------------------------\n");
	}
	
	/* INGREDIENTE */
	
	// Adicionar Carne
	public static A08E03_Alimento adicionarCarne(){
		String variedade;
		double proteinas, calorias, peso;
		
		for (A08E03_VariedadeCarne v : A08E03_VariedadeCarne.values())
			out.print(v + ", ");
		
		out.println();
		
		do {
			System.out.print("Variedade da carne: ");
			variedade = sc.nextLine();
		}while (!variedade.equals("frango") && 
				 !variedade.equals("outra") && 
				 !variedade.equals("porco") && 
				 !variedade.equals("vaca"));

		out.print("Proteinas da carne: ");
		proteinas = sc.nextDouble();
		out.print("Calorias da carne: ");
		calorias = sc.nextDouble();
		out.print("Peso da carne: ");
		peso = sc.nextDouble();

		switch (variedade) {
		case "frango": return new A08E03_Carne(A08E03_VariedadeCarne.frango, proteinas, calorias, peso);
		case "outra": return new A08E03_Carne(A08E03_VariedadeCarne.outra, proteinas, calorias, peso);
		case "porco": return new A08E03_Carne(A08E03_VariedadeCarne.porco, proteinas, calorias, peso);
		case "vaca": return new A08E03_Carne(A08E03_VariedadeCarne.vaca, proteinas, calorias, peso);
		}
		return null;
	}
	
	// Adicionar Peixe
	public static A08E03_Alimento adicionarPeixe(){
		String tipo;
		double proteinas, calorias, peso;
		for (A08E03_TipoPeixe tipos : A08E03_TipoPeixe.values()) {
			out.print(tipos + ", ");
		}
		
		out.println();
		
		do {
			out.print("Tipo de peixe: ");
			tipo = sc.nextLine();
		} while (!tipo.equals("congelado") && 
				 !tipo.equals("fresco"));
		out.print("Proteinas do peixe: ");
		proteinas = sc.nextDouble();
		out.print("Calorias do peixe: ");
		calorias = sc.nextDouble();
		out.print("Peso do peixe: ");
		peso = sc.nextDouble();
		
		switch (tipo) {
		case "congelado":
			return new A08E03_Peixe(A08E03_TipoPeixe.congelado, proteinas, calorias, peso);
		case "fresco":
			return new A08E03_Peixe(A08E03_TipoPeixe.fresco, proteinas, calorias, peso);
		}
		return null;
	}
	
	// Adicionar Cereal
	public static A08E03_Alimento adicionarCereal(){
		String nome;
		double proteinas, calorias, peso;
		
		do {
			System.out.print("Nome do cereal: ");
			nome = sc.nextLine();
		} while (nome.length() == 0);
		
		out.print("Proteinas do cereal: ");
		proteinas = sc.nextDouble();
		System.out.print("Calorias do ceral: ");
		calorias = sc.nextDouble();
		out.print("Peso do cereal: ");
		peso = sc.nextDouble();
		return new A08E03_Cereal(nome, proteinas, calorias, peso);
	}
	
	// Adicionar Legume
	public static A08E03_Alimento adicionarLegume(){
		String nome;
		double proteinas, calorias, peso;
		
		do {
			System.out.print("Nome do legume: ");
			nome = sc.nextLine();
		} while (nome.length() == 0);
		
		out.print("Proteinas do legume: ");
		proteinas = sc.nextDouble();
		out.print("Calorias do legume: ");
		calorias = sc.nextDouble();
		out.print("Peso do legume: ");
		peso = sc.nextDouble();
		return new A08E03_Legume(nome, proteinas, calorias, peso);
	}
	
	/* PRATO */
	
	// Cria Prato
	public static A08E03_Prato[] criaPrato(A08E03_Prato[] prato, int numPrato){
		String op = "", nome;
		
		do{
			out.println();
			out.println("a) Adicionar Prato Normal");
			out.println("b) Adicionar Prato Dieta");
			out.println("c) Adicionar Prato Vegetariano");
			out.print(": ");
			op = sc.nextLine();
		}while(!op.equals("a") &&
			   !op.equals("b") &&
			   !op.equals("c"));
		
		do{
			out.print("Nome do Prato:  ");
			nome = sc.nextLine();
		}while(nome.length() == 0);
		
		if(prato[0] == null){
			switch (op) {
			case "a": prato[0] = new A08E03_Prato(nome); break;
			case "b": out.print("Numero de calorias maxima:  ");
					  double maxCal = sc.nextDouble();
					  prato[0] = new A08E03_PratoDieta(nome, maxCal); break;
			case "c": prato[0] = new A08E03_PratoVegetariano(nome); break;
			}
			return prato;
		}
		
		else{
			A08E03_Prato[] criarPrato = new A08E03_Prato[prato.length + 1];
			
			for(int i = 0 ; i < prato.length ; i++)
				criarPrato[i] = prato[i];
			switch (op) {
			case "a": criarPrato[numPrato] = new A08E03_Prato(nome); break;
			case "b": out.print("Numero de calorias maxima:  ");
					  double maxCal = sc.nextDouble();
					  criarPrato[numPrato] = new A08E03_PratoDieta(nome, maxCal); break;
			case "c": criarPrato[numPrato] = new A08E03_PratoVegetariano(nome); break;
			}
			
			return prato;
		}
	}
	
	// Apaga Prato
	private static A08E03_Prato[] apagarPrato(A08E03_Prato[] prato) {
		try {
			String nome;
			int existe = 0;
			out.println("Pratos existentes: ");
			for (A08E03_Prato p : prato) {
				System.out.println(p.getNome());
			}
			do {
				out.print("Introduza o nome do prato que pretenda eliminar: ");
				nome = sc.nextLine();
			} while (nome.length() == 0);
			
			for (int i = 0; i < prato.length; i++)
				if (prato[i].getNome().equals(nome))
					existe++;
				
			if (existe == 1) {
				int a = 0;
				A08E03_Prato[] delPratos = new A08E03_Prato[prato.length - 1];
				for (int i = 0; i + 1 < prato.length; i++) {
					if (!prato[i].getNome().equals(nome)) {
						delPratos[i] = prato[i + a];
					} else if (prato[i].getNome().equals(nome)) {
						delPratos[i] = prato[i + 1];
						++a;
					}
				}
				prato = delPratos;
				return prato;
			} else {
				err.println("O prato " + nome + " Não existe.");
				return prato;
			}
		} catch (NullPointerException e) {
			err.println("Não é possivel remover qualquer prato");
			return prato;
		}
	}
	
	// Seleciona Prato
	
	
	// Adiciona Ingrediente
	public static void adicionarIngrediente(A08E03_Prato[] prato){
		try{
			String op = "", nome;
			int existe = 0;
			
			for(A08E03_Prato p : prato)
				out.println(p.getNome());
				
			do{
				out.print("Nome do Prato:  ");
				nome = sc.nextLine();
			}while(nome.length() == 0);
			
			do{
				out.println();
				out.println("a) Adicionar Carne");
				out.println("b) Adicionar Peixe");
				out.println("c) Adicionar Cereal");
				out.println("d) Adicionar Legume");
				out.print(": ");
				op = sc.nextLine();
			}while(!op.equals("a") &&
				   !op.equals("b") &&
				   !op.equals("c") &&
				   !op.equals("d")); 
			
			for(int i = 0 ; i < prato.length ; i++)
				if (prato[i].getNome().equals(nome)){
					if (Arrays.equals(prato[i].getPratos(), new A08E03_Alimento[0]) || prato[i].getPratos()[0] == null)
						prato[i].setPratos(new A08E03_Alimento[1]);
		
				switch(op){
				case "a": A08E03_Alimento aux = adicionarCarne();
				if (!prato[i].addIngrediente(aux))
					err.println("ERRO: Não é possivel adicionar '" + aux + "' ao -> " + prato[i]);
					break;
				case "b": A08E03_Alimento aux1 = adicionarPeixe();
					if (!prato[i].addIngrediente(aux1))
						err.println("ERRO: Não é possivel adicionar '" + aux1 + "' ao -> " + prato[i]);
					break;
				case "c": A08E03_Alimento aux2 = adicionarCereal();
					if (!prato[i].addIngrediente(aux2))
						System.out.println("ERRO: Não é possivel adicionar '" + aux2 + "' ao -> " + prato[i]);
					break;
				case "d": A08E03_Alimento aux3 = adicionarLegume();
					if (!prato[i].addIngrediente(aux3))
						System.out.println("ERRO: Não é possivel adicionar '" + aux3 + "' ao -> " + prato[i]);
					break;
				}
				existe++;
			}
			if(existe == 0)
				err.print("O prato " +nome+ " nao existe na ementa.");

		}catch(NullPointerException e){
			err.println("Nao se encontra nenhum prato na ementa para remover.");
		}
	}
	
	// Remove Ingrediente
	public static void removerIngrediente(A08E03_Prato[] prato){
		try {
			String nome;
			int existe = 0;
			
			out.println("Pratos existentes: ");
			
			for (A08E03_Prato p : prato) 
				out.println(p.getNome());
			
			do {
				out.print("Nome do prato: ");
				nome = sc.nextLine();
			} while (nome.length() == 0);
			for (int i = 0; i < prato.length; i++)		
				if (prato[i].getNome().equals(nome)) {
					selecionarIngredienteRemover(prato[i]);
					existe++;
				}
			if (existe == 0)
				err.println("O prato " + nome + " Não existe.");
		
		} catch (NullPointerException e) {
			err.println("Não é possivel remover nenhum ingrediente");
		}
	}
	
	/* EMENTA */
	
	// Adiciona Prato
	public static void adicionarPrato(A08E03_Ementa ementa, A08E03_Prato[] prato){
		try{
			String nome, diaDaSemana;
			int existe=0;
			
			out.print("Pratos criados: ");
			
			for(A08E03_Prato p : prato)
				out.println(p);
			
			do{
				out.println("Introduza o nome do prato que pretende adicionar a ementa: ");
				nome = sc.nextLine();
			}while(nome.length() == 0);
			
			for(A08E03_DiaSemana dia : A08E03_DiaSemana.values())
				out.print(dia + ", ");
			
			out.println();
			
			do{
				out.println("Dia da semana que pretende  por este prato: ");
				diaDaSemana = sc.nextLine();
			}while(!diaDaSemana.equals("Segunda") &&
				   !diaDaSemana.equals("Terca") &&
				   !diaDaSemana.equals("Quarta") &&
				   !diaDaSemana.equals("Quinta") &&
				   !diaDaSemana.equals("Sexta") &&
				   !diaDaSemana.equals("Sábado") &&
				   !diaDaSemana.equals("Domingo"));
			
			for(int i = 0 ; i < prato.length ; i++)
				if(prato[i].getNome().equals(nome)){
					existe++;
					switch (diaDaSemana) {
					case "Segunda": ementa.addPrato(prato[i], A08E03_DiaSemana.Segunda); break;
					case "Terca": ementa.addPrato(prato[i], A08E03_DiaSemana.Terca); break;
					case "Quarta": ementa.addPrato(prato[i], A08E03_DiaSemana.Quarta); break;
					case "Quinta": ementa.addPrato(prato[i], A08E03_DiaSemana.Quinta); break;
					case "Sexta": ementa.addPrato(prato[i], A08E03_DiaSemana.Sexta); break;
					case "Sabado": ementa.addPrato(prato[i], A08E03_DiaSemana.Sabado); break;
					case "Domingo": ementa.addPrato(prato[i], A08E03_DiaSemana.Domingo); break;
					}
				}
			if(existe == 0)
				out.print("O prato " +nome+ " nao existe na ementa.");
		}catch(NullPointerException e){
			err.println("Nao se encontra nenhum prato criado logo nao e possivel adicionar pratos a ementa.");
		}
	}
	
	// Remove Prato
	public static void removerPrato(A08E03_Ementa ementa){
		try{
			String nome;
			A08E03_Prato[][] e = ementa.getEmenta();
			int existe = 0;
			out.println("Pratos existentes na ementa");
			out.println(ementa);
			
			do{
				out.println("Introduza o nome do prato que pretende eliminar: ");
				nome = sc.nextLine();
			}while(nome.length() == 0);
			
			for(int i = 0 ; i < e.length ; i++)
				for(int j = 0 ; j < e[i].length ; j++){
					if(e[i][j] == null) continue;
					else if (e[i][j].getNome().equals(nome)){
						eliminarPrato(nome, e[i][j], e, e[i], ementa);
						++existe;
						break;
					}
				}
			
			if(existe == 0)
				err.print("O prato " +nome+ " nao existe na ementa.");

		}catch(NullPointerException e){
			err.println("Nao se encontra nenhum prato na ementa para remover.");
		}
	}

	/**Metodo AUXILIAR de removerPrato(): Eliminar Prato*/
	public static void eliminarPrato(String nome, A08E03_Prato pratoSelecionado, A08E03_Prato[][] pratos, A08E03_Prato[] diaSelecionado, A08E03_Ementa ementa){
		if((diaSelecionado.length - 1) == 0)
			pratos[pratoSelecionado.getDia().getDia()][0] = null; 
		else{
			A08E03_Prato[] eliminar = new A08E03_Prato[diaSelecionado.length - 1];
			int e = 0;
			
			for(int i = 0 ;  i + 1 < diaSelecionado.length ; i++){
				if(!diaSelecionado[i].getNome().equals(nome))
					eliminar[i] = diaSelecionado[i + e];
				else if(!diaSelecionado[i].getNome().equals(nome)){
					eliminar[i] = diaSelecionado[i + 1];
					++e;
				}
			}
			pratos[pratoSelecionado.getDia().getDia()] = eliminar;
		}
	}
	// Imprime Ementa
	
	/**Metodo AUXILIAR de selecionarIngredienteRemover(): Selecionar Ingrediente a Remover*/
	public static void selecionarIngredienteRemover(A08E03_Prato pratoSelecionado) {
		int i = 1, numeroAlimento = 0;
		A08E03_Alimento[] alimentosPossiveis = pratoSelecionado.getPratos();
		out.println("Alimentos do prato " + pratoSelecionado.getNome());
		
		for (A08E03_Alimento alimentos : alimentosPossiveis) {
			System.out.println(i + ") " + alimentos);
			++i;
		}
		
		do {
			try {
				out.print("Numero do alimento que pretenda eliminar: ");
				numeroAlimento = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		} while (numeroAlimento < 1 || numeroAlimento > alimentosPossiveis.length);
		
		int b = 0;
		A08E03_Alimento[] delIngredientes = new A08E03_Alimento[alimentosPossiveis.length - 1];
		
		for (int a = 0; a + 1 < alimentosPossiveis.length; a++) {
			out.println("e");
			if ((numeroAlimento - 1) != a) 
				delIngredientes[a] = alimentosPossiveis[a + b];

			else if ((numeroAlimento - 1) == a) {
				delIngredientes[a] = alimentosPossiveis[a + 1];
				++b;
			}
		}
		alimentosPossiveis = delIngredientes;
		pratoSelecionado.setPratos(alimentosPossiveis);
		pratoSelecionado.setIngrediente(pratoSelecionado.getIngrediente() - 1);
	}
}