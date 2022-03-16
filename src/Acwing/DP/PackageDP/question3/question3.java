package Acwing.DP.PackageDP.question3;

import java.util.Scanner;

public class question3 {
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
            //这里从j = v[i]开始遍历 因为之前j - v[i] < 0不能进行更新
            //与01背包问题不同的是 这里采取正序遍历 因为更新需要使用到第i层循环（本层循环）的值 而01背包问题需要使用到第i - 1层循环（上层循环）的值
            for(int j = v[i]; j <= m; j++){
                dp[j] = Math.max(dp[j], dp[j - v[i]] + w[i]);
            }
        }

        System.out.println(dp[m]);
    }
}
