package com.zph.leetcode;

import java.util.*;

/**
 * s = "abcabcbb"
 */
public class
L3lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "aa";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (Objects.equals(s, " ") || s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        String strTemp = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                String eachStr = chars[j] + "";
                if (!strTemp.contains(eachStr)) {
                    list.add(strTemp.length());
                    strTemp += eachStr + "";
                } else {
                    strTemp = "";
                    break;
                }


            }
        }
        Collections.sort(list);
        return list.isEmpty() ? 0 : list.get(list.get(list.size() - 1));
    }
}
