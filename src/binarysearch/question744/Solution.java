package binarysearch.question744;
// 暴力解法
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int res = 0;
        int[] arr = new int[letters.length];
        for(int i = 0; i < letters.length; i++){
            arr[i] = (int)letters[i];
        }
        int transtar = (int)target;
        for(int i = 0; i < letters.length; i++){
            if(arr[i] > transtar){
                res = arr[i];
                break;
            }
        }
        if(res == 0){
            res = arr[0];
        }
        return (char)res;
    }
}
