class Solution {
    public int countBalanced(String[] arr) {
        // code here
        
        //TLE
        /*
        int ans=0;
        for(int i=0;i<arr.length;i++) {
            String str="";
            for(int j=i;j<arr.length;j++) {
                str+=arr[j];
                int vol=0;
                int cons=0;
                for(int k=0;k<str.length();k++) {
                    if(str.charAt(k)=='a' 
                    || str.charAt(k)=='e' 
                    || str.charAt(k)=='i' 
                    || str.charAt(k)=='o' 
                    || str.charAt(k)=='u') 
                    vol++;
                    else cons++;
                }
                if(vol==cons) ans++;
            }
        }
        return ans;
        */
        
        int n=arr.length;
        int[] diff=new int[n+1];

        for(int i=0;i<n;i++) {
            int vol=0;
            int cons=0;
            for(int j=0;j<arr[i].length();j++) {
                if(arr[i].charAt(j)=='a' 
                    || arr[i].charAt(j)=='e' 
                    || arr[i].charAt(j)=='i' 
                    || arr[i].charAt(j)=='o' 
                    || arr[i].charAt(j)=='u')
                    vol++;
                    else cons++;
            }
            diff[i+1]=diff[i]+(vol-cons);
        }
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        
        for(int i=0;i<=n;i++) {
            if(hm.containsKey(diff[i])) {
                count+=hm.get(diff[i]);
                hm.put(diff[i],hm.get(diff[i])+1);
            }
            else hm.put(diff[i],1);
        }
        
        return count;  
    }
}
