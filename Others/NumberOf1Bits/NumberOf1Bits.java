package Others.NumberOf1Bits;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count =0;
        while(n != 0){
            long rsb = n & -n;
            n -= rsb;
            count++;
        }
        return count;
    }

}
/*
191
*/