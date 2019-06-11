class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> sol = new Stack<Character>();
        for(int i =0; i < S.length(); i++){
            if(!sol.isEmpty() && S.charAt(i) == ')' && sol.peek() == '('){
                sol.pop();
            }
            else{
                sol.push(S.charAt(i));
            }
        }
        
        return sol.size();
    }
}