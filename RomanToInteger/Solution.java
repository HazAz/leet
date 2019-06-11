class Solution {
    public int romanToInt(String s) {
        int sol = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                if(i < s.length()-1 && s.charAt(i+1) == 'V'){
                    sol += 4;
                    i++;
                }
                else if(i < s.length()-1 && s.charAt(i+1) == 'X'){
                    sol += 9;
                    i++;
                } 
                else sol++;    
            }
            
            else if(s.charAt(i) == 'X'){
                if(i < s.length()-1 && s.charAt(i+1) == 'L'){
                    sol += 40;
                    i++;
                }
                else if(i < s.length()-1 && s.charAt(i+1) == 'C'){
                    sol += 90;
                    i++;
                } 
                else sol += 10;    
            }
            
            else if(s.charAt(i) == 'C'){
                if(i < s.length()-1 && s.charAt(i+1) == 'D'){
                    sol += 400;
                    i++;
                }
                else if(i < s.length()-1 && s.charAt(i+1) == 'M'){
                    sol += 900;
                    i++;
                } 
                else sol += 100;    
            }
            
            else if (s.charAt(i) == 'V') sol += 5;
            else if (s.charAt(i) == 'L') sol += 50;
            else if (s.charAt(i) == 'D') sol += 500;
            else if (s.charAt(i) == 'M') sol+= 1000;
            
        }
        return sol;
    }
}