package oneQuestionEveryDay.day0317;

import java.util.*;

/**
 * 执行用时：64 ms, 在所有 Java 提交中击败了5.11%的用户
 * 内存消耗：41.9 MB, 在所有 Java 提交中击败了10.12%的用户
 */
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        int count = 1;
        for(int i = 0; i < words.length; i++){
            //第二层的循环可以优化掉
            for(int j = 0; j < words[i].length(); j++){
                if(set.contains(words[i].substring(0, j + 1))){
                    continue;
                }
                if(!set.contains(words[i].substring(0, j + 1)) && j != words[i].length() - 1){
                    break;
                }
                if(!set.contains(words[i].substring(0, j + 1)) && j == words[i].length() - 1){
                    set.add(words[i].substring(0, j + 1));
                    if(j + 1 > count){
                        list.clear();
                        list.add(words[i]);
                        count = j + 1;
                    }else if(j + 1 == count){
                        list.add(words[i]);
                    }
                }
            }
        }
        if(list.isEmpty()){
            return "";
        }
        String res = list.get(0);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).compareTo(res) < 0){
                res = list.get(i);
            }
        }
        return res;
    }
}
