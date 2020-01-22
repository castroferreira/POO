package aula12.aula12Av1;

import java.io.FileWriter;
import java.io.IOException;

public   class  Main {
	public static void main(String[] args ) {
		Main ap = new Main();
		ap.alinea1();
		ap.alinea2();
	}

	public void alinea1() {
		Cruzeiro  cruz  = criarCruzeiro();
		//  imprime   os   produtos   ordenados   por  data
		System.out.println( cruz );
	}

	public void alinea2() {
		Cruzeiro cruz = criarCruzeiro();
		
		try {
			FileWriter writer = new FileWriter("cruzeiro2017.txt");
			writer.write(String.format("Cabines Ocupadas: %.1f º/.\n", cruz.getCabOcupadas()));
			writer.write(String.format("Media de pessoas por quarto: %d pessoas\n", cruz.getMedOcupadas()));
			writer.write("Cabines Ocupadas:\n");
			writer.write(cruz.CabinesOcupToString());
			writer.close();
			System.out.println("\n\n");
		} catch (IOException e) {
			System.out.println("Asneira");
		}

	}

	public  Cruzeiro criarCruzeiro() {
		String[]  aux ={ "Lisboa" , "Barcelona" , "Rodes" , "Southampton" };
		Cruzeiro  cr2  =  new  Cruzeiro( "Sea Princess" ,  aux  ,  "22/01/2017" );
		cr2.setDuracao(11);
		CabineComJanela  ccj = new  CabineComJanela(17, 2, TipoDeJanela.INTERIOR );
		ccj.setPassageiros( new  String( "Maria Luz;Manuel Luz" ).split( ";" ));
		ccj.pacoteExtra(Extra.Spa );
		cr2.add( ccj );
		cr2 .add( new  CabineComJanela(15, 4, TipoDeJanela.INTERIOR , new  String( "Antonio Campos;Maria Campos;Marina Mota" ).split( ";" )));
		cr2 .add( new  CabineComJanela(25, 2, TipoDeJanela.INTERIOR , "Anonymous1;Anonymous2".split( ";" )));
		cr2 .add( new  CabineComJanela(4, 4, TipoDeJanela.MAR ,  new  String( "Ursula Magnusson and Matts Magnusson and Miki Rosberg and Charles Sean" ).split( " and " )));

		Suite  suite1 = new  Suite(100, 2); 
		suite1.setNumQuartos(3);
		suite1.setMaxOcupantes(2*3); 
		cr2.add( suite1 );
		Suite  s = new  Suite(102, 6);
		s.setNumQuartos(3);
		cr2 .add( s );
		s.setPassageiros( new  String( "A. Jolie:B. Pitt:Shiloh:Knox Leon" ).split( ":" ));

		CabineComVaranda  cab = new  CabineComVaranda(21, 1, TipoDeVaranda.VISTA_LIVRE );
		cab.setTipoVaranda(TipoDeVaranda.OBSTR_PARCIAL );
		//cab.pacoteExtra(Extra.Desporto );

		try  {
			cab.setPassageiros( new  String( "Paulo Portas;Julia Portas" ).split( ";" ));
			cr2.add( cab );
		}  catch  (IllegalArgumentException  e ){
			System. out .println( "Nao adicionado devido a excesso de ocupantes !!" );
		}

		Cabine  eo  =  new  CabineComJanela(1,4,TipoDeJanela. MAR , "Marcelo R. de Sousa" .split( ";" )); cr2 .add( eo );
		cr2 .add( new  CabineComJanela(130,4,TipoDeJanela. MAR ));
		cr2 .add( new  CabineComJanela(131,4,TipoDeJanela. INTERIOR ));
		return   cr2 ; 
	}
}