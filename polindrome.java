package com.company;

public class polindrome {

    public int isPalindrome(String A) {
        int start = 0;
        int end = A.length() - 1;
        while (start < end) {
            if (isAlphaNum(A.charAt(start))== 0) {
                start++;
            } else if (isAlphaNum(A.charAt(end))==0) {
                end--;
            } else {
                if (Character.toLowerCase(A.charAt(start++)) != Character.toLowerCase(A.charAt(end--))) {
                    return 0;
                }
            }
        }
        return 1;
    }

    private int isAlphaNum(char ch) {
        if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return 1;
        }
        return 0;
    }
}
