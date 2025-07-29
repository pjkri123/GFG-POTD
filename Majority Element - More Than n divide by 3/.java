class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++) {
            if(mp.containsKey(arr[i])) 
                mp.put(arr[i],mp.get(arr[i])+1);
            else mp.put(arr[i],1);
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> i: mp.entrySet()) {
            if(i.getValue()>Math.floor(arr.length/3)) 
                ans.add(i.getKey());
        }
        
        Collections.sort(ans);
        
        return ans;
    }
}
