// Last updated: 20/07/2026, 10:05:32
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode prev = dummy;
6
7        while (head != null) {
8            if (head.next != null && head.val == head.next.val) {
9                while (head.next != null && head.val == head.next.val)
10                    head = head.next;
11                prev.next = head.next;
12            } else {
13                prev = prev.next;
14            }
15            head = head.next;
16        }
17
18        return dummy.next;
19    }
20}