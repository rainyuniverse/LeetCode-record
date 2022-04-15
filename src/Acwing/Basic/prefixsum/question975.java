package Acwing.Basic.prefixsum;

import java.util.Scanner;

public class question975 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] s = new int[n + 1];
        for(int i = 1; i <= n; i++){
            s[i] = s[i - 1] + arr[i - 1];
        }

        for(int i = 0; i < m; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(s[r] - s[l - 1]);
        }
    }
}
