package Array.TwoSum;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();

        // Test case 1: Array with a valid solution
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, twoSum.twoSum(nums1, target1));

        // Test case 2: Array with no valid solution
        int[] nums2 = {3, 5, 8, 12};
        int target2 = 7;
        int[] expected2 = {};
        assertArrayEquals(expected2, twoSum.twoSum(nums2, target2));

        // Test case 3: Array with negative numbers and a valid solution
        int[] nums3 = {-1, -2, -3, -4, -5};
        int target3 = -8;
        int[] expected3 = {2, 4};
        assertArrayEquals(expected3, twoSum.twoSum(nums3, target3));

        // Test case 4: Array with duplicate numbers and a valid solution
        int[] nums4 = {3, 3};
        int target4 = 6;
        int[] expected4 = {0, 1};
        assertArrayEquals(expected4, twoSum.twoSum(nums4, target4));
    }
}