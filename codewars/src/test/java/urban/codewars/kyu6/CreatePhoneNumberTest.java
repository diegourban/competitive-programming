package urban.codewars.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreatePhoneNumberTest {

    @Test
    public void deveInstanciar() {
        CreatePhoneNumber instance = new CreatePhoneNumber();
        assertNotNull(instance);
    }

    @Test
    public void deveGerarNumero() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}
