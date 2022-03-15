package LanQiao.question001;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int n = scan.nextInt();
        int[] fama = new int[n];
        for (int i = 0; i < n; i++) {
            fama[i] = scan.nextInt();
        }
        //初始化set,表示一开始天平上没有砝码，重量为0
        set.add(0);
        for (int i = 0; i < n; i++) {
            //在没放入新的砝码前，将秤得的所有重量放入list集合中
            List<Integer> list = new ArrayList<>(set);
            for (int k : list) {
                //相加和相减取绝对值产生新的两个重量，并加重量放入set集合中
                //注意:如果新秤得的重量在原来的set集合存在，将不被放入set中
                set.add(k + fama[i]);
                set.add(Math.abs(k - fama[i]));
            }
        }
        //移除0元素
        set.remove((Object)0);
        //输出set集合大小，即秤得的重量数
        System.out.println(set.size());
    }
}
