public class MissingNumber {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int total = size * (size + 1) / 2;

        for (int i = 0; i < size; i++)
            total -= nums[i];

        return total;
    }
}
