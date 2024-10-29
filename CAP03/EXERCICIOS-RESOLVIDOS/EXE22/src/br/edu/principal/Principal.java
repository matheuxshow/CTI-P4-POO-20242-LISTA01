package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double vs, qkw, vqkw, vr, desc, vdesc;
		vs = 1416.13;
		qkw = 1717.22;
		vqkw= vs /5;
		vr = vqkw * qkw;
		desc = vr * 0.15;
		vdesc = vr - desc;
		System.out.println(vqkw);
		System.out.println(vr);

		System.out.println(vdesc);


	}

}
