

import java.util.ArrayList;
import java.util.List;


public class leetcode1441 {
        public List<String> buildArray(int[] target, int n) {
            List<String> ans = new ArrayList<>();
            int j=0;
            for(int i = 1 ; i<= n; i++){
                if(j<target.length&&i==target[j]){
                    j++;
                    ans.add("Push");
                    if(j==target.length){
                        break;
                    }
                }
                else{
                    ans.add("Push");
                    ans.add("Pop");
                }
            }
            return ans;
        }
    
}
