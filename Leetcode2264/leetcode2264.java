class Solution {
    public String largestGoodInteger(String num) {
        int a = -1;
        for (int i = 1; i < num.length() - 1; i++) {
            if (num.charAt(i - 1) == num.charAt(i + 1)) {
                if (num.charAt(i) == num.charAt(i - 1)) {
                    a = Math.max(a, Character.getNumericValue(num.charAt(i)));
                }
            }
        }
        String ans = (a == -1) ? "" : "" + a + a + a;
        return ans;
    }
}
