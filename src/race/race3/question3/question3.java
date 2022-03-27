package race.race3.question3;

public class question3 {
    public static void main(String[] args) {
        int[] queries = new int[]{1,90};
        int intLength = 3;
        Solution solution = new Solution();
        long[] res = solution.kthPalindrome(queries, intLength);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
