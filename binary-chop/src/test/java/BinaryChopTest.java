import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryChopTest {
    @Test
    public void testIntNotFoundInArray() {
        BinaryChop chopper = new BinaryChop();
        assertEquals(-1, chopper.chop(0, new int[]{1}));
    }
}
