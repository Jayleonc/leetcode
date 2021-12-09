package oneday.first;

/**
 * @author : Jayleonc
 * @date : 2021-11-02 14:37
 * 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
 */
public class demo {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 9, 8, 1, 4};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }
}
