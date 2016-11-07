package urban.uri_online_judge.beginner._1050;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1050.Main;

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
	public void shouldHandleDDDNotfound() throws IOException {
		String inputSample = new SampleBuilder().append(99).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("DDD nao cadastrado").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationBrasilia() throws IOException {
		String inputSample = new SampleBuilder().append(61).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Brasilia").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationSalvador() throws IOException {
		String inputSample = new SampleBuilder().append(71).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Salvador").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationSaoPaulo() throws IOException {
		String inputSample = new SampleBuilder().append(11).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Sao Paulo").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationRioDeJaneiro() throws IOException {
		String inputSample = new SampleBuilder().append(21).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Rio de Janeiro").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationJuizDeFora() throws IOException {
		String inputSample = new SampleBuilder().append(32).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Juiz de Fora").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationCampinas() throws IOException {
		String inputSample = new SampleBuilder().append(19).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Campinas").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationVitoria() throws IOException {
		String inputSample = new SampleBuilder().append(27).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Vitoria").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldFindDestinationBeloHorizonte() throws IOException {
		String inputSample = new SampleBuilder().append(31).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Belo Horizonte").build();

		assertEquals(expectedOutput, output);
	}

}
