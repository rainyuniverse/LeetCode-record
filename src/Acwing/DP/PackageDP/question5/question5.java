package Acwing.DP.PackageDP.question5;

import java.util.Scanner;

public class question5 {
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

        //计算数组长度
        int sumCount = 0;
        for(int i = 0; i < sumNum; i++){
            int count = 0;
            int tempSum = s[i];
            int cur = 1;
            while(cur <= tempSum){
                tempSum = tempSum - cur;
                cur = cur*2;
                count++;
            }
            if(tempSum > 0){
                count++;
            }
            sumCount = count + sumCount;
        }

        //变换数组 转为01背包问题
        int[] transV = new int[sumCount];
        int[] transW = new int[sumCount];
        int index = 0;
        for(int i = 0; i < sumNum; i++){
            int tempSum = s[i];
            int cur = 1;
            while(cur <= tempSum){
                tempSum = tempSum - cur;
                transV[index] = v[i] * cur;
                transW[index] = w[i] * cur;
                index++;
                cur = cur * 2;
            }
            if(tempSum > 0){
                transV[index] = v[i] * tempSum;
                transW[index] = w[i] * tempSum;
                index++;
            }
        }

        int[] dp = new int[sumVol + 1];
        //按照01背包解题
        for(int i = 0; i < sumCount; i++){
            for(int j = sumVol; j >= transV[i]; j--){
                dp[j] = Math.max(dp[j], dp[j - transV[i]] + transW[i]);
            }
        }

        System.out.println(dp[sumVol]);
    }
}
