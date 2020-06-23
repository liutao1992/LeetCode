package SearchInsertPosition;

public class Solution1 {

    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 0) return 0;

        int left = 0, right = nums.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;

            // 如果mid下标元素大于target, 则往左移动mid下标
            else if (nums[mid] < target) left = mid + 1;
            // 反之，则往右移动mid下标
            else
                right = mid - 1;
        }
        return left;
    }
}
