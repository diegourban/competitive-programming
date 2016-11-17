package urban.uri_online_judge.beginner._1094;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;

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
	public void shouldHandleAllRabits() throws IOException {
		SampleBuilder sb = new SampleBuilder();
		sb.appendln(1);
		sb.append("10 C");
		
		InputStream input = this.inputStream.build(sb.build());
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("Total: 10 cobaias")//
				.appendln("Total de coelhos: 10")//
				.appendln("Total de ratos: 0")//
				.appendln("Total de sapos: 0")//
				.appendln("Percentual de coelhos: 100.00 %")//
				.appendln("Percentual de ratos: 0.00 %")//
				.appendln("Percentual de sapos: 0.00 %")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleAllRats() throws IOException {
		SampleBuilder sb = new SampleBuilder();
		sb.appendln(1);
		sb.append("10 R");
		
		InputStream input = this.inputStream.build(sb.build());
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("Total: 10 cobaias")//
				.appendln("Total de coelhos: 0")//
				.appendln("Total de ratos: 10")//
				.appendln("Total de sapos: 0")//
				.appendln("Percentual de coelhos: 0.00 %")//
				.appendln("Percentual de ratos: 100.00 %")//
				.appendln("Percentual de sapos: 0.00 %")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleAllFrogs() throws IOException {
		SampleBuilder sb = new SampleBuilder();
		sb.appendln(1);
		sb.append("10 S");
		
		InputStream input = this.inputStream.build(sb.build());
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("Total: 10 cobaias")//
				.appendln("Total de coelhos: 0")//
				.appendln("Total de ratos: 0")//
				.appendln("Total de sapos: 10")//
				.appendln("Percentual de coelhos: 0.00 %")//
				.appendln("Percentual de ratos: 0.00 %")//
				.appendln("Percentual de sapos: 100.00 %")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleOneOfEach() throws IOException {
		SampleBuilder sb = new SampleBuilder();
		sb.appendln(3);
		sb.append("1 C");
		sb.append("1 R");
		sb.append("1 S");
		
		InputStream input = this.inputStream.build(sb.build());
		
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("Total: 3 cobaias")//
				.appendln("Total de coelhos: 1")//
				.appendln("Total de ratos: 1")//
				.appendln("Total de sapos: 1")//
				.appendln("Percentual de coelhos: 33.33 %")//
				.appendln("Percentual de ratos: 33.33 %")//
				.appendln("Percentual de sapos: 33.33 %")//
				.build();
		
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldCalculateExperimentsSample() throws IOException {
		SampleBuilder sb = new SampleBuilder();
		sb.appendln(10);
		sb.appendln("10 C");
		sb.appendln("6 R");
		sb.appendln("15 S");
		sb.appendln("5 C");
		sb.appendln("14 R");
		sb.appendln("9 C");
		sb.appendln("6 R");
		sb.appendln("8 S");
		sb.appendln("5 C");
		sb.appendln("14 R");
		
		InputStream input = this.inputStream.build(sb.build());

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("Total: 92 cobaias")//
				.appendln("Total de coelhos: 29")//
				.appendln("Total de ratos: 40")//
				.appendln("Total de sapos: 23")//
				.appendln("Percentual de coelhos: 31.52 %")//
				.appendln("Percentual de ratos: 43.48 %")//
				.appendln("Percentual de sapos: 25.00 %")//
				.build();

		assertEquals(expectedOutput, output);
	}

}
