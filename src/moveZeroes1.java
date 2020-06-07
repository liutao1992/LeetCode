import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 说明:
 * 1. 必须在原数组上操作，不能拷贝额外的数组。
 * 2. 尽量减少操作次数。
 * <p>
 * i++ 与 ++i 的主要区别有两个：
 * 1、 i++ 返回原来的值，++i 返回加1后的值。
 * 2、 i++ 不能作为左值，而++i 可以。
 */

public class moveZeroes1 {

    public static void moveZero(int[] nums) {
        if(nums == null)
            return;
        // 首先获取当前数组的长度
        int size = nums.length;
        // 用j下标来记录非0元素
        int j = 0;
        for (int i = 0; i <= size - 1; i++){
            // 遍历数组元素，若果当前数组元素 != 0,
            // 则将该元素赋值给下标j的元素
            if (0 != nums[i])
                nums[j++] = nums[i];
        }
        // 然后将剩余的元素赋值为0
        for (int i = j; i < size; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 2, 12};

        moveZero(nums);

        for (int num:nums) {
            System.out.print(num + ",");
        }
    }
}
