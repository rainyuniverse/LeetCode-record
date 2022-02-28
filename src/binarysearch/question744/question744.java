package binarysearch.question744;

public class question744 {
    public static void main(String[] args){
        char[] letters = new char[]{'c','f','j'};
        char target = 'a';
        Solution solution = new Solution();
//        System.out.println(solution.nextGreatestLetter(letters, target));

        Solution1 solution1 = new Solution1();
        System.out.println(solution1.nextGreatestLetter(letters, target));
    }

}
