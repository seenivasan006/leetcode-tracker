// Last updated: 10/07/2026, 08:55:40
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
17
18        ListNode dummy = new ListNode(0);
19        ListNode current = dummy;
20
21        int carry = 0;
22
23        while (l1 != null || l2 != null || carry != 0) {
24
25            int sum = carry;
26
27            if (l1 != null) {
28                sum += l1.val;
29                l1 = l1.next;
30            }
31
32            if (l2 != null) {
33                sum += l2.val;
34                l2 = l2.next;
35            }
36
37            carry = sum / 10;
38
39            current.next = new ListNode(sum % 10);
40            current = current.next;
41        }
42
43        return dummy.next;
44    }
45}