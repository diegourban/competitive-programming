package urban.uri_online_judge.beginner._1172;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1172.Main;

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
	public void shouldReplaceAllByOne() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(0)//
				.appendln(-5)//
				.appendln(-63)//
				.appendln(0)//
				.appendln(-99)//
				.appendln(-5)//
				.appendln(-4)//
				.appendln(-9)//
				.appendln(-6)//
				.appendln(0)//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("X[0] = 1")//
				.appendln("X[1] = 1")//
				.appendln("X[2] = 1")//
				.appendln("X[3] = 1")//
				.appendln("X[4] = 1")//
				.appendln("X[5] = 1")//
				.appendln("X[6] = 1")//
				.appendln("X[7] = 1")//
				.appendln("X[8] = 1")//
				.appendln("X[9] = 1")//				
				.build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldNotReplaceByOne() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(10)//
				.appendln(5)//
				.appendln(63)//
				.appendln(20)//
				.appendln(99)//
				.appendln(5)//
				.appendln(4)//
				.appendln(9)//
				.appendln(6)//
				.appendln(80)//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("X[0] = 10")//
				.appendln("X[1] = 5")//
				.appendln("X[2] = 63")//
				.appendln("X[3] = 20")//
				.appendln("X[4] = 99")//
				.appendln("X[5] = 5")//
				.appendln("X[6] = 4")//
				.appendln("X[7] = 9")//
				.appendln("X[8] = 6")//
				.appendln("X[9] = 80")//				
				.build();

		assertEquals(expectedOutput, output);
	}

	@Test
	public void shouldHandleSample1() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(0)//
				.appendln(-5)//
				.appendln(63)//
				.appendln(0)//
				.appendln(99)//
				.appendln(5)//
				.appendln(-4)//
				.appendln(9)//
				.appendln(-6)//
				.appendln(0)//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("X[0] = 1")//
				.appendln("X[1] = 1")//
				.appendln("X[2] = 63")//
				.appendln("X[3] = 1")//
				.appendln("X[4] = 99")//
				.appendln("X[5] = 5")//
				.appendln("X[6] = 1")//
				.appendln("X[7] = 9")//
				.appendln("X[8] = 1")//
				.appendln("X[9] = 1")//				
				.build();

		assertEquals(expectedOutput, output);
	}
	
	@Test
	public void shouldHandleSample2() throws IOException {
		String inputSample = new SampleBuilder()//
				.appendln(-1)//
				.appendln(-45234)//
				.appendln(-22)//
				.appendln(-120)//
				.appendln(0)//
				.appendln(2)//
				.appendln(-200)//
				.appendln(1)//
				.appendln(9)//
				.appendln(22)//
				.build();
		InputStream input = this.inputStream.build(inputSample);

		String output = Main.main(input);
		String expectedOutput = new SampleBuilder()//
				.appendln("X[0] = 1")//
				.appendln("X[1] = 1")//
				.appendln("X[2] = 1")//
				.appendln("X[3] = 1")//
				.appendln("X[4] = 1")//
				.appendln("X[5] = 2")//
				.appendln("X[6] = 1")//
				.appendln("X[7] = 1")//
				.appendln("X[8] = 9")//
				.appendln("X[9] = 22")//				
				.build();

		assertEquals(expectedOutput, output);
	}

}
