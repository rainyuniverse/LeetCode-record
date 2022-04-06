package Acwing.Basic.binarysearch.question789;

import java.util.Scanner;

public class question789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < q; i++){
            int num = sc.nextInt();
            int left = 0;
            int right = n - 1;
            while(left < right){
                int mid = (left + right) / 2;
                if(arr[mid] >= num){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }

            if(arr[right] != num){
                System.out.print(-1 + " ");
            }else{
                System.out.print(right + " ");
            }

            left = 0;
            right = n - 1;
            while(left < right){
                int mid = (left + right + 1) / 2;
                if(arr[mid] <= num){
                    left = mid;
                }else{
                    right = mid - 1;
                }
            }

            if(arr[right] != num){
                System.out.print(-1);
                System.out.println();
            }else{
                System.out.print(right);
                System.out.println();
            }
        }
    }
}
