package 链表;
//移除链表元素
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { this.val = x; }
    ListNode(int x, ListNode next) { this.val = x; this.next = next; }
}

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;

        //虚拟头结点
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur!= null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
