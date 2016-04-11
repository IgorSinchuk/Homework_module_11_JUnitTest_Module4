import org.junit.Assert.*;

import org.junit.Test;

public class DotsTest {

    @Test
    public void testDistance() throws Exception {
        Dots dots = new Dots(-7, -8, 7, 8);
        int result = (int) dots.distance();
        assertEquals(7, result);
    }
}


