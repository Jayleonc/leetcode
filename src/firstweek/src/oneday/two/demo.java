package oneday.two;

/**
 * @author : Jayleonc
 * @date : 2021-11-02 15:44
 */
public class demo {
    public static int maxSubArray(int[] nums) {
        int i = 0;
        int maxSub = nums[0];
        for (int num : nums) {
            i = Math.max(i + num, num);
            maxSub = Math.max(maxSub, i);
        }
        return maxSub;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, -4, 1, 5, -6, 3, 2, -1,};
        int i = maxSubArray(nums);
        System.out.println(i);
    }
}
