class Solution {
    public int maxScore(String s) {
        int z = 0, o = 0, max = Integer.MIN_VALUE;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i) == '0') {
            z++;
        } 
        else {
            o++;
        }

		if(i != s.length()-1) {
            max = Math.max(z - o, max);
        }
	}
	return max + o;
    }
}