package aula06;

public class A06E03_PassageiroClasseExecutiva extends A06E03_Passageiro{
	private double milhasExtra;
	private int n = getnMilhas();
	
	public A06E03_PassageiroClasseExecutiva(String nome, A06E03_Data dataNasc, String sexo, int nViagens, int nMilhas){
		super(nome, dataNasc, sexo, nViagens, nMilhas);
	}

	@Override
	public void milhas() {
		milhasExtra = 2*n;
	}
	
    @Override
    public String toString() {
        return "\nClasse Executiva\n" + super.toString() + "\nNumero extra: " + milhasExtra;
    }

}