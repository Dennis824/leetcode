package MaximumElementAfterDecrementingAndRearranging1846;

import java.util.Arrays;

public class MaximumElementAfterDecrementingAndRearranging1846 {
        public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
            Arrays.sort(arr);
            int ans = 1;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] >= ans + 1) {
                    ans++;
                }
            }

            return ans;
        }
    }