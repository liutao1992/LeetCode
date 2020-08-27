import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 *  示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {

    public List<Integer> preOrderTraversal(TreeNode root) {

        // 使用栈的方式来解决
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ret = new ArrayList<>();

        // 首先判断根节点是否存在,若存在则压栈,反之return
        if (root == null) return ret;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            ret.add(cur.val);
            // 判断右节点是否存在
            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }
        return ret;
    }

}
