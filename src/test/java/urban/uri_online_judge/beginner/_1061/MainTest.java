package urban.uri_online_judge.beginner._1061;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1061.Main;

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
	public void shouldCalculateMinimumEventTime() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 3").appendln("08 : 12 : 23").appendln("Dia 3").append("08 : 13 : 23").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("0 : 0 : 1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("0 minuto(s)").appendln("1 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate59Seconds() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("0 : 0 : 59").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("0 minuto(s)").appendln("59 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Minute() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("0 : 1 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Minute1Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("0 : 1 : 1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)").appendln("1 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Minute59Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("0 : 1 : 59").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("1 minuto(s)").appendln("59 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
		
	@Test
	public void shouldCalculate59Minutes() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("0 : 59 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("59 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate59Minutes59Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("0 : 59 : 59").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("0 hora(s)").appendln("59 minuto(s)").appendln("59 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Hour() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("1 : 0 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("0 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Hour1Minute() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("1 : 1 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Hour1Minute1Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("1 : 1 : 1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)").appendln("1 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Hour59Minutes1Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("1 : 59 : 1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("59 minuto(s)").appendln("1 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Hour59Minutes59Seconds() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("1 : 59 : 59").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("1 hora(s)").appendln("59 minuto(s)").appendln("59 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate23Hours() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("23 : 0 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("23 hora(s)").appendln("0 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate23Hours59minutes() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("23 : 59 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate23Hours59Minutes59Seconds() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 1").append("23 : 59 : 59").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("0 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)").appendln("59 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Day() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2").append("0 : 0 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("0 hora(s)").appendln("0 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Day1Hour() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2").append("1 : 0 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("1 hora(s)").appendln("0 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Day1Hour1Minute() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2").append("1 : 1 : 0").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Day1Hour1Minute1Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2").append("1 : 1 : 1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("1 hora(s)").appendln("1 minuto(s)").appendln("1 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Day23Hours1Minute1Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2").append("23 : 1 : 1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("23 hora(s)").appendln("1 minuto(s)").appendln("1 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Day23Hours59Minutes1Second() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2").append("23 : 59 : 1").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)").appendln("1 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate1Day23Hours59Minutes59Seconds() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 2").append("23 : 59 : 59").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("1 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)").appendln("59 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculate29Days23Hours59Minutes59Seconds() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 1").appendln("0 : 0 : 0").appendln("Dia 30").append("23 : 59 : 59").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("29 dia(s)").appendln("23 hora(s)").appendln("59 minuto(s)").appendln("59 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateEventTimeSample1() throws IOException {
		String inputSample = new SampleBuilder().appendln("Dia 5").appendln("08 : 12 : 23").appendln("Dia 9").append("06 : 13 : 23").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("3 dia(s)").appendln("22 hora(s)").appendln("1 minuto(s)").appendln("0 segundo(s)").build();

		assertEquals(expectedOutput, output);
	}

}
