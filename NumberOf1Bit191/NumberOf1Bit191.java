package NumberOf1Bit191;

public class NumberOf1Bit191 {
    // you need to treat n as an unsigned value
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