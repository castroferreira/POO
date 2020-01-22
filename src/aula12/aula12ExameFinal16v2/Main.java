package aula12.aula12ExameFinal16v2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Main ap = new Main();
        ap.alinea1();
        ap.alinea2();
        ap.alinea3();
    }

    public void alinea1() {
        Agencia AbraTour = criarAgencia();
        System.out.println(AbraTour);	// imprime os produtos ordenados por data
    }

    public void alinea2() {
      Agencia AbraTour = criarAgencia();
        // adicionar aqui código da alínea 2
		try {
			FileWriter writer = new FileWriter("ferias.txt");
			writer.write(String.format("Cruzeiros: %d \n", AbraTour.getCruzeiro()));
			writer.write(String.format("Circuitos: %d \n", AbraTour.getCircuito()));
			writer.write(String.format("Excurssoes: %d \n", AbraTour.getExcursao()));
			writer.write("Lista:\n");
			writer.write(AbraTour.toString());
			writer.close();
			System.out.println("\n\n");
		} catch (IOException e) {
			System.err.println("Erro!");
		}
    }

    public void alinea3() {
     Agencia AbraTour = criarAgencia();
      //adicionar aqui código da alínea 3
		try {
			FileWriter writer = new FileWriter("feriasMed.txt");
			writer.write(String.format("Duracao média: %d \n", AbraTour.getCruzeiro()));
			writer.write("Media:\n");
			writer.write(AbraTour.toString());
			writer.close();
			System.out.println("\n\n");
		} catch (IOException e) {
			System.err.println("Erro!");
		}
    }

    public Agencia criarAgencia() {
        Agencia AbraTour = new Agencia("AbraTour", "Rua Mario Sacramento 23, 3800 - 156 Aveiro, Portugal");

        Cruzeiro cr1 = new Cruzeiro("Britania", "Bridgetown", "03/12/2016", ClasseNavio.SUPERIOR);
        cr1.setDuration(14);
        AbraTour.add(cr1);
        Cruzeiro cr2 = new Cruzeiro("Sea Princess", "Brisbane", "22/01/2017", ClasseNavio.SUPERIOR);
        cr2.setDuration(11);
        try {
            cr2.setDuration(20);
        } catch (IllegalArgumentException e) {
            System.err.println(cr2 + " não alterado!!");
        }
        AbraTour.add(cr2);
        AbraTour.add(new Cruzeiro("Fortuna", "Port-au-Prince", "02/01/2017", ClasseNavio.ECONOMICA));
        AbraTour.add(new Circuito("25/06/2016", (new String("Rostov Kostroma Vladimir").split("\\s"))));
        AbraTour.add(new Circuito("25/06/2016", (new String("Rostov Kostroma Vladimir").split("\\s"))));
        AbraTour.add(new Circuito("23/10/2017", (new String("Praga Budapest Sofia").split("\\s"))));
        AbraTour.add(new Excursao("08/06/2016", "Braga", TipoExcursao.BUS));
        AbraTour.add(new Excursao("09/06/2016", "Caramulo"));

        Circuito eo = new Circuito("25/10/2016", (new String("Praga Budapest Sofia").split("\\s")));
        AbraTour.add(eo);
        AbraTour.remove(eo);
        eo.setDuration(10);
        AbraTour.add(eo);
        return AbraTour;
    }
}
