package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double hora, h, m, cv;
		hora = 22.17;
		h = (int)hora;
		m = hora - h;
		cv = (h*60) + (m*100);
		System.out.println(cv);
		

	}

}
