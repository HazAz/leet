class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> sol = new ArrayList<String>();
        for(int i = 1; i < n+1; i++){
            if(i%3 == 0 && i%5==0) sol.add("FizzBuzz");
            else if(i%3 == 0) sol.add("Fizz");
            else if(i%5 == 0) sol.add("Buzz");
            else sol.add("" + i);
        }
        return sol;
    }
}