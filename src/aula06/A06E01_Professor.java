package aula06;

public class A06E01_Professor extends A06E01_Pessoa {

	private String areaInvest;
	
	public A06E01_Professor(String nome, int cc, A06E01_Data dataNasc, String areaInvest) {
		super(nome, cc, dataNasc);
		this.areaInvest = areaInvest;
	}

	public String getAreaInvest() {
		return areaInvest;
	}

	public void setAreaInvest(String areaInvest) {
		this.areaInvest = areaInvest;
	}

	@Override
	public String toString() {
		return super.toString() + ", Area de Investigacao: " + areaInvest;
	}
	
	
}