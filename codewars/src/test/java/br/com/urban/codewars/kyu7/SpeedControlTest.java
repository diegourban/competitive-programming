package br.com.urban.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpeedControlTest {
	
	@Test
	public void mustInstantiate() {
		assertNotNull(new SpeedControl());
	}
	
	@Test
	public void mustNotCalculateAverageIfHasNotMoved() {
		assertEquals(0, SpeedControl.gps(15, new double[]{0.0}));
	}
	
	@Test
	public void mustCalculateAverageOneSection() {
		assertEquals(45, SpeedControl.gps(15, new double[]{0.0, 0.19}), 0.0);
	}
	
	@Test
	public void mustCalculateAverage1() {
		assertEquals(74, SpeedControl.gps(15, new double[]{0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25}));
	}
	
	@Test
	public void mustCalculateAverage2() {
		assertEquals(41, SpeedControl.gps(20, new double[]{0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61}));
	}
	
	@Test
	public void mustCalculateAverage3() {
		//assertEquals(219, SpeedControl.gps(12, new double[]{0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25}));
	}
	
	@Test
	public void mustCalculateAverage4() {
		//assertEquals(80, SpeedControl.gps(20, new double[]{0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84}));
	}
	

}
