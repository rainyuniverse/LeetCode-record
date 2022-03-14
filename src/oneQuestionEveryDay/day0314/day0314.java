package oneQuestionEveryDay.day0314;

public class day0314 {
    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = new String[]{"KFC", "Shogun", "Burger King"};
        Solution solution = new Solution();

        Solution1 solution1 = new Solution1();
        String[] output = solution1.findRestaurant(list1, list2);
        for(int i = 0; i < output.length; i++){
            System.out.print(output[i]);
        }
    }
}
