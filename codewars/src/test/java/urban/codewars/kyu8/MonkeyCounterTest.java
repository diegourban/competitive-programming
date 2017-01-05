package urban.codewars.kyu8;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class MonkeyCounterTest {

    @Test
    public void shouldCreateInstance() {
        MonkeyCounter instance = new MonkeyCounter();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveContar5() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, MonkeyCounter.monkeyCount(5));
    }

    @Test
    public void deveContar1() {
        assertArrayEquals(new int[]{1}, MonkeyCounter.monkeyCount(1));
    }

    @Test
    public void deveContar20() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, MonkeyCounter.monkeyCount(20));
    }

    @Test
    public void deveContar0() {
        assertArrayEquals(new int[]{}, MonkeyCounter.monkeyCount(0));
    }

    @Test
    public void deveContar3BestPractice() {
        assertArrayEquals(new int[]{1, 2, 3}, MonkeyCounter.monkeyCountBestPractice(3));
    }

}
