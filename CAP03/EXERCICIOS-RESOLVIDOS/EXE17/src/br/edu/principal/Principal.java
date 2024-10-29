package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal= 1416.13;
		double cheque1= 313.13;
		double cheque2= 131.13;
		double cpmf1= cheque1 * 0.30/100;
		double cpmf2= cheque2 * 0.30/100;
		double saldo =  sal - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.print(saldo);
	}

}
