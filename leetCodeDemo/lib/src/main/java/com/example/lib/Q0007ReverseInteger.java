package com.example.lib;

public class Q0007ReverseInteger {
    public static void main(String[] args) {    //注意,若沒有設為static,就無法直接執行 main
        System.out.println("Reverse integer result");
        System.out.println("Reverse integer x = 123: " + reverse(123));
        System.out.println("Reverse integer x = -123: " + reverse(-123));
        System.out.println("Reverse integer x = 120: " + reverse(120));
    }

    public static int reverse(int x) {
        if(x<0) return -1*reverseVar(x*-1);
        return reverseVar(x);
    }

    private static int reverseVar(int n){
        int base = 1; long result = 0;
        while(n!=0){
            result = (result*base) + (n%10);
            n/=10;
            base = 10;
        }
        long temp = 2147483647;
        if(result < (-1*temp) || result >= temp) return 0;
        int res = (int)result;
        return res;
    }
}
