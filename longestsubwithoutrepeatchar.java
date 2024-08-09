/**
 * Problem 3: Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 */

class Solution {

/**

Checks the validity of a substring (no repeating characters)

 */
    private boolean checkValid(String sub) {
        int i, j;

        for (i=0; i < sub.length(); i++) {
            for (j=i+1; j < sub.length(); j++) {
                if (sub.charAt(i) == sub.charAt(j)) return false;
            }
        }

        return true;
    }

    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int i, j;
        
        // base cases
        if (s.length() == 1) return 1;
        else if (this.checkValid(s)) return s.length();

        for (i=0; i <= s.length(); i++) {
            for (j=i+1; j <= s.length(); j++) {
                    if (this.checkValid(s.substring(i, j))) length = (s.substring(i, j).length() > length ? s.substring(i, j).length() : length);
                    
            }
        }

    return length;
        
    }
}