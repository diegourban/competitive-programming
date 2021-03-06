package urban.codewars.kyu8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusTest {

    @Test
    public void shouldCreateInstance() {
        Bonus instance = new Bonus();
        Assert.assertNotNull(instance);
    }

    @Test
    public void deveGanharBonus() {
        assertEquals("\u00A31000", Bonus.bonusTime(100, true));
    }

    @Test
    public void naoDeveGanharBonus() {
        assertEquals("\u00A3200", Bonus.bonusTime(200, false));
    }

}
