package String.StringToInteger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringToIntegerTest {

    @Test
    public void testMyAtoi() {
        StringToInteger stringToInteger = new StringToInteger();

        // Test case 1: Valid positive integer
        String str1 = "42";
        int expected1 = 42;
        assertEquals(expected1, stringToInteger.myAtoi(str1));

        // Test case 2: Valid negative integer with sign
        String str2 = "-123";
        int expected2 = -123;
        assertEquals(expected2, stringToInteger.myAtoi(str2));

        // Test case 3: String with leading white spaces
        String str3 = "   987";
        int expected3 = 987;
        assertEquals(expected3, stringToInteger.myAtoi(str3));

        // Test case 4: String with trailing non-digit characters
        String str4 = "4193 with words";
        int expected4 = 4193;
        assertEquals(expected4, stringToInteger.myAtoi(str4));

        // Test case 5: Integer overflow
        String str5 = "2147483648";
        int expected5 = Integer.MAX_VALUE; // Overflow should return Integer.MAX_VALUE
        assertEquals(expected5, stringToInteger.myAtoi(str5));

        // Test case 6: Integer underflow
        String str6 = "-2147483649";
        int expected6 = Integer.MIN_VALUE; // Underflow should return Integer.MIN_VALUE
        assertEquals(expected6, stringToInteger.myAtoi(str6));

        // Test case 7: String with no valid integer
        String str7 = "words and 987";
        int expected7 = 0;
        assertEquals(expected7, stringToInteger.myAtoi(str7));
    }
}
