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
                // 上一次交换之后 不需要再判断交换的那个数 需要判断下一位的那个数
                i++;
            }while(arr[i] < x);
            do{
                j--;
            }while (arr[j] > x);

            // 可能出现左指针已经在右指针右边的情况，此时不需要交换
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
