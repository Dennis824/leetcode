package LongestIncreasingSubsequence300;

class LongestIncreasingSubsequence300{
    public int lengthOfLIS(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] dpArray = new int[nums.length];
        Arrays.fill(dpArray, 1);
        for(int i = 0; i < dpArray.length; i++) {
            int curr = nums[i];
            for(int j = 0; j < i; j++) {
                int temp = nums[j];
                if (temp < curr) {
                    dpArray[i] = Math.max(dpArray[i], dpArray[j] + 1);
                    max = Math.max(max, dpArray[i]);
                }
            }
        }
        return max == Integer.MIN_VALUE ? 1 : max;
    }

}