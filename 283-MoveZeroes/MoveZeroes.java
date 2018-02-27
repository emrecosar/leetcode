public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int[] result = new int[nums.length];
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, zeroIndex);
                zeroIndex++;
            }
        }

    }

    public void swap(int[] nums, int currentIndex, int zeroIndex) {
        int temp = nums[currentIndex];
        nums[currentIndex] = nums[zeroIndex];
        nums[zeroIndex] = temp;
    }
}
