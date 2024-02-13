package Others.ReverseBits;

public class ReverseBits {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            res= ( res << 1 ) | ( n & 1 );
            n = n >> 1;
        }
        return res;
    }
}
/*
190
TC O(1)
SC O(1)
 */
