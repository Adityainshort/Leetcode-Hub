
public class Leetcode0021 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode() ;
        ListNode curr = ans ; // iterative noded
        
        
        while(list1!=null && list2!=null){
            if(list2.val<list1.val){
                
                curr.next = list2;
                list2=list2.next;
                
            }
            else{

                curr.next = list1;
                list1=list1.next;

            }
        }
        while(list1!=null ){ 
            
            curr.next = list1;
            list1=list1.next;
            
        }
        while(list2!=null ){ 
            
            curr.next = list2;
            list2 = list2.next;
            
        }
        return ans ;
        
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode() ;
        ListNode l2 = new ListNode() ;
        
        
        
    }
}
