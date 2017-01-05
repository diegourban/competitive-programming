package urban.codewars.kyu8;

import java.util.ArrayList;

public class Bus {

    public static int countPassengers(ArrayList<int[]> stops) {
        int total = 0;
        for (int[] stop : stops) {
            total += stop[0] - stop[1];
        }
        return total;
    }

    public static int countPassengersClever(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
    }

}
