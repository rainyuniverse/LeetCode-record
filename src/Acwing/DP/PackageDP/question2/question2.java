package Acwing.DP.PackageDP.question2;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //物品总数量
        int m = scanner.nextInt(); //背包总容量

        int[] v = new int[n]; //体积
        int[] w = new int[n]; //价值
        for(int i = 0; i < n; i++){
            v[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
        }
        //因为没有规定必须要占满背包 所以初始化dp数组就全为0 这里是默认
        int[] dp = new int[m + 1];
        //从第一个物品开始遍历到第n个物品
        for(int i = 0; i < n; i++){
            //这里规定j >= v[i] 就不用再多加判断条件使j - v[i] > 0
            for(int j = m; j >= v[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - v[i]] + w[i]);
            }
        }

        System.out.println(dp[m]);
    }
}
