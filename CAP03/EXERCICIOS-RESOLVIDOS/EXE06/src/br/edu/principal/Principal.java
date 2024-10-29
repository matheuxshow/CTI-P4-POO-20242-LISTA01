package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double salario = 1416.00;
		double gratificacao  = 50.00;
		double imp = salario * 0.10;
		
		System.out.println("o salario é " + (salario + gratificacao - imp)); 

	}

}
