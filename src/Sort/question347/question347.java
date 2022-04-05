package Sort.question347;

public class question347 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        Solution solution = new Solution();
        int[] output = solution.topKFrequent(nums, 2);
        for(int i = 0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
}
