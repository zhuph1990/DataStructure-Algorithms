package com.zph.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class L9IsPalindrome {
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String str) {
        return Objects.equals(new StringBuffer(str + "").reverse().toString(), str);
    }
}
