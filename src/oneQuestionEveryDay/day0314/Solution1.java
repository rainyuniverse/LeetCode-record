package oneQuestionEveryDay.day0314;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//哈希表

/**
 * 执行用时：7 ms , 在所有 Java 提交中击败了87.25%的用户
 * 内存消耗：42.1 MB, 在所有 Java 提交中击败了17.80%的用户
 */
class Solution1 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        int minindex = Integer.MAX_VALUE;
        List<String> strlist = new ArrayList<String>();
        for(int i = 0; i < list2.length; i++){
            if(map.get(list2[i]) != null){
                int cur = map.get(list2[i]);
                if(cur + i < minindex){
                    strlist.clear();
                    minindex = cur + i;
                    strlist.add(list2[i]);
                }else if(cur + i == minindex){
                    strlist.add(list2[i]);
                }
            }
        }

        //arraylist.toArray(T[] arr)
        //T [] arr（可选参数）- 用于存储数组元素的数组
        return strlist.toArray(new String[strlist.size()]);
    }
}
