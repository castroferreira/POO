package aula12.aula12ExameRecurso15;

import java.io.*;

public class Main {
    public static void main(String[] args){
    	Main ap = new Main();
        ap.alinea1();
        //ap.alinea2();
        //ap.alinea3();
    }

    public void alinea1() {
    	System.out.println("\nA1)");
    	Agencia ag = new Agencia("Top Mundo", "Rua Carrancho, 15, 3800-145 Aveiro");
    	
    	Carro c1 = new Carro(CAR_CLASS.A, true, false);	//carro a gasolina, manual
    	Carro c2 = new Carro(CAR_CLASS.C, true, true); //carro a gasolina, automático
    	Carro c3 = new Carro(CAR_CLASS.F, false, true); //carro a diesel, automático
    	
    	ag.add(c1);  ag.add(c2);  ag.add(c3);
    	
    	Apartamento ap1 = new Apartamento("Sol", "Faro", 100.0, 4.5, 3);				// sem cozinha
    	Apartamento ap2 = new Apartamento("Atlantis", "Porto", 153.20, 5.0, 3, true); 	// com cozinha
        ap2.setPreco(139.9); // promoção
        ap2.on();			// ligar ar condicionado
        ap2.setTemp(5.0);	
        ap2.setTemp(22.0);
        
        quartoHotel qh1 = new quartoHotel("Americas", "Aveiro", 70.0, 4.0);
        qh1.setType(ROOM_TYPE.DOUBLE);
        quartoHotel qh2 = new quartoHotel("Melia", "Aveiro", 80.0, 4.5, ROOM_TYPE.TWIN);

        quartoHostal qhostal = new quartoHostal("Best", "Aveiro", 11, 3.5, 4);
        
        ag.add(ap1);	ag.add(ap2);
        ag.add(qh1);	ag.add(qh2);
        ag.add(qhostal);
        
      	System.out.println(ag);	// imprime todos os produtos da agência
    	
    	try {
			PrintWriter fl = new PrintWriter(new File("output1.txt"));
			fl.println(ag);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
