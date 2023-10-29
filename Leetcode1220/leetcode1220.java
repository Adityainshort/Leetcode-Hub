import java.util.Arrays;

public class leetcode1220 {
    private static final int M = 1000000007;
    private static final int a = 0, e = 1, i = 2, o = 3, u = 4;
    private long[][] t;

    public int countVowelPermutation(int n) {
        t = new long[5][n + 1];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(t[i], -1);
        }

        long result = 0;
        result = (result + solve(a, n - 1)) % M;
        result = (result + solve(e, n - 1)) % M;
        result = (result + solve(i, n - 1)) % M;
        result = (result + solve(o, n - 1)) % M;
        result = (result + solve(u, n - 1)) % M;

        return (int) result;
    }

    
    private long solve(int ch, int n) {
        if (n == 0) {
            return 1;
        }

        if (t[ch][n] != -1) {
            return t[ch][n];
        }

        switch (ch) {
            case a :
                t[ch][n] = solve(e, n - 1) % M;
                break;
            case e :
                t[ch][n] = (solve(a, n - 1) + solve(i, n - 1)) % M;
                break;
            case i :
                t[ch][n] = (solve(a, n - 1) + solve(e, n - 1) + solve(o, n - 1) + solve(u, n - 1)) % M;
                break;
            case o :
                t[ch][n] = (solve(i, n - 1) + solve(u, n - 1)) % M;
                break;
            case u :
                t[ch][n] = solve(a, n - 1);
                break;
        
            default:
                break;
        }


        return t[ch][n];
    }

}