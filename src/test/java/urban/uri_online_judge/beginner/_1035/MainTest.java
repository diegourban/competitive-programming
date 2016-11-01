package urban.uri_online_judge.beginner._1035;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1035.Main;

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

	// B > C == false
	@Test
	public void shouldValidateSelectionTestBranch1() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(0).append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	@Test
	public void shouldValidateSelectionTestBranch2() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(1).append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == false
	@Test
	public void shouldValidateSelectionTestBranch3() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(1).append(0).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == true
	@Test
	public void shouldValidateSelectionTestBranch4() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(1).append(0).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == true
	// C + D > A + B == false
	@Test
	public void shouldValidateSelectionTestBranch5() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(1).append(0).append(1).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == true
	// C + D > A + B == true
	@Test
	public void shouldValidateSelectionTestBranch6() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(1).append(0).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == true
	// C + D > A + B == true
	// C > 0 == false
	@Test
	public void shouldValidateSelectionTestBranch7() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(1).append(0).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == true
	// C + D > A + B == true
	// C > 0 == true
	@Test
	public void shouldValidateSelectionTestBranch8() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(2).append(1).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == true
	// C + D > A + B == true
	// C > 0 == true
	// D > 0 == false
	@Test
	public void shouldValidateSelectionTestBranch9() throws IOException {
		String inputSample = new SampleBuilder().append(-2).append(4).append(3).append(0).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	// B > C == true
	// D > A == true
	// C + D > A + B == true
	// C > 0 == true
	// D > 0 == true
	// A % 2 == 0 == false
	@Test
	public void shouldValidateSelectionTestBranch10And11() throws IOException {
		String inputSample = new SampleBuilder().append(1).append(3).append(2).append(3).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldValidateSelectionTestBranch12() throws IOException {
		String inputSample = new SampleBuilder().append(0).append(2).append(1).append(2).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores aceitos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldValidateSelectionTestSample1() throws IOException {
		String inputSample = new SampleBuilder().append(5).append(6).append(7).append(8).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores nao aceitos").build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldValidateSelectionTestSample2() throws IOException {
		String inputSample = new SampleBuilder().append(2).append(3).append(2).append(6).build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("Valores aceitos").build();

		assertEquals(expectedOutput, output);
	}

}
