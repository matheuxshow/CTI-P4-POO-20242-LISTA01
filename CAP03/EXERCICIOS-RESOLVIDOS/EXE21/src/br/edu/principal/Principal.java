package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double x, y, z;
		z= 2;
		x= 3;
		
		y = Math.pow(z, 2) - Math.pow(x, 2);
		y = Math.pow(y, 0.5);
		System.out.println(y);

	}

}
