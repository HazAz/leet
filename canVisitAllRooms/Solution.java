class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean haveKey[] = new boolean[rooms.size()];
        haveKey[0] = true;
        
        Stack<Integer> r = new Stack();
        r.push(0);
        
        while(!r.isEmpty()){
            int num = r.pop();
            for(int i:rooms.get(num)){
                if(!haveKey[i]){
                    haveKey[i] = true;
                    r.push(i);
                }
            }
        }
        for(int i=0; i < haveKey.length; i++){
            if (!haveKey[i]) return false;
        }
        return true;
    }
}