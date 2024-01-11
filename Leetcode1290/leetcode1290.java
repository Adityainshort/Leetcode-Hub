/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head.next==null){
            return head.val ;
        }

        StringBuilder str = new StringBuilder();
        while(head!=null){
            int a = head.val;
            head = head.next;
            str.append(a);
        }
        int ans = 0;
        for(int i = str.length()-1;i>=0; i--){
            int e = Character.getNumericValue(str.charAt(i));
            int j = str.length()-1-i;
            ans+= Math.pow(2,j)*e;
        }
        return ans ;
    }
}