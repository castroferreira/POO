package aula06;

public class A06E03_PassageiroClasseTuristica extends A06E03_Passageiro{
	private double milhasExtra;

	public A06E03_PassageiroClasseTuristica(String nome, A06E03_Data dataNasc, String sexo, int nViagens, int nMilhas){
		super(nome, dataNasc, sexo, nViagens, nMilhas);
	}

	@Override
	public void milhas() {
		milhasExtra = getnMilhas();
	}
	
    @Override
    public String toString() {
        return "\nClasse Turistica\n" + super.toString() + "\nNumero extra: " + milhasExtra;
    }
}
