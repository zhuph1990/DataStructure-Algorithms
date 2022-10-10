package com.zph.leetcode;



public class L645findErrorNums {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2};
        System.out.println(nums.toString());

    }

    public static int[] findErrorNums(int[] nums) {
        int[] resultArr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[0] == 2){
                resultArr[0] = 2;
                resultArr[1] = 1;
            }

            if (i + 1 == nums.length) {
                break;
            }
            if ((nums[i] == nums[i + 1]) ) {
                resultArr[0] = nums[i];
                resultArr[1] = nums[i]+1;
            }
        }
        return resultArr;

    }
}
