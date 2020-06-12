/**
 * 链表操作
 */
public class LinkedList {

    private class Node{

        private int data;
        private Node next;

        public Node(){
            this.data = 0;
            this.next = null;
        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private int index;

    public LinkedList(){
        this.head = null;
    }

    void insert(LinkedList linkedList, int data){
        // 创建新节点
        Node node = new Node(data);

        if(null == linkedList.head){
            linkedList.head = node;
        } else{
            // 从头结点开始遍历
            Node prev = linkedList.head;
            while (prev.next != null){
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
        }
        index++ ;
    }

    int length(){
        return this.index;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(linkedList, 1);
        linkedList.insert(linkedList, 2);
        linkedList.insert(linkedList, 3);
        linkedList.insert(linkedList, 4);

        printList(linkedList);
    }
}
