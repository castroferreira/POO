/** Andreia Castro Ferreira - 65791 */
package aula12.aula12ExameRecurso16;
import java.io.*;


// Notas:
// Não altere o código apresentado
// Deve completar o código da alinea 2
// Comentar código para garantir que vai executando parcialmente

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream fl = new PrintStream(new File("poo16rec1.txt"));
		test(System.out); // executa e escreve na consola
		test(fl); // executa e escreve no ficheiro
		fl.close();
	}

	private static void test(PrintStream out) {
		alinea1(out);
		alinea2(out);
	}

	private static void alinea1(PrintStream out) {
		out.println("\nAlínea 1) ----------------------------------\n");

        Festival alive = new Festival("UA Alive", "Campus Universitario de Santiago");

        alive.add(new Musica("Tito Paris", "20160801:20:00", "Palco Salinas"));
        alive.add(new Musica("Chet Faker", "20160801:22:00", "Palco Alameda"));
        alive.add(new Musica("Noora Noor", "20160802:22:00", "Palco Sul"));
        alive.add(new Animacao("Workshop de cozinha", "20160801:17:00", 25, 32.5)); // preco extra: 32.5 euros
        alive.add(new Desporto("Voleibol de praia", "20160801:11:00")); //  é ao ar livre
        alive.add(new Desporto("Overwatch", "20160802:23:00", false)); // não é ao ar livre
        alive.add(new Tasca("Prego a fundo", 7.5)); // menu a 7.5 euros
        alive.add(new Tasca("O cheiroso", 9)); // menu a 9 euros
        
        out.println(alive);
	}
	

	private static void alinea2(PrintStream out) {
		out.println("\nAlínea 2) ----------------------------------\n");
        Festival fest = null;
        // Adicione a seguir o código necessário para a leitura do ficheiro 

       // Festival alive = new Festival("Barra Viva", "Praia da Barra, Gafanha da Nazaré");
        
        //alive.add(new Musica("Katie Melua", "20160909:22:00", "Farol"));
        
        //out.println(alive);
        
        
        
        try {
			PrintWriter fl = new PrintWriter(new File("uafest.txt"));
			fl.println(fest);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


        // não modifique o metodo a partir daqui
        if (fest != null) {
        	out.println(fest);
        	out.println("-- Outras informacoes --");
            	//totalEventos aceita uma string e devolve o total de eventos desse tipo
        	out.println(fest.totalEventos("Musica") + " espectáculos de música.");
        	out.println(fest.totalEventos("Desporto") + " eventos desportivos.");
        	//for (Evento e : fest.getEventosOrdenadosPorData())
        		//out.println(e);
        }
    }
   
}
