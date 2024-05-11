package Array.MoveZeroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void testMoveZeroes() {
        MoveZeroes mover = new MoveZeroes();

        // Test case 1: Basic case with some zeros in the middle
        int[] nums1 = {0, 1, 0, 3, 12};
        mover.moveZeroes(nums1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums1);

        // Test case 2: No zeros in the array
        int[] nums2 = {1, 2, 3, 4, 5};
        mover.moveZeroes(nums2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums2);

        // Test case 3: All zeros in the array
        int[] nums3 = {0, 0, 0, 0};
        mover.moveZeroes(nums3);
        assertArrayEquals(new int[]{0, 0, 0, 0}, nums3);

        // Test case 4: Empty array
        int[] nums4 = {};
        mover.moveZeroes(nums4);
        assertArrayEquals(new int[]{}, nums4);

        // Test case 5: Array with a single element
        int[] nums5 = {42};
        mover.moveZeroes(nums5);
        assertArrayEquals(new int[]{42}, nums5);
    }
}