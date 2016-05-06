package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class StringTemplatesTest {
	
	@Test
	public void deveInstanciar() {
		StringTemplates instance = new StringTemplates();
		Assert.assertNotNull(instance);
	}
	
	@Test
    public void fixedTests() {
      assertEquals(StringTemplates.buildString("Cheese","Milk","Chocolate"),"I like Cheese, Milk, Chocolate!",StringTemplates.buildString("Cheese","Milk","Chocolate"));
      assertEquals(StringTemplates.buildString("Cheese","Milk"),"I like Cheese, Milk!",StringTemplates.buildString("Cheese","Milk","Chocolate"));
      assertEquals(StringTemplates.buildString("Chocolate"),"I like Chocolate!",StringTemplates.buildString("Cheese","Milk","Chocolate"));
    }

}
