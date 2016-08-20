package br.com.urban.codewars.kyu8;

public class FuelCalculator {

	public static double fuelPrice(int litres, double pricePerLiter) {
		final int timesToDiscountPerLiter = litres / 2;
		double discount = timesToDiscountPerLiter * 0.05;
		if(discount > 0.25) {
			discount = 0.25;
		}
		
		final double pricePerLiterWithDiscount = pricePerLiter - discount;
		
		return litres * pricePerLiterWithDiscount;
	}

}
