package urban.uri_online_judge.beginner._1929;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.SampleContentLoader;
import urban.uri_online_judge.beginner._1929.Main;

public class MainTest {
	
	private SampleContentLoader scl = new SampleContentLoader("beginner", "1929");

	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Main());
	}

	@Test
	public void shouldHandleURISample1() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI1.in");

		String output1 = Main.main(input1);

		String expectedOutput = new SampleBuilder().appendln("S").build();

		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleURISample2() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleURI2.in");
		
		String output1 = Main.main(input1);
		
		String expectedOutput = new SampleBuilder().appendln("N").build();
		
		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleUDebugSample1() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleUDebug1.in");
		
		String output1 = Main.main(input1);
		
		String expectedOutput = new SampleBuilder().appendln("S").build();
		
		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleUDebugSample2() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleUDebug2.in");
		
		String output1 = Main.main(input1);
		
		String expectedOutput = new SampleBuilder().appendln("S").build();
		
		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleUDebugSample3() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleUDebug3.in");
		
		String output1 = Main.main(input1);
		
		String expectedOutput = new SampleBuilder().appendln("S").build();
		
		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleUDebugSample4() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleUDebug4.in");
		
		String output1 = Main.main(input1);
		
		String expectedOutput = new SampleBuilder().appendln("S").build();
		
		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleUDebugSample5() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleUDebug5.in");
		
		String output1 = Main.main(input1);
		
		String expectedOutput = new SampleBuilder().appendln("S").build();
		
		assertEquals(expectedOutput, output1);
	}
	
	@Test
	public void shouldHandleUDebugSample6() throws IOException {
		InputStream input1 = scl.loadAsInputStream("sampleUDebug6.in");
		
		String output1 = Main.main(input1);
		
		String expectedOutput = new SampleBuilder().appendln("S").build();
		
		assertEquals(expectedOutput, output1);
	}
}
