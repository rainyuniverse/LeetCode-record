package race.race2.question2;

public class question2 {
    public static void main(String[] args) {
        String directions = "SRRLRLRSRLRSSRRLSLRLLRSLSLLSSRRLSRSLSLRRS";
//        String directions = "LLRR";

        Solution solution = new Solution();
        System.out.print(solution.countCollisions(directions));
    }
}
