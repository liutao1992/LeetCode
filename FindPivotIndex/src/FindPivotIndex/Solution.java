package FindPivotIndex;

public class Solution {

//    public static int pivotIndex(int[] nums) {
//        if (nums == null || nums.length == 0)
//            return -1;
//
//        int sum = 0, leftSum = 0;
//
//        for (int num : nums) sum += num;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (leftSum == sum - leftSum - nums[i]) return i;
//            leftSum += nums[i];
//        }
//        return -1;
//    }

    public static int pivotIndex(int[] nums) {
        int length = nums.length;
        int sum = 0, leftSum = 0;

        // 获取数组元素总和
        for (int num: nums) sum += num;

        // 遍历自变量
        for (int i = 0; i < length; i++){
            if (leftSum*2 == sum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};

        System.out.println(Solution.pivotIndex(nums));
    }
}
