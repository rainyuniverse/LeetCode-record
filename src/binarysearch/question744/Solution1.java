package binarysearch.question744;
// 二分法 寻找左侧边界
class Solution1 {
    public char nextGreatestLetter(char[] letters, char target) {
        int res = 0;
        int[] arr = new int[letters.length];
        for(int i = 0; i < letters.length; i++){
            arr[i] = (int)letters[i];
        }
        int transtar = (int)target;

        int left = 0;
        int right = letters.length;
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] > transtar){
                right = mid;
            }else if(arr[mid] <= transtar){
                left = mid + 1;
            }
        }
        res = (left + right) / 2;
        return (char)arr[res % letters.length];
    }
}
