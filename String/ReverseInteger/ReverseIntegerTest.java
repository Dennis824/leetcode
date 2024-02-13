package String.ReverseInteger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverse() {
        ReverseInteger reverseInteger = new ReverseInteger();

        // Test case 1: Positive integer
        int input1 = 123;
        int expected1 = 321;
        assertEquals(expected1, reverseInteger.reverse(input1));

        // Test case 2: Negative integer
        int input2 = -123;
        int expected2 = -321;
        assertEquals(expected2, reverseInteger.reverse(input2));

        // Test case 3: Integer with trailing zeros
        int input3 = 120;
        int expected3 = 21;
        assertEquals(expected3, reverseInteger.reverse(input3));

        // Test case 4: Large integer with overflow
        int input4 = 1534236469;
        int expected4 = 0; // Overflow should return 0
        assertEquals(expected4, reverseInteger.reverse(input4));

        // Test case 5: Integer with single digit
        int input5 = 5;
        int expected5 = 5;
        assertEquals(expected5, reverseInteger.reverse(input5));
    }
}