package ReductionOperationsToMakeTheArrayElementsEqual1887;

import java.util.Arrays;

public class ReductionOperationsToMakeTheArrayElementsEqual1887 {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int up = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                up++;
            }

            ans += up;
        }

        return ans;
    }
}
/*
1887
TC O(n log n)
SC O(logn)
*/