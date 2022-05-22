package com.example.lib;

/*
  Longest Palindromic Substring: 在一個字串中尋找一個最長的連續的回文的子串，例如「banana」最長回文子串是「anana」。
 */
public class Q0005LongPalindromic {
    public static void main(String[] args) {    //注意,若沒有設為static,就無法直接執行 main
        System.out.println("Longest palindromic substring result");
        System.out.println("Longest palindromic substring banana: " + longestPalindrome("banana"));
        System.out.println("Longest palindromic substring babad: " + longestPalindrome("babad"));
        System.out.println("Longest palindromic substring cbbd: " + longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        String result = "";
        int max = result.length();
        for(int i = 0; i < s.length(); i++){
            String str = getPalindromeString( s,  i,  i);
            if(result.length() < str.length()){
                result = str;
            }
        }

        for(int i = 0; i < s.length(); i++){
            String str = getPalindromeString( s,  i,  i+1);
            if(result.length() < str.length()){
                result = str;
            }
        }
        return result;
    }

    public static String getPalindromeString(String s, int i, int j){
        while(i >=0 && j < s.length()){
            if(s.charAt(i) != s.charAt(j)){
                break;
            }
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }
}
