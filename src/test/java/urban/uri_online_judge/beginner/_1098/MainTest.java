package urban.uri_online_judge.beginner._1098;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import urban.uri_online_judge.InputStreamBuilder;
import urban.uri_online_judge.SampleBuilder;
import urban.uri_online_judge.beginner._1098.Main;

public class MainTest {
	
	private static final NumberFormat formatter;

	static {
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		formatter = new DecimalFormat("#0.#", decimalFormatSymbols);
	}
	
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
	public void shouldCalculateSequenceIJ4() throws IOException {
		InputStream input = this.inputStream.build(new SampleBuilder().build());
		
		String output = Main.main(input);
		
		StringBuilder sb = new StringBuilder();
		for(double i = 0, j = 1; i <= 2; i+=0.2, j+=0.2) {
			sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j)).append(System.lineSeparator());
			sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j+1)).append(System.lineSeparator());
			sb.append("I=").append(formatter.format(i)).append(" ").append("J=").append(formatter.format(j+2)).append(System.lineSeparator());
		}
		
		assertEquals(sb.toString(), output);
	}

}
