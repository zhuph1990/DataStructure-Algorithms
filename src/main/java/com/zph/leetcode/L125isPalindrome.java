package com.zph.leetcode;


import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.Locale;

public class L125isPalindrome {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2};
        System.out.println(detectCapitalUse("a"));

    }

    public static boolean detectCapitalUse(String s) {
        // 变为小写
        char[] chars = s.toLowerCase().toCharArray();
        String str = "";
        // 过滤字母数字
        for (char ch : chars) {
            if (Character.isLetterOrDigit(ch)) {
                str = str.concat(ch + "");
            }
        }

        int size = str.length();
        if (size == 1) {
            return true;
        }
        boolean isHui = true;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != str.charAt(size - i - 1)) {
                isHui = false;
                break;
            }
        }
        return isHui;
    }

}
