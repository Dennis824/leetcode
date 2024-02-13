package String.FindIndexofFirstOccurrenceInString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindIndexofFirstOccurrenceInStringTest {

    @Test
    public void testStrStr() {
        FindIndexofFirstOccurrenceInString finder = new FindIndexofFirstOccurrenceInString();

        // Test case 1: Needle found at the beginning of haystack
        String haystack1 = "hello";
        String needle1 = "he";
        int expected1 = 0;
        assertEquals(expected1, finder.strStr(haystack1, needle1));

        // Test case 2: Needle found in the middle of haystack
        String haystack2 = "mississippi";
        String needle2 = "issi";
        int expected2 = 1;
        assertEquals(expected2, finder.strStr(haystack2, needle2));

        // Test case 3: Needle found at the end of haystack
        String haystack3 = "abcdefg";
        String needle3 = "fg";
        int expected3 = 5;
        assertEquals(expected3, finder.strStr(haystack3, needle3));

        // Test case 4: Needle not found in haystack
        String haystack4 = "abcdefg";
        String needle4 = "xyz";
        int expected4 = -1;
        assertEquals(expected4, finder.strStr(haystack4, needle4));

        // Test case 5: Empty haystack and needle (needle found at index 0)
        String haystack5 = "";
        String needle5 = "";
        int expected5 = 0;
        assertEquals(expected5, finder.strStr(haystack5, needle5));

        // Test case 6: Empty needle (needle found at index 0)
        String haystack6 = "abc";
        String needle6 = "";
        int expected6 = 0;
        assertEquals(expected6, finder.strStr(haystack6, needle6));

        // Test case 7: Empty haystack (needle not found)
        String haystack7 = "";
        String needle7 = "xyz";
        int expected7 = -1;
        assertEquals(expected7, finder.strStr(haystack7, needle7));
    }
}
