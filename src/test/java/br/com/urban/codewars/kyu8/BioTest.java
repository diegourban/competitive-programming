package br.com.urban.codewars.kyu8;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BioTest {
	
	private Bio bio;
	
	@Before
	public void setUp() {
		bio = new Bio();
	}
	
	@After
	public void setDown() {
		bio = null;
	}
	
	@Test
	public void deveInstanciar() {
		Assert.assertNotNull(bio);
	}
	
	@Test
    public void testDna() throws Exception {
        assertEquals(bio.dnaToRna("TTTT"), bio.dnaToRna("TTTT"), "UUUU");
    }
    
    @Test
    public void testDna2() throws Exception {
        assertEquals(bio.dnaToRna("GCAT"), bio.dnaToRna("GCAT"), "GCAU");
    }

}
