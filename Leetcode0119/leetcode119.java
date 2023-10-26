package leetcode.Leetcode0119;

import java.util.ArrayList;
import java.util.List;

public class leetcode119 {
    public static List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList<>();
        long answer=1;
        row.add((int)answer);
        for (int i = 1; i <n; i++) {
            answer=answer*(n-i);
            answer=answer/i;
            row.add((int)answer);
        }
        return row;
        
    }
    public static void main(String[] args) {
        
        System.out.println(getRow(2));
    }
}
