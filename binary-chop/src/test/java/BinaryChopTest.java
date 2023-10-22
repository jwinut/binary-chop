import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryChopTest {
    BinaryChop chopper = new BinaryChop();
    @Test
    public void testIntNotFoundInArray() {
        assertEquals(-1, chopper.chop(0, new int[]{1}));
        assertEquals(-1, chopper.chop(3, new int[]{1, 2, 4}));
    }

    @Test
    public void testNumberFoundAtAnyIndex() {
        assertEquals(0, chopper.chop(1, new int[]{1}));
        assertEquals(1, chopper.chop(2, new int[]{1, 2, 3, 4}));
    }
}
