package 链表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    @Test
    public void testReverseList() {
        // 创建链表
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 断言链表反转结果是否正确
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reversedHead = reverseLinkedList.reverseList(head);
        assertEquals(4, reversedHead.val);
        assertEquals(3, reversedHead.next.val);
        assertEquals(2, reversedHead.next.next.val);
        assertEquals(1, reversedHead.next.next.next.val);
    }

}