package aula08;

public enum A08E03_DiaSemana {
	Segunda, Terca, Quarta, Quinta, Sexta, Sabado, Domingo;
	
	private int dia;
	
	public int getDia(){
		return dia;
	}
	
		public static A08E03_DiaSemana rand(){
			switch ((int)(Math.random() * 7)){
				default:
				case 0: return A08E03_DiaSemana.Domingo;
				case 1: return A08E03_DiaSemana.Segunda;
				case 2: return A08E03_DiaSemana.Terca;
				case 3: return A08E03_DiaSemana.Quarta;
				case 4: return A08E03_DiaSemana.Quinta;
				case 5: return A08E03_DiaSemana.Sexta;
				case 6: return A08E03_DiaSemana.Sabado;
			}
		}
}