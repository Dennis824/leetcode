package Array.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i: nums){
            if(!set.add(i))return true;
        }
        return false;
    }
}
/*
217
Time Complexity = O(N)
Space Complexity = O(N)
*/

