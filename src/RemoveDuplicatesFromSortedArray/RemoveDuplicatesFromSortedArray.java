package RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;

    }
}
/*
26
Time complexity:O(n)
Space complexity:O(1)
*/



