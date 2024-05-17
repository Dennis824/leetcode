package Array.PlusOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {

    @Test
    public void testPlusOne() {
        PlusOne plusOne = new PlusOne();

        // Test case 1: [1, 2, 3] + 1 = [1, 2, 4]
        int[] input1 = {1, 2, 3};
        int[] expected1 = {1, 2, 4};
        assertArrayEquals(expected1, plusOne.plusOne(input1));

        // Test case 2: [4, 3, 2, 1] + 1 = [4, 3, 2, 2]
        int[] input2 = {4, 3, 2, 1};
        int[] expected2 = {4, 3, 2, 2};
        assertArrayEquals(expected2, plusOne.plusOne(input2));

        // Test case 3: [9, 9, 9] + 1 = [1, 0, 0, 0]
        int[] input3 = {9, 9, 9};
        int[] expected3 = {1, 0, 0, 0};
        assertArrayEquals(expected3, plusOne.plusOne(input3));

        // Test case 4: [0] + 1 = [1]
        int[] input4 = {0};
        int[] expected4 = {1};
        assertArrayEquals(expected4, plusOne.plusOne(input4));
    }
}

