package aula07;
import static java.lang.System.*;

import java.util.*;

public class A07E01_Test {
	
	public static void main(String[] args) {
		
		A07E01_Lista v = new A07E01_Lista();
		
		A07E01_Veiculo ac = new A07E01_AutomovelCombustao(2017, "26-88-SP", "preto", 4, 125, 200, 12);
		v.addVeiculos(ac);
		
		A07E01_Veiculo ae = new A07E01_AutomovelEletrico(2016, "XI-11-20", "azul", 4, 125, 300);
		v.addVeiculos(ae);
		
		A07E01_Veiculo ah = new A07E01_AutomovelHibrido(2015, "26-88-SP", "vermelho", 4, 125, 300, 10, 350);
		v.addVeiculos(ah);
		
		A07E01_Veiculo mc = new A07E01_MotoCombustao(2016, "05-HN-00", "branca", 2, 50, 200, 15);
		v.addVeiculos(mc);
		
		A07E01_Veiculo me = new A07E01_MotoEletrica(2016, "00-AA-10", "preta", 2, 50, 200);
		v.addVeiculos(me);
		
		A07E01_Veiculo b2 = new A07E01_Bicicleta(2015, "AA-00-BB", 2, 90);
		v.addVeiculos(b2);
		
		ArrayList<A07E01_Veiculo> lista = v.getVeiculo();
		
		A07E01_Veiculo[] listaV = lista.toArray(new A07E01_Veiculo[0]);
		
		A07E01_UtilCompare.ordenarVeiculo(listaV);
		
		out.print("LISTA DE VEICULOS:\n");
		
		for(A07E01_Veiculo v1 : lista)
			out.println(v1);
	}
}