class Solution {
    public int maxLength(List<String> arr) {
        int n = arr.size() ;
        String temp = "";
        return solve(0 , temp , n , arr);
    }
    public int solve(int i, String temp ,int n , List<String> arr ){
        if(i>=n){
            return temp.length() ;
        }

        int exclude = 0;
        int include = 0;

        if(check(arr.get(i),temp)){
            exclude = solve(i+1 ,temp ,n,arr);
        }
        else{
            exclude = solve(i+1 ,temp ,n,arr);
            include = solve(i+1 ,temp + arr.get(i) , n ,arr);
        }

        return Math.max(include,exclude) ;
    }

    public boolean check(String s1, String s2) {
        int[] arr = new int[26];
        for (char c : s1.toCharArray()) {
            int n = c - 'a';
            if (arr[n] == 1) {
                return true;
            } else {
                arr[n] = 1;
            }
        }
        for (char c : s2.toCharArray()) {
            int n = c - 'a';
            if (arr[n] == 1) {
                return true;
            } else {
                arr[n] = 1;
            }
        }
            return false;
        }

}