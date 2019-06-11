/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        while(node!= null){
            list.add(node.val);
            node = node.next;
        }
        
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i) < list.get(j)){
                    res[i] = list.get(j);
                    break;
                }
            }
        }
        return res;
        
    }
}