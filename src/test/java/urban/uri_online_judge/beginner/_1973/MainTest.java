package urban.uri_online_judge.beginner._1973;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleContentLoader;
import urban.uri_online_judge.beginner._1973.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1973");
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleMinInput() throws IOException {
		InputStream input = new SampleBuilder().appendln(1).appendln(1).buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("1 0").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleOneSheepOnEachFarmWithoutReturn() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln("1 1 1 1 1").buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("5 0").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleThreeSheepsOnEachFarmWithoutReturn() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln("3 3 3 3 3").buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("5 10").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleOneSheepWithReturnAtTheMiddle() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln("1 1 2 1 1").buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("3 3").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleThreeSheepsOnEachFarmWithReturnAtTheMiddle() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln("3 3 2 3 3").buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("3 9").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleOneSheepWithReturnAtTheEnd() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln("1 1 1 1 2").buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("5 1").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleOneSheepWithReturnAtTheEndAndAddingOnReturn() throws IOException {
		InputStream input = new SampleBuilder().appendln(5).appendln("3 3 3 3 2").buildAsInputStream();
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("5 5").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleURISamples() throws IOException {
		InputStream input1 = new SampleBuilder().appendln(8).appendln("1 3 5 7 11 13 17 19").buildAsInputStream();
		String output1 = Main.main(input1);
		String expectedOutput1 = new SampleBuilder().appendln("8 68").build();
		assertEquals(expectedOutput1, output1);
		
		InputStream input2 = new SampleBuilder().appendln(8).appendln("1 3 5 7 11 13 16 19").buildAsInputStream();
		String output2 = Main.main(input2);
		String expectedOutput2 = new SampleBuilder().appendln("7 63").build();
		assertEquals(expectedOutput2, output2);
	}
	
	@Test
	public void shouldHandleMaxInput1() throws IOException {
		InputStream input = scl.loadAsInputStream("max.in");
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("10000 99990000").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleMaxInput2() throws IOException {
		InputStream input = scl.loadAsInputStream("max2.in");
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("16000 15999968000").build();
		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleMaxInput3() throws IOException {
		InputStream input = scl.loadAsInputStream("max3.in");
		String output = Main.main(input);
		String expectedOutput = new SampleBuilder().appendln("8000 15999968002").build();
		assertEquals(expectedOutput, output);
	}
	
	

}
