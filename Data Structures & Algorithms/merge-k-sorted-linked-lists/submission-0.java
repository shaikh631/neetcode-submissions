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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null ; 
        ListNode temp = null ; 

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a , b) -> (a.val - b.val));
        for(ListNode node :lists){
            if(node != null){
                pq.add(node);
            }
        }
        while(!pq.isEmpty()){
           ListNode node = pq.poll(); 
        if(temp==null){
            temp = node;
            head = temp;
        }
        else{
            temp.next = node;
            temp = temp.next;
        }
        if(node.next!=null){
            pq.add(node.next);
        }
      }
      return head;
        }
    }
