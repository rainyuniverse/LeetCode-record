package race.first.question2;
//超时
class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int res = 0;
        int[] already = new int[dig.length];
        for(int i = 0; i < artifacts.length; i++){
            int lefton = artifacts[i][0];
            int righton = artifacts[i][1];
            int leftdown = artifacts[i][2];
            int rightdown = artifacts[i][3];

            int visited = (leftdown - lefton + 1)*(rightdown - righton + 1);

            int count = 0;

            for(int j = 0; j < dig.length; j++){
                if(already[j] == 1){
                    continue;
                }
                if(count == visited){
                    break;
                }
                for(int a = lefton; a <= leftdown; a++){
                    for(int b = righton; b <= rightdown; b++){
                        if(dig[j][0] == a && dig[j][1] == b){
                            count++;
                            already[j] = 1;
                        }
                    }
                }
            }

            if(count == visited){
                res++;
            }
        }
        return res;
    }
}
