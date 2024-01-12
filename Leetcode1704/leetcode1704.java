class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int a = 0;
        int b = s.length() / 2;

        while (b < s.length()) {
            if (isVowel(s.charAt(b))) {
                count++;
            }
            if (isVowel(s.charAt(a))) {
                count--;
            }
            a++;
            b++;
        }

        return (count == 0);
    }

    public boolean isVowel(char c) {
        char e = Character.toUpperCase(c);
        switch (e) {
            case 'A':
                return true;
            case 'E':
                return true;
            case 'I':
                return true;
            case 'O':
                return true;
            case 'U':
                return true;
        }
        return false;
    }
}