package aula10;

import java.io.IOException;

public class A10E03_Main {
	public static void main(String[] args) throws IOException {
		A10E03_Voo v = new A10E03_Voo();
		v.lerFicheiroCompanhia();
		v.lerFicheiroVoo();
		v.formarTabela();
		v.printTabela();
		v.guardarTabela();
		v.atrasos();
		v.mediaAtrasos();
		v.origemTotal();
		v.guardarFicheiroCidades();
		v.guardarFicheiroBin();
		v.lerFicheiroBin();
	}
}