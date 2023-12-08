import static org.junit.Assert.*;

import dev.greenriver.edu.Dice;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testRoll() {
        Dice sixSidedDie = new Dice(6, "Red");
        int result = sixSidedDie.roll();
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    public void testGetSides() {
        Dice twelveSidedDie = new Dice(12, "Green");
        assertEquals(12, twelveSidedDie.getSides());
    }

    @Test
    public void testGetColor() {
        Dice fourSidedDie = new Dice(4, "Yellow");
        assertEquals("Yellow", fourSidedDie.getColor());
    }

    @Test
    public void testToString() {
        Dice twentySidedDie = new Dice(20, "Purple");
        assertEquals("A 20 sided die", twentySidedDie.toString());
    }
}
