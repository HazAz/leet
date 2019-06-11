class Solution {
  public static void main(String[] args){
    
    ListNode x = new ListNode(5);
   // x.next = new ListNode(4);
   // x.next.next = new ListNode(3);
    
    ListNode y = new ListNode(5);
   // y.next = new ListNode(6);
    //y.next.next = new ListNode(4);
    //y.next.next.next = new ListNode(9);
    //y.next.next.next.next = new ListNode(9);
    //y.next.next.next.next.next = new ListNode(9);
    //y.next.next.next.next.next.next = new ListNode(9);
    //y.next.next.next.next.next.next.next = new ListNode(9);
    //y.next.next.next.next.next.next.next.next = new ListNode(9);
    //y.next.next.next.next.next.next.next.next.next = new ListNode(9);
    
    
    ListNode z = addTwoNumbers(x, y);
    
    System.out.println(z.val);
    while (z.next != null){
      z = z.next;
      System.out.println(z.val);
    }
  }
  
  
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return add(l1, l2, 0);
  }
  
  public static ListNode add(ListNode l1, ListNode l2, int carry){
    if(l1 == null && l2 == null){
      if(carry == 1){
        return new ListNode(1);       
      }
      return null;
    }
    int val = carry;
    if(l1 != null) val += l1.val;
    if(l2 != null) val += l2.val;
    
    
    ListNode result = new ListNode(val%10);
    
    ListNode rest = add(l1 == null ? null : l1.next, l2 == null ? null : l2.next, val >= 10 ? 1 : 0);
    result.next = rest;
    return result;
  }
  
}