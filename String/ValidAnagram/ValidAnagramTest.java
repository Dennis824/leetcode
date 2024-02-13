package String.ValidAnagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();

        // Test case 1: Anagrams with the same characters
        String s1 = "listen";
        String t1 = "silent";
        assertTrue(validAnagram.isAnagram(s1, t1));

        // Test case 2: Anagrams with different characters
        String s2 = "hello";
        String t2 = "world";
        assertFalse(validAnagram.isAnagram(s2, t2));

        // Test case 3: Anagrams with different lengths
        String s3 = "anagram";
        String t3 = "nagarama";
        assertFalse(validAnagram.isAnagram(s3, t3));

        // Test case 4: Empty strings (Anagrams by definition)
        String s4 = "";
        String t4 = "";
        assertTrue(validAnagram.isAnagram(s4, t4));

        // Test case 5: Anagrams with only one character
        String s5 = "a";
        String t5 = "a";
        assertTrue(validAnagram.isAnagram(s5, t5));

        // Test case 6: Anagrams with uppercase and lowercase characters
        String s6 = "Listen";
        String t6 = "Silent";
        assertTrue(validAnagram.isAnagram(s6, t6));
    }
}
