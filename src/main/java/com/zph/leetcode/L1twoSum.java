package com.zph.leetcode;

import java.util.Arrays;

public class L1twoSum {
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;
        int[] indexArr= twoSum(nums,target);
        System.out.println(Arrays.toString(indexArr));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexArr[0] = i;
                    indexArr[1] = j;
                    break;
                }
            }
        }
        return indexArr;
    }
}
