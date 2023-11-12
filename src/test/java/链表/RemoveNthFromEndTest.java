package 链表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {
    @Test
    void testRemoveNthFromEnd() {
        // 按照测试用例1的输入构造链表
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        ListNode result = removeNthFromEnd.removeNthFromEnd(node1, 2);

        // 验证删除后的链表与预期输出是否一致
        assertSame(node1, result);
        assertSame(node2, result.next);
        assertSame(node3, result.next.next);
        assertSame(node5, result.next.next.next);

}}