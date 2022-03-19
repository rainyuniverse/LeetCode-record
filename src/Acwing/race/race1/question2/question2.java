package Acwing.race.race1.question2;

import java.util.Scanner;
//这个long实在是太坑了啊 用int一直不对 到结束之后看别人的代码才知道用long
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();
        long[] arrA = new long[n];
        for(int i = 0; i < n; i++){
            arrA[i] = sc.nextInt();
        }

        long sumA = 0;
        for(int i = 0; i < n; i++){
            sumA = sumA + arrA[i];
        }
        long[] res = new long[n];
        for(int i = 0; i < n; i++){
            long minVal = Math.max(1, s - (sumA - arrA[i]));
            long maxVal = Math.min(arrA[i], s - n + 1);
            res[i] = (minVal - 1) + (arrA[i] - maxVal);
        }

        for(int i = 0; i < n; i++){
            if(i == n - 1){
                System.out.print(res[i]);
            }else{
                System.out.print(res[i] + " ");
            }
        }
    }
}
