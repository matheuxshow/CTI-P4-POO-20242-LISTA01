package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double horas_t = 16;
		double val_sal_min= 200.00;
		double val_h_t= val_sal_min / 2;
		double val_sal_bruto = val_h_t * horas_t;
		double imp = val_sal_bruto * 0.3;
		double val_sal_l = val_sal_bruto - imp;
		System.out.print(val_sal_l);
		
		
		
	
	}

}
