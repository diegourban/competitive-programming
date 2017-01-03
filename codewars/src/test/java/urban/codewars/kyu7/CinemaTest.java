package urban.codewars.kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CinemaTest {
	
	@Test
	public void deveInstanciar() {
		Cinema instance = new Cinema();
		Assert.assertNotNull(instance);
	}
	
    @Test
    public void test1() {
        assertEquals(43, Cinema.movie(500, 15, 0.9));
    }
    
    @Test
    public void test2() {
    	assertEquals(24, Cinema.movie(100, 10, 0.95));
    }
    
    @Test
    public void testUmaVez() {
    	assertEquals(1, Cinema.movie(5, 100, 0.9));
    }
    
    @Test
    public void testDuasVezes() {
    	assertEquals(2, Cinema.movie(25, 100, 0.9));
    }
    
    @Test
    public void testSeteVezes() {
    	assertEquals(7, Cinema.movie(100, 50, 0.9));
    }
    
    @Test
    public void testDuasVezesIgual() {
    	assertEquals(2, Cinema.movie(0, 10, 0.95));
    }
    

}
