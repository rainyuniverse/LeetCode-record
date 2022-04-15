package Acwing.Basic.highprecision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //123456
        String b = sc.next();

        int[] arrA = new int[a.length()]; //6 5 4 3 2 1
        int[] arrB = new int[b.length()];
        for(int i = a.length() - 1, count = 0; i >= 0; i--, count++){
            arrA[count] = a.charAt(i) - '0';
        }
        for(int i = b.length() - 1, count = 0; i >= 0; i--, count++){
            arrB[count] = b.charAt(i) - '0';
        }

        List<Integer> res = add(arrA, arrB);
        for(int i = res.size() - 1; i >= 0; i--){
            System.out.print(res.get(i));
        }
    }

    public static List<Integer> add(int[] arrA, int[] arrB){
        List<Integer> res = new ArrayList<>();
        int t = 0;
        for(int i = 0; i < arrA.length || i < arrB.length; i++){
            if(i < arrA.length){
                t = t + arrA[i];
            }
            if(i < arrB.length){
                t = t + arrB[i];
            }
            res.add(t % 10);
            t = t / 10;
        }
        if(t == 1){
            res.add(t);
        }
        return res;
    }
}
