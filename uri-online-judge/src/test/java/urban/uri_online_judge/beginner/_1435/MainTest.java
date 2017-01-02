package urban.uri_online_judge.beginner._1435;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleContentLoader;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1435");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleSquareMatrixOfSize1() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = new SampleBuilder().appendln("  1").appendln("").build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSquareMatrixOfSize2() throws IOException {
		InputStream input = new SampleBuilder().appendln(2).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sample2SquareMatrix.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSquareMatrixOfSize3() throws IOException {
		InputStream input = new SampleBuilder().appendln(3).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sample3SquareMatrix.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSquareMatrixOfSize4() throws IOException {
		InputStream input = new SampleBuilder().appendln(4).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sample4SquareMatrix.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSquareMatrixOfSize5() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sample5SquareMatrix.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSquareMatrixOfSize100() throws IOException {
		InputStream input = new SampleBuilder().appendln(100).append(0).buildAsInputStream();

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sample100SquareMatrix.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSequenceOfMatrixes() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleSequenceOfMatrixes.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleSequenceOfMatrixes.out");

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSequenceOfMatrixes2() throws IOException {
		InputStream input = scl.loadAsInputStream("sampleSequenceOfMatrixes2.in");

		String output = Main.main(input);

		String expectedOutput = scl.loadAsStringFrom("sampleSequenceOfMatrixes2.out");

		assertEquals(expectedOutput, output);
	}

}