class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int n=arr.length;
        int count=0;
        int ans=0;
        if(n%2==0) count=n/2;
        else count=(n/2)+1;
        for(int i=0;i<n;i++) {
            if(arr[i]%k!=0) arr[i]=k-arr[i]%k;
            else arr[i]=0;
        }
        Arrays.sort(arr);
        for(int a:arr) {
            if(count>0) {
                if(a!=0) ans+=a;
            }
            count--;
        }
        return ans;
    }
}
