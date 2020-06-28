/***
 * 用"排除法"写的二分查找算法
 *
 * 这里有一个比较细节的地方：在 Java 中，有一种特殊的语法，叫无符号右移 >>>。
 * 我在使用 Java 语言答题的时候，取中间数都写成 int mid = (left + right) >>> 1 和
 * int mid = (left + right + 1) >>> 1 ，这是因为无符号右移 >>> 在对操作数右移以后，
 * 不论这个数是正数还是负数，高位一律补 0。使用无符号右移的好处是：即使在 left + right 整形溢出以后，
 * 得到的结果依然正确。这一点是从 JDK 的源码中借鉴来的（Arrays.binarySearch() 方法）。
 *
 * 作者：liweiwei1419
 * 链接：https://leetcode-cn.com/problems/search-insert-position/solution/te-bie-hao-yong-de-er-fen-cha-fa-fa-mo-ban-python-/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution1 {

    public static int searchInsert(int[] nums, int target) {

        if (nums == null || nums.length == 0) return 0;

        int left = 0;
        int right = nums.length;

        while (left < right) {

            int mid = (left + right) >>> 1;

            // 小于 target 的元素不一定是解
            if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] == target)
                // 根据本题特殊性，看到等于 target 的元素，返回任意一个即可
                return mid;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1,3,5,6};
        System.out.println(Solution1.searchInsert(nums, 5));
    }
}
