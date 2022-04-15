package Acwing.Basic.highprecision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question792 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 123456
        String b = sc.next();

        int[] arrA = new int[a.length()]; // 6 5 4 3 2 1
        int[] arrB = new int[b.length()];

        for(int i = a.length() - 1, count = 0; i >= 0; i--, count++){
            arrA[count] = a.charAt(i) - '0';
        }
        for(int i = b.length() - 1, count = 0; i >= 0; i--, count++){
            arrB[count] = b.charAt(i) - '0';
        }

        if(cmp(arrA, arrB)){
            List<Integer> res = sub(arrA, arrB);
            for(int i = res.size() - 1; i >= 0; i--){
                System.out.print(res.get(i));
            }
        }else{
            List<Integer> res = sub(arrB, arrA);
            System.out.print("-");
            for(int i = res.size() - 1; i >= 0; i--){
                System.out.print(res.get(i));
            }
        }
    }

    public static boolean cmp(int[] arrA, int[] arrB){
        if(arrA.length != arrB.length){
            return (arrA.length > arrB.length);
        }
        for(int i = arrA.length - 1; i >= 0; i--){
            if(arrA[i] != arrB[i]){
                return (arrA[i] > arrB[i]);
            }
        }
        return true;
    }

    public static List<Integer> sub(int[] arrA, int[] arrB){
        List<Integer> res = new ArrayList<>();
        int t = 0;
        for(int i = 0; i <= arrA.length - 1; i++){
            t = t + arrA[i];
            if(i < arrB.length){
                t = t - arrB[i];
            }
            res.add((t + 10) % 10);
            if(t < 0){
                t = -1;
            }else{
                t = 0;
            }
        }

        while(res.size() > 1 && res.get(res.size() - 1) == 0){
            res.remove(res.size() - 1);
        }

        return res;
    }
}
