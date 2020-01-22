package aula06;

public class A06E03_PassageiroPrimeiraClasse extends A06E03_Passageiro{
	private double milhasExtra;
	private int n = getnMilhas();
	private double m = getnViagens();
	
	public A06E03_PassageiroPrimeiraClasse(String nome, A06E03_Data dataNasc, String sexo, int nViagens, int nMilhas){
		super(nome, dataNasc, sexo, nViagens, nMilhas);
	}

	@Override
	public void milhas() {
		if(n <= 5) milhasExtra = 2*m;
		else milhasExtra = (2 + 0.2 * n)*m;
	}

    @Override
    public String toString() {
        return "\nClasse Primeira classe\n" + super.toString() + "\nNumero extra: " + milhasExtra;
    }
}