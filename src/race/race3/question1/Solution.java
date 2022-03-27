package race.race3.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(!set2.contains(nums1[i]) && !list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(!set1.contains(nums2[i]) && !list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        return res;
    }
}
