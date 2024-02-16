class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] freq = new int[map.size()];
        int j=0;
        for(int i : map.values()){
            freq[j++]=i;
        }
        Arrays.sort(freq);
        j=0;

        for(int i : freq){
            if(k>=i){
                j++;
                k-=i;
            }else{
                break ;
            }
        }

        return freq.length - j ;
    }
}