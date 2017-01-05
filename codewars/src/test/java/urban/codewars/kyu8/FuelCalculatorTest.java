package urban.codewars.kyu8;

import static org.junit.Assert.*;

import org.junit.Test;

public class FuelCalculatorTest {

    @Test
    public void shouldCreateInstance() {
        FuelCalculator instance = new FuelCalculator();
        assertNotNull(instance);
    }

    @Test
    public void deveAplicarDiscontoAbaixoDoMaximo() {
        assertEquals(5.65d, FuelCalculator.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(27.50d, FuelCalculator.fuelPrice(5, 5.6d), 0.001d);
        assertEquals(18.40d, FuelCalculator.fuelPrice(8, 2.5d), 0.001d);
    }

    @Test
    public void deveAplicarDiscontoNoLimiteMaximo() {
        assertEquals(22.50d, FuelCalculator.fuelPrice(10, 2.5d), 0.001d);
    }

    @Test
    public void deveAplicarDiscontoAcimaMaximo() {
        assertEquals(27d, FuelCalculator.fuelPrice(12, 2.5d), 0.001d);
    }

}
