package Leetcode.Easy;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum/description/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solutions");
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 9, 1};
        int target = 6;

        int[] result = twoSum(nums, target);
        System.out.println("Result: " + result[0] + result[1]);

    }
}
