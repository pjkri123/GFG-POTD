class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        
        // Solution 1
        /*
        for(int i=0;i<arr.length-2;i++) {
            for(int j=i+1;j<arr.length-1;j++) {
                for(int k=j+1;k<arr.length;k++) {
                    if(arr[i]+arr[j]+arr[k]==target) return true;
                }
            }
        }
        return false;
        */
        
        // Solution 2
        /*
        for(int i=0;i<arr.length-2;i++) {
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++) {
                int num=target-arr[i]-arr[j];
                if(set.contains(num)) return true;
                set.add(arr[j]);
            }
        }
        return false;
        */
        
        // Solution 3
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++) {
            int l=i+1;
            int r=arr.length-1;
            int num=target-arr[i];
            while(l<r) {
                if(arr[l]+arr[r]==num) return true;
                else if(arr[l]+arr[r]<num) l++;
                else r--;
            }
        }
        return false;
    }
}
