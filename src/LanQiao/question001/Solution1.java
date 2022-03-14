package LanQiao.question001;

import java.util.*;
//暴力回溯
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        arr[0] = 0;
        for(int i = 1; i < n + 1; i++){
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        List<Integer> value = new ArrayList<>();
        value.add(0);
        backtracking(0, value, arr, set);

        System.out.println(set.size() - 1);

    }

    static void backtracking(int index, List<Integer> value, int[] arr, Set<Integer> set){
        if(index == arr.length){
            return;
        }
        int cur = arr[index];
        for(Integer i : value){
            set.add(i + cur);
            set.add(Math.abs(i - cur));
            set.add(i);
            List<Integer> list = new ArrayList<>();
            list.add(i + cur);
            list.add(Math.abs(i - cur));
            list.add(i);
            backtracking(index + 1, list, arr, set);
        }
    }
}
