package com.example.lib;

public class Q0004MedianTwoArray {
    public static void main(String[] args) {    //注意,若沒有設為static,就無法直接執行 main
        System.out.println("Median of Two sorted arrays result");
        System.out.println("Median Two Sorted Arrays result: " + findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println("Median Two Sorted Arrays result: " + findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = ((nums1.length + nums2.length) / 2) + 1;

        int i = 0,j = 0;
        int[] arr = new int[length];
        for(int k=0; k<length; k++){

            int a = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int b = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;


            arr[k] = Math.min(a, b);
            if(a < b){
                i++;
            }else {
                j++;
            }
        }

        if((nums1.length + nums2.length) % 2 == 0){

            return (arr[arr.length-1] + arr[arr.length - 2]) / 2d;
        }else {
            return arr[arr.length - 1];
        }
    }
}
