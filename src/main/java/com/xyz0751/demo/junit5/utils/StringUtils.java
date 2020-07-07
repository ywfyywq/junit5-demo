package com.xyz0751.demo.junit5.utils;

/**
 * 字符串工具类
 *
 * @author YY
 */
public class StringUtils {
    /**
     * 判断回文字符串
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("字符串为空");
        }
        int mid = (str.length() - 1) / 2;
        for (int i = 0; i <= mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;

    }

    /**
     * 计算回文字符的最大子串的长度
     *
     * @param str
     * @return
     */
    public static int longestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("字符串为空");
        }
        int max = 0, current = 0, length = str.length();
        //循环每个字符为回文的中点
        for (int i = 0; i < length; ++i) {

            for (int j = 0; i - j >= 0 && i + j < length; j++) {
                if (str.charAt(i - j) != str.charAt(i + j)) {
                    break;
                }
                current = j * 2 + 1;
            }
            if (current > max) {
                max = current;
            }

            current = 0;

            for (int j = 0; (i - j >= 0) && (i + j + 1 < length); j++) {
                if (str.charAt(i - j) != str.charAt(i + j + 1)) {
                    break;
                }
                current = j * 2 + 2;
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
