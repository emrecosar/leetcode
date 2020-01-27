class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums == null || nums.length < 3)
            return result;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int bc = 0 - a;

            //now solve it like 2sum
            for (int t = 0; t < nums.length; t++) {
                if (t == i)
                    continue;
                int remainder = bc - nums[t];
                if (set.contains(remainder)) {
                    List<Integer> resultItem = new ArrayList<Integer>();
                    resultItem.addAll(Arrays.asList(a, remainder, nums[t]));
                    Collections.sort(resultItem);
                    if (!result.contains(resultItem))
                        result.add(resultItem);
                } else {
                    set.add(nums[t]);
                }
            }
            set.clear();
        }
        return result;
    }
}