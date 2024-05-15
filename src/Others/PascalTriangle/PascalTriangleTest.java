package Others.PascalTriangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalTriangleTest {
    @Test
    public void testGeneratePascalsTriangle() {
        PascalTriangle pascalTriangle = new PascalTriangle();

        // Test case 1: Generate Pascal's Triangle with 5 rows.
        int numRows1 = 5;
        List<List<Integer>> result1 = pascalTriangle.generate(numRows1);
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1));
        expected1.add(Arrays.asList(1, 1));
        expected1.add(Arrays.asList(1, 2, 1));
        expected1.add(Arrays.asList(1, 3, 3, 1));
        expected1.add(Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(expected1, result1);

        // Test case 2: Generate Pascal's Triangle with 1 row.
        int numRows2 = 1;
        List<List<Integer>> result2 = pascalTriangle.generate(numRows2);
        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(1));
        assertEquals(expected2, result2);

        // Test case 3: Generate Pascal's Triangle with 0 rows.
        int numRows3 = 0;
        List<List<Integer>> result3 = pascalTriangle.generate(numRows3);
        List<List<Integer>> expected3 = new ArrayList<>();
        assertEquals(expected3, result3);
    }
}