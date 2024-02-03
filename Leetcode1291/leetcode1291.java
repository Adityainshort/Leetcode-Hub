import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 8; i++) {
            q.offer(i);
        }
        List<Integer> ans = new LinkedList<>();

        while(!q.isEmpty()){
            if(q.peek()>high){
                return ans ;
            }

            if(q.peek()>=low){
                int a = q.poll();
                ans.add(a);
                int b = solve(a,high);
                if(b!=0){
                    q.offer(b);
                }
                continue ;
            }

            int a = q.poll();
            int b = solve(a,high);
            if(b!=0){
                q.offer(b);
            }
        }
        return ans ;


    }

    public int solve(int a , int b){
        int ld = a%10 ;
        if(ld==9){
            return 0 ;
        }
        else{
            a =  a*10 + ld+1 ;
            return (a>b)?0:a;
        }

    }
}