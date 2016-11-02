package urban.uri_online_judge.beginner._1040;

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
	public void shouldCalculateAverageReprovado() throws IOException {
		String inputSample = new SampleBuilder().append(0.0).append(0.0).append(0.0).appendln(0.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Media: 0.0").appendln("Aluno reprovado.").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageEmExameReprovado() throws IOException {
		String inputSample = new SampleBuilder().append(5.0).append(5.0).append(5.0).appendln(6.0).append(0.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Media: 5.1").appendln("Aluno em exame.")
				.appendln("Nota do exame: 0.0").appendln("Aluno reprovado.").appendln("Media final: 2.5").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageEmExameAprovado() throws IOException {
		String inputSample = new SampleBuilder().append(5.0).append(5.0).append(5.0).appendln(6.0).append(10.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Media: 5.1").appendln("Aluno em exame.")
				.appendln("Nota do exame: 10.0").appendln("Aluno aprovado.").appendln("Media final: 7.5").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageAprovado() throws IOException {
		String inputSample = new SampleBuilder().append(10.0).append(10.0).append(10.0).appendln(10.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Media: 10.0").appendln("Aluno aprovado.").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageSample1() throws IOException {
		String inputSample = new SampleBuilder().append(2.0).append(4.0).append(7.5).appendln(8.0).append(6.4).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Media: 5.4").appendln("Aluno em exame.")
				.appendln("Nota do exame: 6.4").appendln("Aluno aprovado.").appendln("Media final: 5.9").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageSample2() throws IOException {
		String inputSample = new SampleBuilder().append(2.0).append(6.5).append(4.0).append(9.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Media: 4.8").appendln("Aluno reprovado.").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldCalculateAverageSample3() throws IOException {
		String inputSample = new SampleBuilder().append(9.0).append(4.0).append(8.5).append(9.0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Media: 7.3").appendln("Aluno aprovado.").build();

		assertEquals(expectedOutput, output);
	}

}
