package urban.codewars.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CreatePhoneNumberTest {

    @Test
    public void shouldCreateInstance() {
        CreatePhoneNumber instance = new CreatePhoneNumber();
        assertNotNull(instance);
    }

    @Test
    public void deveGerarNumero() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}
