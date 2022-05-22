package com.example.lib;

import java.util.HashSet;
import java.util.Set;

public class Q0003LongestString {
    public static void main(String[] args) {    //注意,若沒有設為static,就無法直接執行 main
        System.out.println("TwoSum result");
        System.out.println("abcabcbb LongestString result: " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("bbbbb LongestString result: " + lengthOfLongestSubstring("bbbbb"));
        System.out.println("pwwkew LongestString result: " + lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }

        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> charSet = new HashSet<>();

        while(i<s.length()){
            char c = s.charAt(i);
            while(charSet.contains(c)){
                charSet.remove(s.charAt(j));
                j++;
            }

            charSet.add(c);
            max = Math.max(max,i-j+1);
            i++;
        }
        return max;
    }
}
