package search.backtracking.question93;

import java.util.ArrayList;
import java.util.List;
//菜鸡版回溯 判断条件实在是写太多了
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        String curStr = "";
        backtracking(s, res, 0, curStr, 0);
        return res;
    }

    private void backtracking(String s, List<String> res, int index, String curStr, int count){
        if(count == 4 && index == s.length()){
            res.add(curStr);
            return;
        }
        if(count >= 4 || index >= s.length()){
            return;
        }

        //假如下一位是0的情况
        if(s.charAt(index) == '0'){
            if(count == 0){
                curStr = curStr + "0";
            }else{
                curStr = curStr + "." + "0";
            }
            backtracking(s, res, index + 1, curStr, count + 1);
            if(count == 0){
                curStr = curStr.substring(0, curStr.length() - 1);
            }else{
                curStr = curStr.substring(0, curStr.length() - 2);
            }
            return;
        }
        //下一位不是0的情况，划分1位、2位、3位（小于255）
        for(int i = 1; i <= 3; i++){
            if(index + i > s.length()){
                return;
            }
            if(i == 3 && Integer.parseInt(s.substring(index, index + i)) > 255){
                return;
            }

            if(count == 0){
                curStr = curStr + s.substring(index, index + i);
            }else{
                curStr = curStr + "." + s.substring(index, index + i);
            }

            backtracking(s, res, index + i, curStr, count + 1);
            if(count == 0){
                curStr = curStr.substring(0, curStr.length() - i);
            }else{
                curStr = curStr.substring(0, curStr.length() - i - 1);
            }

        }
    }
}
