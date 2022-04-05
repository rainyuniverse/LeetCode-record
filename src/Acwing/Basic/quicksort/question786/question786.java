package Acwing.Basic.quicksort.question786;

import java.util.Scanner;

public class question786 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(quicksort(arr, 0, n - 1, k));

    }

    public static int quicksort(int[] arr, int left, int right, int k){
        if(left >= right){
            return arr[left];
        }

        int x = arr[left];
        int i = left - 1;
        int j = right + 1;
        while(i < j){
            do{
                i++;
            }while(arr[i] < x);
            do{
                j--;
            }while(arr[j] > x);

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 左边区间长度
        int leftlength = j - left + 1;
        if(k <= leftlength){
            return quicksort(arr, left, j, k);
        }

        return quicksort(arr, j + 1, right, k - leftlength);
    }
}
