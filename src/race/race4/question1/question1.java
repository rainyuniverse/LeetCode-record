package race.race4.question1;

public class question1 {
    public static void main(String[] args) {
        String current = "11:00";
        String correct = "11:01";
        Solution solution = new Solution();
        System.out.print(solution.convertTime(current, correct));
    }
}
