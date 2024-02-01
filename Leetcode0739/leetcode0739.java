
public class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        Stack<Integer> st = new Stack<>();
        
        int[] ans = new int[n];
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && t[i] >= t[st.peek()]) {
                st.pop();
            }
            
            if (!st.isEmpty()) {
                ans[i] = st.peek() - i; 
            } else {
                ans[i] = 0;
            }
            
            st.push(i);
        }
        
        return ans;
    }
}
