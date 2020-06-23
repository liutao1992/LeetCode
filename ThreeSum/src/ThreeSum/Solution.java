package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) return result;
        // 首先进行排序, 从小到大, 排序后的数组：[-4, -1, -1, 0, 1, 2]
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 因为经过了排序,所以一旦nums[i] > 0,
            // 则意味着后面的三数相加必然大于0, 因此返回即可
            if (nums[i] > 0) return result;
            // 排除这种情况 [-4, -1, -1, 0, 1, 2], 否则则会出现这种情况：
            // [[-1, -1, 2], [-1, 0, 1], [-1, 0, 1]]
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];
            int L = i + 1;            // 左指针
            int R = nums.length - 1;  // 右指针

            while (L < R){
                if (nums[R] + nums[L] == target) {
                    List<Integer> curr = new ArrayList<>();

                    curr.add(nums[i]);
                    curr.add(nums[L]);
                    curr.add(nums[R]);
                    result.add(curr);
                    L++; R--;
                    // 判断nums左右是否重复, 若重复则跳过, 主要针对这样的情况[0, 0, 0, 0]
                    while (L < nums.length && nums[L] == nums[L - 1]) L ++;
                    while (R > L && nums[R] == nums[R + 1]) R --;
                }
                // 若和大于0，说明nums[R] 太大，R 左移
                else if (nums[L] + nums[R] > target) R --;
                // 若和小于0，说明nums[L] 太小，L 右移
                else L++;
            }
        }
        return result;
    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        // 首先进行数组判空
//        if (nums == null || nums.length == 0) return result;
//
//        // 其次进行数组排序,从小到大
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//
//            // 若nums[i]大于0，则返回result结果。因为后面相加的结果不可能为0
//            if (nums[i] > 0) return result;
//
//            if (i > 1 && nums[i] == nums[i - 1]) continue;
//
//            int L = i + 1;
//            int R = nums.length - 1;
//
//            while (L < R) {
//                int sum = nums[L] + nums[R] + nums[i];
//
//                if (sum == 0) {
//                    List<Integer> cur = new ArrayList<>();
//                    cur.add(nums[i]);
//                    cur.add(nums[L]);
//                    cur.add(nums[R]);
//                    result.add(cur);
//                    L++;
//                    R--;
//
//                    // 判重 主要是针对这样的情况[0,0,0,0]
//                    while (L < nums.length && nums[L] == nums[L - 1]) L++;
//                    while (R > L && nums[R] == nums[R + 1]) R--;
//                } else if (sum > 0) R--;
//                else L++;
//            }
//
//        }
//        return result;
//    }

    public static void main(String[] args) {
        System.out.println(Solution.threeSum(new int[]{0, 0, 0, 0}));
    }
}


