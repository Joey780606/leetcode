package com.example.lib;

public class Q0006ZigzagConversion {
    public static void main(String[] args) {    //注意,若沒有設為static,就無法直接執行 main
        System.out.println("Zigzag convert result");
        System.out.println("Zigzag convert string (PAYPALISHIRING, 3): " + convert("PAYPALISHIRING", 3));
        System.out.println("Zigzag convert string (PAYPALISHIRING, 4): " + convert("PAYPALISHIRING", 4));
        System.out.println("Zigzag convert string (A, 1): " + convert("A", 1));
    }

    public static String convert(String s, int numRows) {
        if(numRows  ==  1)
            return s;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i < numRows ; i++){
            sb[i] = new StringBuffer();
        }
        int j = 0;
        int dir = -1;
        for(int i = 0 ; i < s.length();i++){
            if(j == 0 || j == numRows - 1){
                dir *= -1;
            }
            sb[j].append(s.charAt(i));
            j += dir;
        }
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < numRows; i++){
            result.append(sb[i].toString());
        }
        return result.toString();
    }
}
