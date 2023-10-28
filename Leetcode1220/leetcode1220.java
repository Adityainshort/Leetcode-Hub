// import java.util.Arrays;

// /**
//  * leetcode1220
//  */
// public class leetcode1220 {
    
    
//     private static final int M = 1000000007;
//     private static final int a = 0, e = 1, i = 2, o = 3, u = 4;
//     private static long[][] t;

//     public static int countVowelPermutation(int n) {
//         t = new long[5][n + 1];
//         for (int i = 0; i < 5; i++) {
//             Arrays.fill(t[i], -1);
//         }

//         int ans = solve(n - 1, a, 0)
//                 + solve(n - 1, e, 0)
//                 + solve(n - 1, i, 0)
//                 + solve(n - 1, o, 0)
//                 + solve(n - 1, u, 0);

//         return ans;

//     }

//     public static int solve(int n, int c, int ans) {
//         if (n <= 0) {
//             return 1;
//         }

//         if (t[c][n] != -1) {
//             return (int) t[c][n];
//         }

//         switch (c) {
//             case 0:
//                 return ans += solve(n - 1, e, ans);
//             case 1:
//                 return ans += solve(n - 1, a, ans) + solve(n - 1, i, ans);
//             case 2:
//                 return ans += solve(n - 1, a, ans) + solve(n - 1, e, ans) + solve(n - 1, o, ans)
//                         + solve(n - 1, u, ans);
//             case 3:
//                 return ans += solve(n - 1, u, ans) + solve(n - 1, i, ans);
//             case 4:
//                 return ans += solve(n - 1, a, ans);
//             default:
//                 System.out.println("hello world :( ");
//         }

//         return (int) t[c][n];

//     }

//     public static void main(String[] args) {

//         System.out.println(countVowelPermutation(5));
//     }

// }


import java.util.Arrays;

public class Solution {
    private static final int M = 1000000007;
    private static final int a = 0, e = 1, i = 2, o = 3, u = 4;
    private static long[][] t;

    private static long solve(int ch, int n) {
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

        



        // if (ch == a) {
        //     t[ch][n] = solve(e, n - 1) % M;
        // } else if (ch == e) {
        //     t[ch][n] = (solve(a, n - 1) + solve(i, n - 1)) % M;
        // } else if (ch == i) {
        //     t[ch][n] = (solve(a, n - 1) + solve(e, n - 1) + solve(o, n - 1) + solve(u, n - 1)) % M;
        // } else if (ch == o) {
        //     t[ch][n] = (solve(i, n - 1) + solve(u, n - 1)) % M;
        // } else { // ch == u
        //     t[ch][n] = solve(a, n - 1);
        // }

        return t[ch][n];
    }

    public static int countVowelPermutation(int n) {
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
    public static void main(String[] args) {

        System.out.println(countVowelPermutation(10000));
    }
}