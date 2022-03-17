package oneQuestionEveryDay.day0317;

public class day0317 {
    public static void main(String[] args) {
        String[] words = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        Solution solution = new Solution();

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.longestWord(words));

        System.out.println("word".substring(0,0).equals(""));
    }
}
