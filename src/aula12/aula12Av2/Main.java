package aula12.aula12Av2;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		Main ap = new Main();
		ap.alinea1();
		ap.alinea2();
	}

	public void alinea1() {
		Cruzeiro cr = criarCruzeiro();

		// imprime os produtos ordenados por data
		System.out.println(cr);
	}

	public void alinea2() {
		Cruzeiro cr = criarCruzeiro();

		// coloque o código da alínea 2 aqui

		FileWriter writer;
		try {
			writer = new FileWriter("Vendas.txt");
			// 1ª linha
			writer.write(cr.countLotacao() + "\n");
			// 2ª linha
			writer.write(cr.ocupacaoReal() + "\n");
			// restantes
			writer.write(cr.toString());
			writer.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever para  o ficheiro");
		}
	}

	public Cruzeiro criarCruzeiro() {
		String[] cidades = { "Lisboa", "Rio de Janeiro", "Sydney", "Barcelona", "Lisboa" };
		Cruzeiro cr2 = new Cruzeiro("Lusitania", cidades, "22/01/2027");
		cr2.setDuracao(50);

		CabineComVaranda ccv = new CabineComVaranda(17, 2, TipoDeVaranda.VISTA_LIVRE);
		ccv.setLocal(LocalJantar.Piscina);
		cr2.add(ccv);
		if (ccv.hasLocal())
			System.out.println("Jantar na " + ccv.getLocal() + " confirmado.");
		cr2.add(new CabineComJanela(15, 4, TipoDeJanela.INTERIOR,
				new String("Pedro Campos;Maria Campos;Mariana Mortágua").split(";")));
		cr2.add(new CabineComJanela(25, 2, TipoDeJanela.INTERIOR));
		cr2.add(new CabineComJanela(12, 2, TipoDeJanela.MAR, "Rita Pereira".split(";")));
		cr2.add(new CabineComJanela(4, 4, TipoDeJanela.MAR,
				new String("U. Magnusson:R. Magnusson:M. Rosberg:C. Sean").split(":")));
		CabineInterior ci2 = new CabineInterior(100, 2);
		ci2.setMaxOcupantes(3);
		ci2.suportaNecessidadesEspeciais(); // cabine suporta Nec. Especiais
		ci2.setPassageiros(new String("Aníbal S.;Maria S.;Anabela S.").split(";"));
		cr2.add(ci2);
		cr2.add(new CabineInterior(110, 1, "Ulisses Pereira".split(";")));
		cr2.add(new CabineInterior(111, 2, "Carlos Castro:Cristiano Castro".split(":")));
		CabineInterior ci3 = new CabineInterior(102, 2);
		cr2.add(ci3);
		ci3.setPassageiros(new String("Júlio Tavares:Camila Pereira").split(":"));
		CabineComVaranda cab = new CabineComVaranda(21, 1, TipoDeVaranda.VISTA_LIVRE);
		cab.setTipoVaranda(TipoDeVaranda.OBSTR_PARCIAL);
		cab.setLocal(LocalJantar.Cabine);
		try {
			cab.setPassageiros(new String("Paulo Portas;Júlia Portas").split(";"));
			cr2.add(cab);
		} catch (IllegalArgumentException e) {
			System.out.println(cab + "\n\t!Não adicionado devido a excesso de ocupantes !!\n");
		}
		Cabine eo = new CabineComJanela(130, 4, TipoDeJanela.MAR, "Marcelo R. de Sousa".split(";"));
		cr2.add(eo);

		return cr2;
	}
}