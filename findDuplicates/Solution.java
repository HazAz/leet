class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();
        List<Integer> res = new LinkedList<Integer>();
        
        for(int i=0; i < nums.length; i++){
            if(map.contains(nums[i])) res.add(nums[i]);
            else map.add(nums[i]);
        }
        return res;
    }
}