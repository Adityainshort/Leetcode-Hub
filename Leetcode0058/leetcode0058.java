class Solution {
    public int lengthOfLastWord(String st) {
        if(st.length()==1)
        {
            return 1;
        }
        int ans=0;
        String s=st.trim();
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                ans=0;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}