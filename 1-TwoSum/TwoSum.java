package com.leetcode.easy;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        java.util.Hashtable<Integer, Integer> table = new java.util.Hashtable<Integer, Integer>();
        java.util.Hashtable<Integer, Integer> index = new java.util.Hashtable<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){

            int minus = target - nums[i];

            if(table.get(minus) != null){
                result[0] = index.get(minus);
                result[1] = i;
                break;
            }

            table.put(nums[i],minus);
            index.put(nums[i], i);

        }

        return result;
    }
}
