/**
 * 使用递归求解, 但是递归存在着一个问题，如果数据大，会存在数据溢出。
 * 空间复杂度：O(n)，递归树的深度可以达到 n
 * 时间复杂度：O(2^n),树形递归的大小为 2^n2
 *
 */
public class Solution1 {

    public int climbStairs(int n) {
        return calcWays(n);
    }

    private int calcWays(int n) {
        // 当n = 0 或者n = 1时, 只有一种方法
        if(n == 0 || n == 1)
            return 1;
        return calcWays(n - 1) + calcWays(n - 2);
    }


    public static void main(String[] args) {

        System.out.println((new Solution1()).climbStairs(5));
    }
}
