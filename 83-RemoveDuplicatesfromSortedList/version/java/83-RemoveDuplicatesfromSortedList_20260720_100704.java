// Last updated: 20/07/2026, 10:07:04
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode beforeHead = new ListNode(0);
4        ListNode afterHead = new ListNode(0);
5
6        ListNode before = beforeHead;
7        ListNode after = afterHead;
8
9        while (head != null) {
10            if (head.val < x) {
11                before.next = head;
12                before = before.next;
13            } else {
14                after.next = head;
15                after = after.next;
16            }
17            head = head.next;
18        }
19
20        after.next = null;
21        before.next = afterHead.next;
22
23        return beforeHead.next;
24    }
25}