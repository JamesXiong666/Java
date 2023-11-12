package 链表;
// 链表相交
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;
        //求链表 A 的长度
        while(curA != null){
            lenA++;
            curA= curA.next;
        }
        //求链表 B 的长度
        while(curB!= null){
            lenB++;
            curB = curB.next;
        }
        //重置 curA,curB 指向 headA,headB
        curA = headA;
        curB = headB;
        //让 curA 指向最长链表的头,lenA 为其长度
        if(lenB > lenA){
            //交换长度
            int tmpLen = lenA;
            lenA = lenB;
            lenB= tmpLen;
            //交换头结点
            ListNode tmpNode = curA;
            curA = curB;
            curB = tmpNode;
        }
        //求长度差
        int gap = lenA - lenB;
        //让 curA 和 curB 末尾对齐
        while(gap--> 0){
            curA = curA.next;
        }
        //遍历 curA 和 curB,遇到相同直接返回
        while(curA!= null && curB!= null){
            if(curA.val != curB.val){
                curA = curA.next;
                curB = curB.next;
            }else return curA;

        }
        return null;
    }
}
