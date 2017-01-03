package urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTesterTest {
	
	@Test
	public void deveInstanciar() {
		TriangleTester instance = new TriangleTester();
		assertNotNull(instance);
	}
	
	@Test
	public void naoEhTriangulo() {
		assertEquals(false, TriangleTester.isTriangle(7,2,2));
	}
	
	@Test
	public void ehTriangulo() {
		assertEquals(true, TriangleTester.isTriangle(1,2,2));
	}

}
