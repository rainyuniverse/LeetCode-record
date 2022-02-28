package binarysearch.question69;

class Solution {
    public int mySqrt(int x) {
        long res = 0;
        for(long i = 0; ; i++){
            if(i*i > x){
                res = i - 1;
                break;
            }
        }
        return (int) res;
    }
}
