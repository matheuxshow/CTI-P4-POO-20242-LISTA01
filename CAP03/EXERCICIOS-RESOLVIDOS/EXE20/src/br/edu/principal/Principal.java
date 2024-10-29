package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double ang = 22;
		double alt = 17;
		double rad = ang * 3.14 / 180;
		double escada = alt / Math.sin(rad);
		System.out.print(escada);
				
	}

}
