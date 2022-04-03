package race.race4.question1;

class Solution {
    public int convertTime(String current, String correct) {
        String[] arr1 = current.split(":");
        String[] arr2 = correct.split(":");
        int time1 = Integer.parseInt(arr1[0]) * 60 + Integer.parseInt(arr1[1]);
        int time2 = Integer.parseInt(arr2[0]) * 60 + Integer.parseInt(arr2[1]);
        int res = 0;
        while(time1 < time2){
            if(time2 - time1 >= 60){
                time2 = time2 - 60;
                res++;
                continue;
            }
            if(time2 - time1 >= 15){
                time2 = time2 - 15;
                res++;
                continue;
            }
            if(time2 - time1 >= 5){
                time2 = time2 - 5;
                res++;
                continue;
            }
            if(time2 - time1 >= 1){
                time2 = time2 - 1;
                res++;
                continue;
            }
        }
        return res;
    }
}
