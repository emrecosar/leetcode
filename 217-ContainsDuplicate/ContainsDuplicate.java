package com.leetcode.easy;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i]))
                set.add(nums[i]);
            else
                return true;
        }
        return false;
    }
}
