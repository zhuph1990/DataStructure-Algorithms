package com.zph.leetcode;


public class L8MyAtoi {
    public static void main(String[] args) {
        String s = "-+1";
        System.out.println(myAtoi(s));

    }

    public static int myAtoi(String s) {

        while (s.startsWith(" ")) {
            s = s.replaceFirst(" ", "");
        }
        boolean isFu = false;
        if (s.startsWith("-")) {
            isFu = true;
            s = s.replaceFirst("-", "");
        } else if (s.startsWith("+")) {
            s = s.replaceFirst("\\+", "");
        }
        long reValue;

        if (s.length() > 0 && checkIsNum(s.charAt(0))) {
            for (int i = 0; i < s.toCharArray().length; i++) {
                if (!checkIsNum(s.charAt(i))) {
                    s = s.substring(0, i);
                }
            }
            reValue = isFu ? -Long.parseLong(s) : Long.parseLong(s);
            if (reValue < Integer.MIN_VALUE) {
                reValue = Integer.MIN_VALUE;
            }
            if (reValue > Integer.MAX_VALUE) {
                reValue = Integer.MAX_VALUE;
            }
            return (int) reValue;
        }
        return 0;
    }

    public static boolean checkIsNum(char ch) {
        int i = ch;
        return i >= 48 && i <= 57;

    }
}
