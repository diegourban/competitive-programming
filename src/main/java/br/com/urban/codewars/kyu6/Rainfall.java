package br.com.urban.codewars.kyu6;

public class Rainfall {
	
	public static double mean(String town, String strng) {
		double rainfallRecordSum = 0;
		int size = 1;
        String[] citiesRecord = strng.split("\n");
        for(String cityRecord : citiesRecord) {
        	if(cityRecord.startsWith(town)) {
        		String[] monthsRecord = cityRecord.split(":")[1].split(",");
        		size = monthsRecord.length;
        		for(String monthRecord : monthsRecord) {
        			rainfallRecordSum += Double.parseDouble(monthRecord.split(" ")[1]);
        		}
        		break;
        	}
        }
		return rainfallRecordSum / size;
    }
	
    public static double variance(String town, String strng) {
        final double mean = mean(town, strng);
        double varianceSum = 0;
        int size = 1;
        String[] citiesRecord = strng.split("\n");
        for(String cityRecord : citiesRecord) {
        	if(cityRecord.startsWith(town)) {
        		String[] monthsRecord = cityRecord.split(":")[1].split(",");
        		size = monthsRecord.length;
        		for(String monthRecord : monthsRecord) {
        			varianceSum += Math.pow(Double.parseDouble(monthRecord.split(" ")[1]) - mean , 2);
        		}
        		break;
        	}
        }
    	return varianceSum / size;
    }

}
