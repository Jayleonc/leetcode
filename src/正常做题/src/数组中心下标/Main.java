package 正常做题.src.数组中心下标;

import java.util.Arrays;

/**
 * @author : Jayleonc
 * @date : 2021-12-09 17:54
 */
public class Main {
    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (total - (sum * 2) == nums[i]) {
                return i;
            } else {
                sum = sum + nums[i];
            }
        }
        return -1;
    }

    /**
     * 输入：nums = [1, 7, 3, 6, 5, 6] 输出：3
     * 解释： 中心下标是 3 。 左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ，
     * 右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11 ，二者相等。
     * ! 题目描述 示例1里的 nums[3]呢？
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int i = pivotIndex(nums);
        System.out.println(i);
    }
}
