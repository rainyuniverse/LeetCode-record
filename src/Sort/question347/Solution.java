package Sort.question347;

import java.util.*;

/**
 * 执行用时：261 ms, 在所有 Java 提交中击败了5.29%的用户
 * 内存消耗：44 MB, 在所有 Java 提交中击败了24.87%的用户
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 记录出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        // 再用一个数组记录 方便快排
        int[] arr = new int[map.size()];
        int count = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            arr[count] = entry.getValue();
            count++;
        }

        quicksort(arr, 0, arr.length - 1, k);
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            for(int j = 0; j <= k - 1; j++){
                int target = arr[j];
                if(target == entry.getValue() && !res.contains(entry.getKey())){
                    res.add(entry.getKey());
                }
            }
        }

        int[] output = new int[res.size()];
        count = 0;
        for(Integer i: res){
            output[count] = i;
            count++;
        }
        return output;
    }

    public void quicksort(int[] arr, int left, int right, int k){
        if(left >= right){
            return;
        }

        int x = arr[left];
        int i = left - 1;
        int j = right + 1;
        while(i < j){
            do i++; while(arr[i] > x);
            do j--; while(arr[j] < x);

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int leftLength = j - left + 1;
        if(k <= leftLength){
            quicksort(arr, left, j, k);
        }else{
            quicksort(arr, j + 1, right, k - leftLength);
        }
    }
}
