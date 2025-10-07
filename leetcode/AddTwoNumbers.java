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
    ListNode checkNext(ListNode node){
        if (node == null || node.next == null){
            return null;
        } else {
            return node.next;
        }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;

        sum = l1.val + l2.val;

        if (sum >= 10){ // calculate carry
            carry = 1;
            sum -= 10;
        } else { 
            carry = 0;
        }

        ListNode first = new ListNode(sum);
        ListNode ref = first;
        l1 = checkNext(l1);
        l2 = checkNext(l2);
        
        

        while (carry > 0 || l1 != null || l2 != null){
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) val1 = l1.val;
            if (l2 != null) val2 = l2.val;

            sum = val1 + val2 + carry;

            if (sum >= 10){ // calculate carry
            carry = 1;
            sum -= 10;
            } else { 
                carry = 0;
            }

            ref.next = new ListNode();
            ref = ref.next;
            ref.val = sum;

            l1 = checkNext(l1);
            l2 = checkNext(l2);
        }
        
        return first;
    }
}
