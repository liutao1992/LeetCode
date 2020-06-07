public class moveZeroes2 {

    public static void moveZero(int[] nums) {
        if (nums == null)
            return;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            // 如果当前元素!=0, 就把其交换到左边，等于0则交换到右边
            if(0 != nums[i]){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
