class Solution {
    public String customSortString(String S, String T) {
        String res = "";
        String res2 = ""; 
        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < T.length(); j++){
                if(T.charAt(j) == S.charAt(i)){
                    res2 += S.charAt(i);
                } 
                
            }
              
        }
        
        for(int i = 0; i < T.length(); i++){
            if(!S.contains("" + T.charAt(i))){
                res += T.charAt(i);
            }   
        }
        
        
        return res2 + res;
    }
}