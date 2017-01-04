package urban.uri_online_judge.beginner._1050;

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
	public void shouldHandleDDDNotfound() throws IOException {
		InputStream input = new SampleBuilder().append(99).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("DDD nao cadastrado").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationBrasilia() throws IOException {
		InputStream input = new SampleBuilder().append(61).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Brasilia").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationSalvador() throws IOException {
		InputStream input = new SampleBuilder().append(71).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Salvador").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationSaoPaulo() throws IOException {
		InputStream input = new SampleBuilder().append(11).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Sao Paulo").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationRioDeJaneiro() throws IOException {
		InputStream input = new SampleBuilder().append(21).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Rio de Janeiro").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationJuizDeFora() throws IOException {
		InputStream input = new SampleBuilder().append(32).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Juiz de Fora").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationCampinas() throws IOException {
		InputStream input = new SampleBuilder().append(19).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Campinas").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationVitoria() throws IOException {
		InputStream input = new SampleBuilder().append(27).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Vitoria").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldFindDestinationBeloHorizonte() throws IOException {
		InputStream input = new SampleBuilder().append(31).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Belo Horizonte").build();

		assertEquals(expectedOutput, output);
	}

}
