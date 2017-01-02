package br.com.urban.codewars.kyu7;

public class ParallelResistors {
	
	public static double resistance(double... resistors) { 
		double total = 0;
		for(double resistor : resistors) {
			total += 1/resistor;
		}
		return 1 / total;
	}

}
