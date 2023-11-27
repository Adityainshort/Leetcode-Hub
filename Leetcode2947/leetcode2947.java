class Solution {
    public int beautifulSubstrings(String s, int k) {
        if(s.compareTo("")==0){return 0;}
        int count=0;
        for(int i =0;i<s.length();i++){
            int v=0;
            int c=0;
            for(int j= i ;j<s.length();j++){
                char ch=s.charAt(j);
                if(isVowel(ch)){v++;}
                else {c++;}
                if(v==c && (v*c)%k==0){count++;}
            }
        }
        return count;
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){return true;}
        return false;
    }
}
