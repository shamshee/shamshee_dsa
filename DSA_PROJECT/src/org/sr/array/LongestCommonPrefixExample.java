package org.sr.array;

public class LongestCommonPrefixExample {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first word as the prefix
        String prefix = strs[0];

        // Compare prefix with each string
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce prefix until it matches
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words1 = {"flower", "flow", "flight"};
        String[] words2 = {"dog", "racecar", "car"};

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(words1)); // "fl"
   //     System.out.println("Longest Common Prefix: " + longestCommonPrefix(words2)); // ""
    }
}
