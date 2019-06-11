class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if (hashset.contains(nums[i])) hashset.remove(nums[i]);
            else hashset.add(nums[i]);
        }
        for(int x: hashset) {
            return x;
        }
        return -1;
    }
}