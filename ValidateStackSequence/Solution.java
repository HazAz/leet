class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int a = 0;
        for(int i = 0; i < pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && a < pushed.length && stack.peek() == popped[a]){
                stack.pop();
                a++;
            }
        }
        return (a == popped.length);
    }
}