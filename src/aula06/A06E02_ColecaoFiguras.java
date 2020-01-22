package aula06;
import static java.lang.System.*;

public class A06E02_ColecaoFiguras {
	private double maxArea;
	private A06E02_Figura[] fig, figAux;
	private int cont;
	private static final int MAX = 10;
	
	// O construtor define a area maxima da colecao de figuras
	public A06E02_ColecaoFiguras(double maxArea) {
		this.maxArea = maxArea;
		fig = new A06E02_Figura[MAX];
		figAux = new A06E02_Figura[MAX];
		cont = 0;
	}
		
	// Adiciona uma figura a colecao verificando se ja existe ou se esta cheio
	public boolean addFigura(A06E02_Figura f){
		
		//Verificar o sumatorio das areas
		if(areaTotal() + f.getArea() > maxArea)
			return false;
		
		/*Figura[] novo = new Figura[figura_list.length + MAX];
		System.arraycopy(figura_list, 0, novo, 0, figura_list.length);
		return novo;*/

		//else{
			//Caso ja exista, nao adiciona
			for(int i = 0; i<fig.length; i++)
				if(f.equals(fig[i]))
					return false;
			
			// extensao do array
			if(cont == fig.length){
				figAux = new A06E02_Figura[cont + MAX];
				arraycopy(fig, 0, figAux, 0, cont);
				fig = figAux;
				fig[cont] = f;
				cont++;
				return true;
			}
			
			else{
				fig[cont] = f;
				cont++;
				return true;
			}
		//}
		
	}
	
	// Remove uma figura da colecao
	public boolean delFigura(A06E02_Figura f){
		//Apaga a figura verificando que ja existe
		int j = -1;
		
		for(int i = 0; i < fig.length; i++)
			if(f.equals(fig[i])) //Percorre para ver se encontra uma figura igual
				j=i;
		
		//caso nao exista
		if(j==-1) return false;
		
		//caso exista
		else{
			
			int pos=0;
			for(j=pos; j<figAux.length-1;j++)
				figAux[j] = figAux[j+1];

			cont--;
			/*if(j > 0){
				out.println(j);
				out.println(fig.length);
				out.println(figAux.length);
				arraycopy(fig, 0, figAux, 0, j);
				
				if(j < cont-1) arraycopy(fig, j+1, figAux, 0, j);
				
				fig = figAux;
				cont--;
			}
			
			else if (j==0){
				arraycopy(fig, 1, figAux, 0, cont);
				fig = figAux;
			}*/
			return true;
		}
	}
	
	// Retorna a area total das figs.
	public double areaTotal(){
		double areatotal = 0;
		
		///percorre todas as figuras, concatenando a soma das areas
		for(int i = 0; i<cont; i++)
			areatotal += fig[i].getArea();
		return areatotal;
	}
	
	// Verifica se uma figura existe
	public boolean exists(A06E02_Figura f){
		int  j = 0;
		
		//percorre para ver se econtra uma figura igual
		for(int i = 0; i < fig.length; i++)
			if(f.equals(fig[i]))
				j++;
		
		if(j>0) return true; //caso exista
		return false; //se nao existir
	}
	
	// Retorna as caracteristicas da colecao
	public String toString(){
		return "O A08E02_Conjunto tem " + cont + " figuras com area total de " + areaTotal();  
	}
	
	// Retorna uma lista com todas as figs.
	public A06E02_Figura[] getFiguras(){
		A06E02_Figura[] fig1 = new A06E02_Figura[cont];
		
		for(int i = 0; i < cont; i++)
			fig1[i] = fig[i];
		
		return fig1; //cria um array novo e copia
	}
	
	// Retorna uma lista com todos os centros
	public A06E02_Ponto[] getCentros(){
		A06E02_Ponto[] ponto = new A06E02_Ponto[cont];
		
		for(int i = 0; i < cont; i++)
			ponto[i] = fig[i].getCentro();
		
		return ponto; //cria um array novo e copia
	}
}