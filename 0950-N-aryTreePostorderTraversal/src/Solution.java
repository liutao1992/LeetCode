import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 *
 *
 *
 *
 *
 *
 * 返回其后序遍历: [5,6,3,2,4,1].
 *
 *
 */
public class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {

        postorderN(root);
        return list;
    }

    private void postorderN(Node node) {

        if (node == null)
            return;

        for (int i = 0; i < node.children.size(); i++) {
            Node subNode = node.children.get(i);
            postorderN(subNode);
        }
        list.add(node.val);
    }

    public static void main(String[] args) {

    }


}
