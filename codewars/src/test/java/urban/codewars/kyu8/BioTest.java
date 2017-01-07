package urban.codewars.kyu8;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void shouldCreateInstance() {
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
