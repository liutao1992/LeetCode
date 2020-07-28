/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *  
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//        ListNode preHead = new ListNode(-1);
//
//        ListNode prev = preHead;
//
//        while (l1.next != null && l2.next != null) {
//            if (l1.val < l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            }
//            else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//        prev.next = l1 == null ? l2 : l1;
//        return preHead.next;
//    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 创建头结点
        ListNode preHead = new ListNode(-1);

        // 将头结点赋值给prev, 其目的是保留头结点, 在完成新的链表后返回头结点
        ListNode prev = preHead;

        // 这里判断要注意,是判断当前结点是否为null
        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return preHead.next;
    }



}
