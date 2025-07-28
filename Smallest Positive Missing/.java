class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<1) continue;
            else if(arr[i]!=(i+1)) return i+1;
        }
        
        return 1;
    }
}
