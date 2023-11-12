package 链表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getIntersectionNodeTest {
    @Test
    public void testGetIntersectionNode() {
        // Create linked lists
        ListNode headA1 = new ListNode(1);
        ListNode nodeA1_2 = new ListNode(2);
        ListNode nodeA1_3 = new ListNode(3);
        ListNode nodeA1_4 = new ListNode(4);
        headA1.next = nodeA1_2;
        nodeA1_2.next = nodeA1_3;
        nodeA1_3.next = nodeA1_4;

        ListNode headB1 = new ListNode(5);
        ListNode nodeB1_6 = new ListNode(6);
        ListNode nodeB1_7 = new ListNode(7);
        ListNode nodeB1_8 = new ListNode(3);
        ListNode nodeB1_9 = new ListNode(4);
        headB1.next = nodeB1_6;
        nodeB1_6.next = nodeB1_7;
        nodeB1_7.next = nodeB1_8;
        nodeB1_8.next = nodeB1_9;

        ListNode headA2 = headA1;
        ListNode headB2 = headB1;

        // Create expected result
        ListNode expected = nodeB1_8;

        // Test getIntersectionNode
        ListNode result = new GetIntersectionNode().getIntersectionNode(headA2, headB2);

        // Compare expected and result
        assertEquals(expected.val, result.val);

}}