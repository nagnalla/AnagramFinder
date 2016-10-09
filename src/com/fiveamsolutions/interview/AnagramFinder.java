package com.fiveamsolutions.interview;

/**
 * Created by nnala on 10/5/16.
 */
public interface AnagramFinder {
    /** Determines if two strings are anagrams. Whitespace is ignored, but all other characters including punctuation count.
     * @param s1 first string to compare
     * @param s2 second string to compare
     * @return true if s1 and s2 are anagrams, false otherwise
     */
     boolean areAnagrams(String s1, String s2);
}