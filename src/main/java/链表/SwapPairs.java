package 链表;
//两两交换链表中的节点
public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0); //设置虚拟头结点
        dummyHead.next = head; //虚拟头节点指向 head,方便删除操作
        ListNode cur = dummyHead;
        ListNode tmp; //临时节点,保存两个节点后面的节点
        ListNode firstnode,secondnode;
        while (cur.next!= null && cur.next.next!= null) {
            tmp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode; //第一步,将cur的下一个节点指向secondnode
            secondnode.next = firstnode;//第二步,将secondnode的下一个节点指向firstnode
            firstnode.next = tmp;//第三步,将firstnode的下一个节点指向tmp
            cur = firstnode;
        }
        return dummyHead.next;
    }
}
