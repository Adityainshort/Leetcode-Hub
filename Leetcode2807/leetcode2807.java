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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null){
            return head;
        }
        solve(head);
        return head ;
    }

    public void solve(ListNode node){
        if(node==null || node.next ==null){
            return;
        }
        int a = node.val ;
        int b = node.next.val ;
        ListNode newnode = new ListNode(calc(a,b) , node.next );
        node.next = newnode ;
        solve(node.next.next);
    }
    public int calc(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}