/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {

    // 方法一：暴力破解
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 首次获取链表的长度
        int size = getSize(head);
        size -= n;
        ListNode prev = head;
        while (size > 0) {
            prev = prev.next;
            size--;
        }
        // 获取到要删除的节点
        ListNode delNode = prev.next;
        // 将当前节点指向即将要删除的节点所指向的的下一个节点
        prev.next = delNode.next;
        delNode = null;
        return head;
    }

    private int getSize(ListNode head) {
        int size = 0;
        ListNode prev = head;
        while (prev != null) {
            prev = prev.next;
            size ++;
        }
        return size;
    }

    private ListNode remove(ListNode head, int delPosition) {

        if (delPosition <= 0) return head;

        ListNode prev = head;
        int i = 1;
        while (i < delPosition) {
            prev = prev.next;
            i++;
        }
        // 获取到要删除的节点
        ListNode delNode = prev.next;
        // 将当前节点指向即将要删除的节点所指向的的下一个节点
        prev.next = delNode.next;
        delNode = null;
        return head;
    }


    public static void add(ListNode head, int val) {
        // 如果头结点指向空,则创建头节点
        // 反之则添加节点
        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
        }else {
            ListNode prev = head;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = node;
        }
    }

    public static void print(ListNode head) {
        ListNode prev = head;
        while (prev != null) {
            System.out.println(prev.val);
            prev = prev.next;
        }
    }




    public static void main(String[] args) {

        ListNode dummyHead = new ListNode(0);

        Solution instance = new Solution();
        Solution.add(dummyHead,-3);
        Solution.add(dummyHead,-5);
        Solution.add(dummyHead,-99);

        Solution.print(dummyHead.next);

        System.out.println("处理后的元素。。。。。");
        // Solution.print(headNode.next);


    }
}
