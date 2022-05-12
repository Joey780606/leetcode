package com.example.lib;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q0001TwoSum {
    public static void main(String[] args) {
        System.out.println("TwoSum result");
        int[] result = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        // add the values of the array as keys to the map
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int complement = target - nums[i];
            // The main idea is if num[i] + its completment == target
            if (numMap.containsKey(complement)){
                return new int[] {
                        numMap.get(complement), i
                } ;
            } else {
                numMap.put(nums[i],i);
            }

        }
        // else return empty array
        return new int[] {};
    }
}
