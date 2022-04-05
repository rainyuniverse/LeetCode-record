package Acwing.Basic.quicksort.question785;

import java.util.Scanner;
// 快速排序 模板题
public class question785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void quicksort(int[] arr, int left, int right){
        if(left >= right){
            return;
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
            }while (arr[j] > x);

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }

        quicksort(arr, left, j);
        quicksort(arr, j + 1, right);
    }
}
