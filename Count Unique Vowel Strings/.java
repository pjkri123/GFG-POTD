class Solution {
    public int vowelCount(String s) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            
            if(s.charAt(i)=='a' || s.charAt(i)=='A' ||
            s.charAt(i)=='e' || s.charAt(i)=='E' ||
            s.charAt(i)=='i' || s.charAt(i)=='I' ||
            s.charAt(i)=='o' || s.charAt(i)=='O' ||
            s.charAt(i)=='u' || s.charAt(i)=='U') {
                
                if(hm.containsKey(s.charAt(i))) 
                    hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                    
                else hm.put(s.charAt(i),1);
            }
        }

        int ans=1;
        for(Map.Entry<Character,Integer> m:hm.entrySet()) ans*=m.getValue();
        
        if(hm.size()==0) return 0;
        
        return ans*factorial(hm.size());
        
    }
    private int factorial(int num) {
        int fact=1;
        while(num>0) {
            fact*=num;
            num-=1;
        }
        return fact;
    }
}
