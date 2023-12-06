class Solution {
    public int totalMoney(int n) {
        int w = n / 7;
        int a = w * 28; 
        a += (7 * w * (w - 1)) / 2;

        if (n % 7 != 0) {
            int r = n % 7;
            int m = w + 1;
            for (int i = 0; i < r; ++i) {
                a += m;
                m += 1;
            }
        }

        return a;
    }
}