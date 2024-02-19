package PowerOfTwo231;

class PowerOfTwo231{
    public boolean isPowerOfTwo(int n) {
        boolean flag = false;
        if(n==0) return flag;
        if(n==1) return !flag;
        if(n%2 != 0)return flag;

        while(n %2 == 0){
            n/=2;
            if(n==1) flag = true;


        }
        return flag;
    }
}