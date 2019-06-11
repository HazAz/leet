class Solution {
    
    public int countSubstrings(String s) {
        int sol = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String c = s.substring(i, j+1);
                sol = palindrome(c, sol);
            }
        }
        return sol;
    }
    
    
    public static int palindrome(String s, int sol){
        if (s.equals(null) || s.length() == 0) return sol;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length/2; i++){
            if (c[i] != c[c.length- i-1]) return sol;
        }
        return sol+1;
    }
}