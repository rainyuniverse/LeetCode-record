package race.race3.question3;

import java.util.ArrayList;
import java.util.List;
// error
class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long[] res = new long[queries.length];
        for(int i = 0; i < queries.length; i++){
//            long thisTurn = (long) (Math.pow(10, intLength - 1) + 1);
            long thisTurn = 0;
            int curQuery = queries[i];

            // 记录能除以几次10
            int count = 0;
            int tempQuery = curQuery;
            // 记录每次除以10的余数
            List<Integer> modList = new ArrayList<>();
            // 记录每次除以10得几
            List<Integer> resList = new ArrayList<>();
            while(tempQuery > 10){
                int curMod = tempQuery % 10;
                int curRes = tempQuery / 10;
                tempQuery = curRes;

                modList.add(curMod);
                resList.add(curRes);
            }
            modList.add(tempQuery);
            resList.add(0);

            // 记录乘的10
            long[] arr = new long[intLength];
            int cur10 = 1;
            for(int j = 0; j < intLength; j++){
                arr[j] = cur10;
                cur10 = 10 * cur10;
            }

            // 记录是否是奇数位
            int midFlag = (intLength + 1) % 2;
            // 记录中间位置
            int mid = (intLength - 1) / 2;
            for(int j = 0; j < resList.size(); j++){
                if(midFlag == 0){
                    if(j == 0){
                        thisTurn = thisTurn + modList.get(modList.size() - j - 1) * (arr[mid]);
                    }else{
                        if(modList.get(modList.size() - j - 1) == 0){
                            thisTurn = thisTurn + 9 * (arr[mid + j] + arr[mid - j]);
                        }else{
                            thisTurn = thisTurn + (modList.get(modList.size() - j - 1) - 1) * (arr[mid + j] + arr[mid - j]);
                        }
                    }
                }else if(midFlag == 1){
                    thisTurn = thisTurn + (modList.get(modList.size() - j - 1) - 1) * (arr[mid + j + 1] + arr[mid - j]);
                }
            }
            res[i] = thisTurn;
        }
        return res;
    }
}
