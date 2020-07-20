public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }


    public static String print(ListNode L) {
        StringBuilder sb = new StringBuilder();
        while (L != null) {
            sb.append(L.val);
            L = L.next;
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}