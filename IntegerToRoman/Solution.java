class Solution {
    public String intToRoman(int num) {
        String sol = "";
        if(num==0) return sol;
        if(num % 10 == 1) sol += "I";
        else if(num % 10 == 2) sol += "II";
        else if(num % 10 == 3) sol += "III";
        else if(num % 10 == 4) sol += "IV";
        else if(num % 10 == 5) sol += "V";
        else if(num % 10 == 6) sol += "VI";
        else if(num % 10 == 7) sol += "VII";
        else if(num % 10 == 8) sol += "VIII";
        else if(num % 10 == 9) sol += "IX";
        
        num = num/10;
        if(num % 10 == 1) sol = "X" + sol;
        else if(num % 10 == 2) sol = "XX" + sol;
        else if(num % 10 == 3) sol = "XXX" + sol;
        else if(num % 10 == 4) sol = "XL" + sol;
        else if(num % 10 == 5) sol = "L" + sol;
        else if(num % 10 == 6) sol = "LX" + sol;
        else if(num % 10 == 7) sol = "LXX" + sol;
        else if(num % 10 == 8) sol = "LXXX" + sol;
        else if(num % 10 == 9) sol = "XC" + sol;
        
        num = num/10;
        if(num % 10 == 1) sol = "C" + sol;
        else if(num % 10 == 2) sol = "CC" + sol;
        else if(num % 10 == 3) sol = "CCC" + sol;
        else if(num % 10 == 4) sol = "CD" + sol;
        else if(num % 10 == 5) sol = "D" + sol;
        else if(num % 10 == 6) sol = "DC" + sol;
        else if(num % 10 == 7) sol = "DCC" + sol;
        else if(num % 10 == 8) sol = "DCCC" + sol;
        else if(num % 10 == 9) sol = "CM" + sol;
        
        num = num/10;
        if(num % 10 == 1) sol = "M" + sol;
        else if(num % 10 == 2) sol = "MM" + sol;
        else if(num % 10 == 3) sol = "MMM" + sol;
    
        return sol;

    }
}