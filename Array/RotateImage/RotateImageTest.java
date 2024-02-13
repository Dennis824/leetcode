package Array.RotateImage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateImageTest {

    @Test
    public void testRotate() {
        RotateImage rotator = new RotateImage();

        // Test case 1: Rotate a 2x2 matrix
        int[][] matrix1 = {{1, 2}, {3, 4}};
        rotator.rotate(matrix1);
        int[][] expected1 = {{3, 1}, {4, 2}};
        assertArrayEquals(expected1, matrix1);

        // Test case 2: Rotate a 3x3 matrix
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotator.rotate(matrix2);
        int[][] expected2 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(expected2, matrix2);

        // Test case 3: Rotate a 4x4 matrix
        int[][] matrix3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotator.rotate(matrix3);
        int[][] expected3 = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        assertArrayEquals(expected3, matrix3);
    }
}
