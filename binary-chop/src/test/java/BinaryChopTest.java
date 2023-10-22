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

    @Test
    public void testChop() {
        assertEquals(-1, chopper.chop(3, new int[]{}));
        assertEquals(-1, chopper.chop(3, new int[]{1}));
        assertEquals(0,  chopper.chop(1, new int[]{1}));

        assertEquals(0,  chopper.chop(1, new int[]{1, 3, 5}));
        assertEquals(1,  chopper.chop(3, new int[]{1, 3, 5}));
        assertEquals(2,  chopper.chop(5, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(0, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(2, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(4, new int[]{1, 3, 5}));
        assertEquals(-1, chopper.chop(6, new int[]{1, 3, 5}));

        assertEquals(0,  chopper.chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1,  chopper.chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2,  chopper.chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3,  chopper.chop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, chopper.chop(8, new int[]{1, 3, 5, 7}));
    }
}
