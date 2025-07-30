class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        
        // TLE
        /*
        int count=0;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum+=arr[j];
                if(sum==k) count++;
            }
        }
        return count;
        */
        
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0,1);
        
        int count=0;
        int sum=0;
        
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
            if(hm.containsKey(sum-k))
                count+=hm.get(sum-k);
            if(hm.containsKey(sum))
                hm.put(sum,hm.get(sum)+1);
            else hm.put(sum,1);
        }
        
        return count;
    }
}
