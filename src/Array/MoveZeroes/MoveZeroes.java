package Array.MoveZeroes;

class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int l = 0;
        int r = 1;
        int n = nums.length;
        while (r < n) {
            if (nums[l] != 0) {
                l++;
                r++;
            } else if (nums[r] == 0) {
                r++;
            } else {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
            }
        }
    }
}
/*
283
TC O(n)
SP 0(1)
*/