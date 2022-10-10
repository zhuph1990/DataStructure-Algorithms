package com.zph.leetcode;


public class L520detectCapitalUse {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2};
        System.out.println(detectCapitalUse("FlaG"));

    }

    public static boolean detectCapitalUse(String word) {

        char[] chars = word.toCharArray();
        boolean isUpper1 = true;
        boolean isUpper2 = true;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                isUpper1 = false;
            }
            if (i > 0) {
                if (Character.isUpperCase(chars[i])) {
                    isUpper2 = false;
                }
            }
        }
        return isUpper1 || isUpper2;
    }

}
