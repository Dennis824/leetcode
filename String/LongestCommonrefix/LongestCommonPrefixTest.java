package String.LongestCommonrefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefixFinder = new LongestCommonPrefix();

        // Test case 1: Common prefix in the middle
        String[] strs1 = {"flower", "flow", "flight"};
        String expected1 = "fl";
        assertEquals(expected1, longestCommonPrefixFinder.longestCommonPrefix(strs1));

        // Test case 2: No common prefix
        String[] strs2 = {"dog", "car", "fish"};
        String expected2 = "";
        assertEquals(expected2, longestCommonPrefixFinder.longestCommonPrefix(strs2));

        // Test case 3: Empty array
        String[] strs3 = {};
        String expected3 = "";
        assertEquals(expected3, longestCommonPrefixFinder.longestCommonPrefix(strs3));

        // Test case 4: Single string in the array
        String[] strs4 = {"apple"};
        String expected4 = "apple";
        assertEquals(expected4, longestCommonPrefixFinder.longestCommonPrefix(strs4));

        // Test case 5: Common prefix is the whole string
        String[] strs5 = {"abcde", "abcdef", "abc"};
        String expected5 = "abc";
        assertEquals(expected5, longestCommonPrefixFinder.longestCommonPrefix(strs5));

        // Test case 6: Common prefix with spaces
        String[] strs6 = {"hello world", "hello world", "hello world"};
        String expected6 = "hello world";
        assertEquals(expected6, longestCommonPrefixFinder.longestCommonPrefix(strs6));
    }
}
