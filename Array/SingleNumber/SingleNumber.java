package Array.SingleNumber;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }

}

  /*
    136
Time Complexity = O(N)
Space Complexity = O(1)
    */