package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double peso_saco = 17;
		double rg1= 22.17;
		double rg2= 17.22;
		double rgato1 = rg1 /1000;
		double rggato2 = rg2/1000;
		double total = peso_saco -5 *(rg1+rg2);
		System.out.print(total);
	}

}
