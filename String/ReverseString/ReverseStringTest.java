package String.ReverseString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        ReverseString reverseString = new ReverseString();

        // Test case 1: Array with odd length
        char[] str1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(str1);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, str1);

        // Test case 2: Array with even length
        char[] str2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(str2);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, str2);

        // Test case 3: Empty array
        char[] str3 = {};
        reverseString.reverseString(str3);
        assertArrayEquals(new char[]{}, str3);

        // Test case 4: Array with a single character
        char[] str4 = {'a'};
        reverseString.reverseString(str4);
        assertArrayEquals(new char[]{'a'}, str4);
    }
}
