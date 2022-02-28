package binarysearch.question69;
//二分法
class Solution1 {
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while(left <= right){
            long mid = (left + right) / 2;
            if(mid*mid < x){
                left = mid + 1;
            }else if(mid*mid > x){
                right = mid - 1;
            }else{
                break;
            }
        }

        return (int)(left + right) / 2;
    }
}
