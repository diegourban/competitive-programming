package urban.uri_online_judge.beginner._1855;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.common.SampleContentLoader;
import urban.uri_online_judge.beginner._1855.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1855");
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleLoopsSamples() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleLoop1.in");
		InputStream input2 = scl.loadAsInputStream("sampleLoop2.in");
		InputStream input3 = scl.loadAsInputStream("sampleLoop3.in");
		InputStream input4 = scl.loadAsInputStream("sampleLoop4.in");

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = "!" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}
	
	@Test
	public void shouldFindChestSamples() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleFindChest1.in");
		InputStream input2 = scl.loadAsInputStream("sampleFindChest2.in");
		InputStream input3 = scl.loadAsInputStream("sampleFindChest3.in");
		InputStream input4 = scl.loadAsInputStream("sampleFindChest4.in");
		InputStream input5 = scl.loadAsInputStream("sampleFindChest5.in");
		InputStream input6 = scl.loadAsInputStream("sampleFindChest6.in");

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);
		String output5 = Main.main(input5);
		String output6 = Main.main(input6);

		String expectedOutput = "*" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
		assertEquals(expectedOutput, output5);
		assertEquals(expectedOutput, output6);
	}
	
	@Test
	public void shouldHandleSamplesOutOfBounds() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleOutOfBounds1.in");
		InputStream input2 = scl.loadAsInputStream("sampleOutOfBounds2.in");
		InputStream input3 = scl.loadAsInputStream("sampleOutOfBounds3.in");
		InputStream input4 = scl.loadAsInputStream("sampleOutOfBounds4.in");

		String output1 = Main.main(input1);
		String output2 = Main.main(input2);
		String output3 = Main.main(input3);
		String output4 = Main.main(input4);

		String expectedOutput = "!" + System.lineSeparator();

		assertEquals(expectedOutput, output1);
		assertEquals(expectedOutput, output2);
		assertEquals(expectedOutput, output3);
		assertEquals(expectedOutput, output4);
	}

}
