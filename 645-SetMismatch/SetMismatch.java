class Solution {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length;
        int total = (size * (size + 1)) / 2;

        HashSet<Integer> set = new HashSet<Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                total -= nums[i];
            } else {
                result[0] = nums[i];
            }
        }
        result[1] = total;
        return result;
    }
}

