public class Solution {
    public String longestPalindrome(String s) {
        String longest_pal = new String();
        if (s.length()>0) {
            longest_pal = s.substring(0,1);
        }

        for (int i = 0; i<s.length(); i++) {

            String found_pal = odd_palindrome(s, i);
            if (found_pal.length() > longest_pal.length()) {
                longest_pal = found_pal;
                //System.out.println("odd='" + longest_pal + "'");
            }
            found_pal = even_palindrome(s, i);
            if (found_pal.length() > longest_pal.length()) {
                longest_pal = found_pal;
                //System.out.println("even='" + longest_pal + "'");
            }

        }
        //System.out.println("longest='" + longest_pal + "'");
        //System.out.println("Result=" + longest_pal);
        return longest_pal;

    }

    // Returns palindrome string with odd (acbca) palindromes
    // i is index, we look left and right from it
    static String odd_palindrome(String source, int i) {
        int len = 0; // no palindrome found

        for (int offset = 1; i-offset>=0 && i+offset < source.length();offset++) { // protect from out-of-range
            if (source.charAt(i-offset) == source.charAt(i+offset)) {
                len++;
            } else {
                break;
            }
        }
        if (len > 0) {
            return source.substring(i-len, i+len+1);
        }
        return "";
    }

    // For simpliciy, separate function to return even (acbbca) palindromes
    static String even_palindrome(String source, int i) {
        int len = 0; // no palindrome found
        // First check, symbol on the right must be same
        if (i+1 < source.length() && source.charAt(i) == source.charAt(i+1)) {
            len++;
        } else {
            return "";
        }

        // Note that we look -1 at the left and +2 to the right
        for (int offset=1; i-offset>=0 && i+offset+1 < source.length(); offset++) { // protect from out-of-range
            if (source.charAt(i-offset) == source.charAt(i+offset+1)) {
                len++;
            } else {
                break;
            }
        }
        if (len > 0) {
            return source.substring(i-len+1, i+len+1);
        }
        return "";
    }
}
