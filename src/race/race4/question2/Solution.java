package race.race4.question2;

import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> sum = new HashSet<>();
        for(int i = 0; i < matches.length; i++){
            for(int j = 0; j < matches[0].length; j++){
                sum.add(matches[i][j]);
            }
        }

        Set<Integer> record = new HashSet<>();
        Set<Integer> onetime = new HashSet<>();
        for(int i = 0; i < matches.length; i++){
            if(!onetime.contains(matches[i][1]) && !record.contains(matches[i][1])){
                onetime.add(matches[i][1]);
            }else{
                onetime.remove(matches[i][1]);
                record.add(matches[i][1]);
            }
        }

        for(int i = 0; i < matches.length; i++){
            if(sum.contains(matches[i][1])){
                sum.remove(matches[i][1]);
            }
        }

        int[] arr1 = new int[sum.size()];
        int count = 0;
        for(Integer i: sum){
            arr1[count] = i;
            count++;
        }
        Arrays.sort(arr1);
        int[] arr2 = new int[onetime.size()];
        count = 0;
        for(Integer i: onetime){
            arr2[count] = i;
            count++;
        }
        Arrays.sort(arr2);

        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            list1.add(arr1[i]);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < arr2.length; i++){
            list2.add(arr2[i]);
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        return res;
    }
}
