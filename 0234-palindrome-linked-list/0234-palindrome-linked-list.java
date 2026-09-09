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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ar=new ArrayList<>();
        while(head!=null){
            ar.add(head.val);
            head=head.next;
        }
        int n=ar.size()-1;
        int i=0;
        while(i<n){
            if(ar.get(i)!=ar.get(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}