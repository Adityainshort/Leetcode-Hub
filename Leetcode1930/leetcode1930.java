class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Set<Character> uniq = new HashSet<>();

        for (char ch : s.toCharArray()) {
            uniq.add(ch);
        }

        int result = 0;

        for (char letter : uniq) {

            int a = -1;
            int b = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == letter) {

                    if (a == -1) {
                        a = i;
                    }

                    b = i;

                }
            }

            Set<Character> set = new HashSet<>();
            for (int middle = a + 1; middle <= b - 1; middle++) {
                set.add(s.charAt(middle));
            }

            result += set.size();

        }

        return result;
    }
}
