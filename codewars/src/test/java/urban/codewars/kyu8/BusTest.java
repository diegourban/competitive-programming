package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    @Test
    public void shouldCreateInstance() {
        Bus instance = new Bus();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveContarUmaParada() {
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[]{10, 0});
        assertEquals(10, Bus.countPassengers(stops));
    }

    @Test
    public void deveContarDuasParadasSemSaida() {
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[]{10, 0});
        stops.add(new int[]{3, 0});
        assertEquals(13, Bus.countPassengers(stops));
    }

    @Test
    public void deveContarDuasParadasComSaida() {
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[]{10, 0});
        stops.add(new int[]{3, 5});
        assertEquals(8, Bus.countPassengers(stops));
    }

    @Test
    public void deveContarTresParadasComSaida() {
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[]{10, 0});
        stops.add(new int[]{3, 5});
        stops.add(new int[]{0, 5});
        assertEquals(3, Bus.countPassengers(stops));
    }

    @Test
    public void deveContarTresParadasComSaidaClever() {
        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[]{10, 0});
        stops.add(new int[]{3, 5});
        stops.add(new int[]{0, 5});
        assertEquals(3, Bus.countPassengersClever(stops));
    }

}
