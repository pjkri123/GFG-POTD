class Solution {
    public boolean isPalinSent(String s) {
        // code here
        StringBuilder str=new StringBuilder();
        s=s.toLowerCase();

        for(int i=0;i<s.length();i++) 
            if((s.charAt(i)>='a' && s.charAt(i)<='z') ||
            (s.charAt(i)>='0' && s.charAt(i)<='9'))
            str.append(s.charAt(i));
            
        String revStr=new StringBuilder(str).reverse().toString();

        return revStr.equals(str.toString());
    }
}
