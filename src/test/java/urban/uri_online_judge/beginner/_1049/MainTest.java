package urban.uri_online_judge.beginner._1049;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1049.Main;

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
	public void shouldFindAguia() throws IOException {
		String inputSample = new SampleBuilder().appendln("vertebrado").appendln("ave").appendln("carnivoro").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("aguia").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindPomba() throws IOException {
		String inputSample = new SampleBuilder().appendln("vertebrado").appendln("ave").appendln("onivoro").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("pomba").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindHomem() throws IOException {
		String inputSample = new SampleBuilder().appendln("vertebrado").appendln("mamifero").appendln("onivoro").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("homem").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindVaca() throws IOException {
		String inputSample = new SampleBuilder().appendln("vertebrado").appendln("mamifero").appendln("herbivoro").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("vaca").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindPulga() throws IOException {
		String inputSample = new SampleBuilder().appendln("invertebrado").appendln("inseto").appendln("hematofago").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("pulga").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindLagarta() throws IOException {
		String inputSample = new SampleBuilder().appendln("invertebrado").appendln("inseto").appendln("herbivoro").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("lagarta").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindSangessuga() throws IOException {
		String inputSample = new SampleBuilder().appendln("invertebrado").appendln("anelideo").appendln("hematofago").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("sanguessuga").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindMinhoca() throws IOException {
		String inputSample = new SampleBuilder().appendln("invertebrado").appendln("anelideo").appendln("onivoro").build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("minhoca").build();

		assertEquals(expectedOutput, output);
	}

}
