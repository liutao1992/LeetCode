import java.util.HashMap;
import java.util.Map;

/**
 *  求两数之和
 */
class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int ret = target - nums[i];
            if(map.containsKey(ret))
                return new int[] { map.get(ret), i };
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
