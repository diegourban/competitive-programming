package urban.uri_online_judge;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class ReaderTest {
	
	@Test
	public void shouldCreateInstance() {
		assertNotNull(new Reader(null));
	}
	
	@Test
	public void shouldReadOneLine() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("this is a line").build();
		
		Reader reader = new Reader(input);
		String line = reader.readLine();
		reader.close();
		
		assertEquals("this is a line", line);
	}
	
//	@Test
//	public void shouldReadTwoLines() throws IOException {
//		InputStream input = new InputStreamBuilder().addLine("this is a line").addLine("this is another").build();
//		
//		Reader reader = new Reader(input);
//		String firstLine = reader.readLine();
//		String secondLine = reader.readLine();
//		reader.close();
//		
//		assertEquals("this is a line", firstLine);
//		assertEquals("this is a line", secondLine);
//	}
	
	@Test
	public void shouldReadPositiveIntegerOnOnesPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("5").build();
		
		Reader reader = new Reader(input);
		int nextInt = reader.nextInt();
		reader.close();
		
		assertEquals(5, nextInt);
	}
	
	@Test
	public void shouldReadNegativeIntegerOnOnesPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-4").build();
		
		Reader reader = new Reader(input);
		int nextInt = reader.nextInt();
		reader.close();
		
		assertEquals(-4, nextInt);
	}
	
	@Test
	public void shouldReadPositiveIntegerOnTensPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("16").build();
		
		Reader reader = new Reader(input);
		int nextInt = reader.nextInt();
		reader.close();
		
		assertEquals(16, nextInt);
	}
	
	@Test
	public void shouldReadNegativeIntegerOnTensPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-20").build();
		
		Reader reader = new Reader(input);
		int nextInt = reader.nextInt();
		reader.close();
		
		assertEquals(-20, nextInt);
	}
	
	@Test
	public void shouldReadPositiveIntegerOnHundredsPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("123").build();
		
		Reader reader = new Reader(input);
		int nextInt = reader.nextInt();
		reader.close();
		
		assertEquals(123, nextInt);
	}
	
	@Test
	public void shouldReadNegativeIntegerOnHundredsPlace() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-321").build();
		
		Reader reader = new Reader(input);
		int nextInt = reader.nextInt();
		reader.close();
		
		assertEquals(-321, nextInt);
	}
	
	@Test
	public void shouldReadChainOfIntegers() throws IOException {
		InputStream input = new InputStreamBuilder().addLine("-123 987 -88 74 -9 7").build();
		
		Reader reader = new Reader(input);
		int first = reader.nextInt();
		int second = reader.nextInt();
		int third = reader.nextInt();
		int fourth = reader.nextInt();
		int fifth = reader.nextInt();
		int sixth = reader.nextInt();
		reader.close();
		
		assertEquals(first, -123);
		assertEquals(second, 987);
		assertEquals(third, -88);
		assertEquals(fourth, 74);
		assertEquals(fifth, -9);
		assertEquals(sixth, 7);
	}

}
