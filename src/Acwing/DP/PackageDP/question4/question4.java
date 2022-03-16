package Acwing.DP.PackageDP.question4;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNum = scanner.nextInt(); //物品总数量
        int sumVol = scanner.nextInt(); //背包总容量

        int[] v = new int[sumNum]; //体积
        int[] w = new int[sumNum]; //价值
        int[] s = new int[sumNum]; //可选件数
        for(int i = 0; i < sumNum; i++){
            v[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
            s[i] = scanner.nextInt();
        }

        int[] dp = new int[sumVol + 1];
        for(int i = 0; i < sumNum; i++){
            //这里是逆序遍历的原因是 dp[j]是根据第i - 1层循环的值进行更新的
            for(int j = sumVol; j >= 0; j--){
                //注意限制条件j >= k * v[i] 而且k的数量必须小于可选件数
                for(int k = 0; j >= k * v[i] && k <= s[i]; k++){
                    dp[j] = Math.max(dp[j], dp[j - k * v[i]] + k * w[i]);
                }
            }
        }

        System.out.println(dp[sumVol]);
    }
}
