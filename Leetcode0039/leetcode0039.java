package Leetcode0039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        
        return result;
    }
    
    private void getResult(List<List<Integer>> result, List<Integer> cur, int cd[], int target, int start){
    	if(target > 0){
    		for(int i = start; i < cd.length && target >= cd[i]; i++){
    			cur.add(cd[i]);
    			getResult(result, cur, cd, target - cd[i], i);
    			cur.remove(cur.size() - 1);
    		}
    	}
    	else if(target == 0 ){
    		result.add(new ArrayList<Integer>(cur));
    	}
    }
}