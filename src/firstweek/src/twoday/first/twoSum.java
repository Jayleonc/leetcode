package twoday.first;

import java.util.HashMap;

/**
 * @author : Jayleonc
 * @date : 2021-11-03 10:56
 */
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 7, 8};
        int target = 9;
        int[] ints = twoSum(nums, target);
    }
}
