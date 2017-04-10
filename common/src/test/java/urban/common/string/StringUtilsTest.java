package urban.common.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void shouldFindRotationPoint() {
        assertEquals(2, StringUtils.findRotationPoint(new String[]{"k", "v", "a", "b", "c", "d", "e", "g", "i"}));
        assertEquals(5, StringUtils.findRotationPoint(new String[]{"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist", "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage",}));
    }
}
