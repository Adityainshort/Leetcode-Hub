class Solution {
    public int maximum69Number (int num) {
        String a = Integer.toString(num);
         char[] b = a.toCharArray();

    for (int i = 0; i < b.length; i++) {
        if (b[i] == '6') {
            b[i] = '9';
            return Integer.parseInt(String.valueOf(b));
        }
    }
        return num ;
    }
}