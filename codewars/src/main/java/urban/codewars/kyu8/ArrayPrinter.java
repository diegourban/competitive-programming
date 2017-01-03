package urban.codewars.kyu8;

import java.util.Arrays;
import java.util.List;

public class ArrayPrinter {

	public static String printArray(Object array[]) {
		List<Object> list = Arrays.asList(array);
		Object result = list.stream().reduce((t, u) -> t + "," + u).get();
		return result.toString();
	}

}
