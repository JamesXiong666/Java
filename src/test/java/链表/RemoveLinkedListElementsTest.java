package 链表;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {
    @Test
    public void testRemoveElements() {
        // 创建测试链表
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

        // 调用被测试方法
        ListNode result = removeLinkedListElements.removeElements(head, 2);

        //比较链表的两个值是否相同
        List<Integer> values1 = new ArrayList<>();
        List<Integer> values2 = new ArrayList<>();

        ListNode current1 = head;
        while (current1 != null) {
            values1.add(current1.val);
            current1 = current1.next;
        }

        ListNode current2 = expected;
        while (current2 != null) {
            values2.add(current2.val);
            current2 = current2.next;
        }
        // 验证结果
        Assert.assertEquals(values1, values2);
    }

}