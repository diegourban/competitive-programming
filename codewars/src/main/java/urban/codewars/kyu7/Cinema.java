package urban.codewars.kyu7;

public class Cinema {
	
	public static int movie(int card, int ticket, double perc) {
		double systemASum = ticket;
		double discountTicket = ticket * perc;
		double systemBSum = card + discountTicket;
		
		int times = 1;
		while(Math.ceil(systemBSum) >= systemASum) {
			times++;
			systemASum = ticket * times;
			discountTicket = discountTicket * perc;
			systemBSum += discountTicket;
		}
        return times;
    }

}
