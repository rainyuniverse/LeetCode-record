package Acwing.race.race1.question1;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int c = 1; c <= n; c++){
            for(int b = 1; b <= c; b++){
                for(int a = 1; a <= b; a++){
                    if((a ^ b ^ c) == 0 && (a + b > c) && (a + c > b) && (b + c > a)){
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
