package String.FirstUniqueChar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqCharTest {

    @Test
    public void testFirstUniqChar() {
        FirstUniqChar firstUniqChar = new FirstUniqChar();

        // Test case 1: String with a unique character
        String s1 = "leetcode";
        int expected1 = 0;
        assertEquals(expected1, firstUniqChar.firstUniqChar(s1));

        // Test case 2: String with no unique character
        String s2 = "loveleetcode";
        int expected2 = 2;
        assertEquals(expected2, firstUniqChar.firstUniqChar(s2));

        // Test case 3: Empty string
        String s3 = "";
        int expected3 = -1;
        assertEquals(expected3, firstUniqChar.firstUniqChar(s3));

        // Test case 4: String with all unique characters
        String s4 = "abcdefg";
        int expected4 = 0;
        assertEquals(expected4, firstUniqChar.firstUniqChar(s4));
    }
}
