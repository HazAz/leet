class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        
        for(int i = 0; i < T.length-1; i++){
            for(int j = i+1; j < T.length; j++){
                if(j == T.length-1) days[i] = 0;
                if(T[i] < T[j]){
                    days[i] = j - i;
                    break;
                }
            }
        }
        return days;
    }
}