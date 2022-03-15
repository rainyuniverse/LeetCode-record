package LanQiao.question002;

import java.util.*;

//通过50%的测试用例
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        for(int i = 1; i < n; i++){
            arr[i] = scanner.nextInt();
        }


        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            map.put(i + 1, arr[i]);
            set.add(arr[i]);
        }
        int len = set.size();
        set.clear();
        int[] dp = new int[len];
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(map.get(j + 1) == i){
                    sum = sum + 1;
                }
            }
            dp[i] = sum + dp[map.get(i)];
        }

        int res = Integer.MIN_VALUE;
        for(int i = 1; i < dp.length; i++){
            if(dp[i] > res){
                res = dp[i];
            }
        }
        System.out.println(res);
    }
}
