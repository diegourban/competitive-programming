package urban.uri_online_judge.beginner._1006;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.beginner._1006.Main;

public class MainTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateTheMinimumAverage() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("0").addLine("0").addLine("0").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 0.0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateTheMaximumAverage() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("10.0").addLine("10.0").addLine("10.0").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 10.0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateAverage6Point3() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("5.0").addLine("6.0").addLine("7.0").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 6.3" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateAverage9() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("5.0").addLine("10.0").addLine("10.0").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 9.0" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateAverage7Point5() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("10.0").addLine("10.0").addLine("5.0").build();

		String output = Main.main(input);
		String expectedOutput = "MEDIA = 7.5" + System.lineSeparator();
		
		assertEquals(expectedOutput, output);
	}

}
