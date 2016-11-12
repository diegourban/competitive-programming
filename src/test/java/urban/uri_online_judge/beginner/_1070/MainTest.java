package urban.uri_online_judge.beginner._1070;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1070.Main;

public class MainTest {
	
	private InputStreamBuilder inputStream;

	@Before
	public void beforeTest() {
		inputStream = new InputStreamBuilder();
	}

	@After
	public void afterTest() {
		inputStream = null;
	}

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}
	
	@Test
	public void shouldPrintSixConsecutiveOddsStartingAtEven() throws IOException {
		String inputSample = new SampleBuilder().append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		StringBuilder sb = new StringBuilder();
		sb.append(3).append(System.lineSeparator());
		sb.append(5).append(System.lineSeparator());
		sb.append(7).append(System.lineSeparator());
		sb.append(9).append(System.lineSeparator());
		sb.append(11).append(System.lineSeparator());
		sb.append(13).append(System.lineSeparator());

		assertEquals(sb.toString(), output);
	}
	
	@Test
	public void shouldPrintSixConsecutiveOddsStartingAtOdd() throws IOException {
		String inputSample = new SampleBuilder().append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		StringBuilder sb = new StringBuilder();
		sb.append(3).append(System.lineSeparator());
		sb.append(5).append(System.lineSeparator());
		sb.append(7).append(System.lineSeparator());
		sb.append(9).append(System.lineSeparator());
		sb.append(11).append(System.lineSeparator());
		sb.append(13).append(System.lineSeparator());

		assertEquals(sb.toString(), output);
	}
	
	@Test
	public void shouldPrintSixConsecutiveSample() throws IOException {
		String inputSample = new SampleBuilder().append(8).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		StringBuilder sb = new StringBuilder();
		sb.append(9).append(System.lineSeparator());
		sb.append(11).append(System.lineSeparator());
		sb.append(13).append(System.lineSeparator());
		sb.append(15).append(System.lineSeparator());
		sb.append(17).append(System.lineSeparator());
		sb.append(19).append(System.lineSeparator());

		assertEquals(sb.toString(), output);
	}

}
