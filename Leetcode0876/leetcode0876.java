package Leetcode0876;


 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head ;
        int size = 1;
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }
        if(size==1){
            return head;
        }
        size=size/2 ;
        curr = head ;
        while(size>0){
            curr=curr.next;
            size--;
        }
        return curr ;
    }
}