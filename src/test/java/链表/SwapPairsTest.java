package 链表;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapPairsTest {

    @Test
    public void testSwapPairs() {
        // Create the input linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Create the expected output linked list
        ListNode expectedHead = new ListNode(2);
        ListNode expectedNode2 = new ListNode(1);
        ListNode expectedNode3 = new ListNode(4);
        ListNode expectedNode4 = new ListNode(3);
        ListNode expectedNode5 = new ListNode(5);
        expectedHead.next = expectedNode2;
        expectedNode2.next = expectedNode3;
        expectedNode3.next = expectedNode4;
        expectedNode4.next = expectedNode5;

        SwapPairs swapPairs = new SwapPairs();
        ListNode result = swapPairs.swapPairs(head);

        // Compare the result with the expected output
        while (result != null && expectedHead != null) {
            assertEquals(expectedHead.val, result.val);
            result = result.next;
            expectedHead = expectedHead.next;
        }

        assertNull(result);
        assertNull(expectedHead);
    }


    }