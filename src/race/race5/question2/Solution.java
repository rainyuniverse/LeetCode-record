package race.race5.question2;

import java.util.Arrays;
import java.util.List;

public class Solution {
    int res = 0;
    boolean isBao = false;
    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        int[] visited = new int[cookbooks.length];
        for(int i = 0; i < cookbooks.length; i++){
            dfs(materials, cookbooks, attribute, limit, 0, i, 0, visited);
        }
        if(isBao == false){
            return -1;
        }else{
            return res;
        }
    }

    public void dfs(int[] materials, int[][] cookbooks, int[][] attribute, int limit, int curVal, int curIndex, int curBao, int[] visited){
        if(curIndex >= cookbooks.length){
            return;
        }
        if(visited[curIndex] == 0){
            dfs(materials, cookbooks, attribute, limit, curVal, curIndex + 1, curBao, visited);
            int[] curMaterials = cookbooks[curIndex];
            boolean flag = true;
            for(int i = 0; i < curMaterials.length; i++){
                if(curMaterials[i] > materials[i]){
                    flag = false;
                }
            }
            if(flag == true){
                for(int i = 0; i < curMaterials.length; i++){
                    materials[i] = materials[i] - curMaterials[i];
                }
                curVal = curVal + attribute[curIndex][0];
                curBao = curBao + attribute[curIndex][1];
                visited[curIndex] = 1;
            }

            dfs(materials, cookbooks, attribute, limit, curVal, curIndex + 1, curBao, visited);
            if(curBao >= limit && curVal > res){
                res = curVal;
                isBao = true;
            }
            if(flag == true){
                for(int i = 0; i < curMaterials.length; i++){
                    materials[i] = materials[i] + curMaterials[i];
                }
                curVal = curVal - attribute[curIndex][0];
                curBao = curBao - attribute[curIndex][1];
                visited[curIndex] = 0;
            }
        }

    }
}
