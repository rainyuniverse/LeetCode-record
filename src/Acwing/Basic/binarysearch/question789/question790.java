package Acwing.Basic.binarysearch.question789;

import java.util.Scanner;

public class question790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double left = -10000;
        double right = 10000;
        while(right - left > Math.pow(10, -8)){
            double mid = (left + right) / 2;
            if(mid * mid * mid  >= a){
                right = mid;
            }else{
                left = mid;
            }
        }
        System.out.println(String.format("%.6f",left));
    }
}
