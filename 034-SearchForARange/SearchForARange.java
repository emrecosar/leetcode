public class SearchForARange {

    static int min;
    static int max;

    public int[] searchRange(int[] nums, int target) {

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        searchRange(nums, target, 0, nums.length - 1);
        int[] result = new int[2];
        result[0] = min == Integer.MAX_VALUE ? -1 : min;
        result[1] = max == Integer.MIN_VALUE ? -1 : max;
        return result;
    }

    public void searchRange(int[] nums, int target, int start, int end) {

        if (start > end) {
            return;
        }
        if (start == end) {
            if (nums[start] == target) {
                if (start <= min)
                    min = start;
                if (end >= max)
                    max = start;
            }
        } else if (nums[start] <= target && nums[end] >= target) {
            int mid = start + (end - start) / 2;
            searchRange(nums, target, start, mid);
            searchRange(nums, target, mid + 1, end);
        }
        return;
    }

}