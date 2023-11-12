package 链表;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumyhead = new ListNode(0);
        dumyhead.next = head;
        ListNode fast = dumyhead,slow = dumyhead;
        //快指针移动n+1步
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast!= null) {
            fast = fast.next;
            slow = slow.next;
        }
        //当 fast 指针移动到 null 时,slow 的位置就是待删除元素的前一个位置
        slow.next = slow.next.next;
        return dumyhead.next;
    }
}
