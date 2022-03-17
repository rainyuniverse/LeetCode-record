package oneQuestionEveryDay.day0317;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 执行用时：16 ms, 在所有 Java 提交中击败了50.77%的用户
 * 内存消耗：41.5 MB, 在所有 Java 提交中击败了27.27%的用户
 */
class Solution1 {
    public String longestWord(String[] words) {
        Arrays.sort(words);

        Set<String> set = new HashSet<>();
        set.add("");
        int longest = 0;
        String res = "";
        for(int i = 0; i < words.length; i++){
            if(set.contains(words[i].substring(0, words[i].length() - 1))){
                set.add(words[i]);
                if(words[i].length() > longest){
                    longest = words[i].length();
                    res = words[i];
                }else if(words[i].length() == longest){
                    if(words[i].compareTo(res) < 0){
                        res = words[i];
                    }
                }
            }
        }

        return res;
    }
}

//答案还给出了一种字典树trie的做法 在数据结构中再作介绍
