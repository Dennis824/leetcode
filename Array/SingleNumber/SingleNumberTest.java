package Array.SingleNumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    public void testSingleNumber() {
        SingleNumber singleNumber = new SingleNumber();

        // Test case 1: Array with a single unique number
        int[] nums1 = {2};
        int expected1 = 2;
        assertEquals(expected1, singleNumber.singleNumber(nums1));

        // Test case 2: Array with multiple numbers and one unique number
        int[] nums2 = {4, 1, 2, 1, 2};
        int expected2 = 4;
        assertEquals(expected2, singleNumber.singleNumber(nums2));

        // Test case 3: Array with negative numbers
        int[] nums3 = {-1, -2, -3, -2, -1};
        int expected3 = -3;
        assertEquals(expected3, singleNumber.singleNumber(nums3));

        // Test case 4: Array with zeros
        int[] nums4 = {0, 0, 1};
        int expected4 = 1;
        assertEquals(expected4, singleNumber.singleNumber(nums4));

        // Test case 5: Array with a large number of elements
        int[] nums5 = {1, 2, 3, 1, 2, 3, 4, 4, 5, 6, 6};
        int expected5 = 5;
        assertEquals(expected5, singleNumber.singleNumber(nums5));
    }
}
