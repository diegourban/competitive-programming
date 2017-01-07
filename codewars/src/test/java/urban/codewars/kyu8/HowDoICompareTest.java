package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowDoICompareTest {

    private static final Object[][] tests = {{0, "nothing"}, {123, "nothing"}, {-1, "nothing"},
            {42, "everything"}, {42 * 42, "everything squared"},};

    @Test
    public void shouldCreateInstance() {
        HowDoICompare instance = new HowDoICompare();
        Assert.assertNotNull(instance);
    }

    @Test
    public void test() throws Exception {
        for (Object[] t : tests)
            assertEquals(t[1], HowDoICompare.whatIs((Integer) t[0]));
    }

}
