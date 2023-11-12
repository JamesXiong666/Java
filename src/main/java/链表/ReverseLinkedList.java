package 链表;

public class ReverseLinkedList {
    public ListNode  reverseList(ListNode head) {
        if (head == null) return head;
        ListNode pre = null;
        ListNode cur = head;

        ListNode tmp = cur.next;
        while(cur != null){
            // 记录当前节点的下一个节点
            tmp = cur.next;
            // 反转
            cur.next = pre;
            // 更新pre和当前节点的位置
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
