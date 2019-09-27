package org.os.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers named "nums" and a target value named "target",
 * find the two integers that sum to the target value in the array and return
 * their array indexes.
 *
 * Given： nums[2, 4, 8, 12]
 * Target: 10
 * Return: [0] & [2]
 */
public class Q00001 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            int cur = nums[i];
            res[0] = i;
            int sec = target - cur;
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] == sec) {
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
