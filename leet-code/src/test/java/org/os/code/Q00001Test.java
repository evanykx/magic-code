package org.os.code;

import org.junit.Test;

public class Q00001Test {

    @Test
    public void testTwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        long startTime = System.nanoTime();
        int[] res = Q00001.twoSum(nums, target);
        long endTime = System.nanoTime();
        System.out.println("Costs: " + (endTime - startTime) + "ns");
        System.out.println("Result: " + nums[res[0]] + " + " + nums[res[1]] + " = " + target);
        System.out.println("Index: [" + res[0] + "], [" + res[1] + "]");
    }
}
