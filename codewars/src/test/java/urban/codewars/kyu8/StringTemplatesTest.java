package urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class StringTemplatesTest {

    @Test
    public void shouldCreateInstance() {
        StringTemplates instance = new StringTemplates();
        Assert.assertNotNull(instance);
    }

    @Test
    public void fixedTests() {
        assertEquals("I like Cheese, Milk, Chocolate!", StringTemplates.buildString("Cheese", "Milk", "Chocolate"));
        assertEquals("I like Cheese, Milk!", StringTemplates.buildString("Cheese", "Milk"));
        assertEquals("I like Chocolate!", StringTemplates.buildString("Chocolate"));
    }

}
