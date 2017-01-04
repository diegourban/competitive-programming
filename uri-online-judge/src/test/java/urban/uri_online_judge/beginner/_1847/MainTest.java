package urban.uri_online_judge.beginner._1847;

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
	public void shouldHandleHappyCenariosWithPositiveNumbers() throws IOException {
		InputStream input1 = new SampleBuilder().append(10).append(5).append(7).buildAsInputStream();
		InputStream input2 = new SampleBuilder().append(10).append(12).append(20).buildAsInputStream();
		InputStream input3 = new SampleBuilder().append(10).append(5).append(2).buildAsInputStream();
		InputStream input4 = new SampleBuilder().append(10).append(10).append(12).buildAsInputStream();

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = ":)" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}

	@Test
	public void shouldHandleSadCenariosWithPositiveNumbers() throws IOException {
		InputStream input1 = new SampleBuilder().append(10).append(15).append(12).buildAsInputStream();
		InputStream input2 = new SampleBuilder().append(10).append(15).append(17).buildAsInputStream();
		InputStream input3 = new SampleBuilder().append(10).append(7).append(2).buildAsInputStream();
		InputStream input4 = new SampleBuilder().append(10).append(10).append(8).buildAsInputStream();

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = ":(" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}
	
	@Test
	public void shouldHandleHappyCenariosWithNegativeNumbers() throws IOException {
		InputStream input1 = new SampleBuilder().append(-10).append(-15).append(-12).buildAsInputStream();
		InputStream input2 = new SampleBuilder().append(-10).append(-7).append(-1).buildAsInputStream();
		InputStream input3 = new SampleBuilder().append(-10).append(-15).append(-17).buildAsInputStream();
		InputStream input4 = new SampleBuilder().append(-10).append(-10).append(-8).buildAsInputStream();

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = ":)" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}
	
	@Test
	public void shouldHandleSadCenariosWithNegativeNumbers() throws IOException {
		InputStream input1 = new SampleBuilder().append(-10).append(-5).append(-6).buildAsInputStream();
		InputStream input2 = new SampleBuilder().append(-10).append(-5).append(-3).buildAsInputStream();
		InputStream input3 = new SampleBuilder().append(-10).append(-12).append(-17).buildAsInputStream();
		InputStream input4 = new SampleBuilder().append(-10).append(-10).append(-15).buildAsInputStream();

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = ":(" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}
	
	@Test
	public void shouldHandleHappyCenariosWithNegativeAndPositiveNumbers() throws IOException {
		InputStream input1 = new SampleBuilder().append(5).append(-5).append(-2).buildAsInputStream();
		InputStream input2 = new SampleBuilder().append(-5).append(0).append(7).buildAsInputStream();
		InputStream input3 = new SampleBuilder().append(5).append(0).append(-2).buildAsInputStream();
		InputStream input4 = new SampleBuilder().append(-1).append(-1).append(2).buildAsInputStream();

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = ":)" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}
	
	@Test
	public void shouldHandleSadCenariosWithNegativeAndPositiveNumbers() throws IOException {
		InputStream input1 = new SampleBuilder().append(-5).append(1).append(-1).buildAsInputStream();
		InputStream input2 = new SampleBuilder().append(-5).append(2).append(3).buildAsInputStream();
		InputStream input3 = new SampleBuilder().append(5).append(-1).append(-8).buildAsInputStream();
		InputStream input4 = new SampleBuilder().append(1).append(1).append(-3).buildAsInputStream();

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = ":(" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}

}
