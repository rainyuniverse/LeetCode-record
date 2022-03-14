package oneQuestionEveryDay.day0314;

import java.util.ArrayList;
import java.util.List;
//直接暴力
/**
 * 执行用时：42 ms, 在所有 Java 提交中击败了35.32%的用户
 * 内存消耗：41.8 MB, 在所有 Java 提交中击败了34.22%的用户
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int flag = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < list1.length + list2.length - 1; i++){
            for(int j = 0; j <= i && j < list1.length; j++){
                int m = i - j;
                if(m >= list2.length){
                    continue;
                }
                if(list1[j].equals(list2[m])){
                    flag = 1;
                    list.add(list1[j]);
                }
            }
            if(flag == 1){
                break;
            }
        }

        String[] res = new String[list.size()];
        int count = 0;
        for(String s: list){
            res[count] = s;
            count++;
        }
        return res;
    }
}
