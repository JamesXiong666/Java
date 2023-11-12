package 链表;

public class DesignLinkedList {
    //size 存储链表元素的个数
    int size;
    //虚拟头结点
    ListNode head;

    //初始化链表
    public void MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    //获取第 index 个节点的数值,注意 index 一定是从 0 开始的,第 0 个节点就是头结点
    public int get(int index) {
        //如果 index 非法,返回-1
        if (index < 0 || index >= size) return -1;
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    //在链表的最后面插入一个节点,等价于在链表尾部添加一个节点

    //在第 index 个节点之前插入一个新结点,例如 index 为 0,那么新插入的节点为链表的新头结点
    //如果 index 等于链表的长度,则说明新插入的节点是链表的尾节点
    //如果 index 大于链表的长度,则返回空
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) return;
        //找到要插入节点的前驱
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pre.next;
        pre.next = toAdd;
        size++;
    }

    //在链表的最后插入一个节点
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    //在链表的最前面插入一个节点
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    //删除第 index 个节点
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
        }

        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }





}
