package oneQuestionEveryDay.day0322;
//脑筋急转弯

/**
 * 执行用时：10 ms, 在所有 Java 提交中击败了61.01%的用户
 * 内存消耗：42.2 MB, 在所有 Java 提交中击败了46.54%的用户
 */
class Solution {
    public boolean winnerOfGame(String colors) {
        int countA = 0;
        int countB = 0;
        char[] arr = colors.toCharArray();
        for(int i = 1; i < colors.length() - 1; i++){
            if(arr[i - 1] == 'A' && arr[i] == 'A' && arr[i + 1] == 'A'){
                countA = countA + 1;
            }

            if(arr[i - 1] == 'B' && arr[i] == 'B' && arr[i + 1] == 'B'){
                countB = countB + 1;
            }
        }
        if(countA > countB){
            return true;
        }
        return false;
    }
}
