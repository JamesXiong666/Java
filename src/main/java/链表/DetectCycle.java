package 链表;
// 环形链表
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) { //快慢指针相遇
                ListNode index1 = fast; // index1指向相遇节点
                ListNode index2 = head; //index2指向头节点
                while (index1 != index2) { //两指针相遇点即为环形入口
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }

        }
        return null;
    }
}