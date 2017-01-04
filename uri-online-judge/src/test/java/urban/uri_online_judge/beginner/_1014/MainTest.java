package urban.uri_online_judge.beginner._1014;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleBuilder;

public class MainTest {

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldCalculateConsumption1() throws IOException {
		InputStream input = new SampleBuilder().appendln(500).append(35.0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("14.286 km/l").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateConsumption2() throws IOException {
		InputStream input = new SampleBuilder().appendln(2254).append(124.4).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("18.119 km/l").build();
		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateConsumption3() throws IOException {
		InputStream input = new SampleBuilder().appendln(4554).append(464.6).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("9.802 km/l").build();
		assertEquals(expectedOutput, output);
	}

}
