package br.com.urban.codewars.kyu8;

public class SaleHotdogs {

	public static int saleHotdogs(final int n) {
		if(n >= 10) {
			return n * 90;
		}
		if(n >= 5) {
			return n * 95;
		}
		return n * 100;
	}

}
