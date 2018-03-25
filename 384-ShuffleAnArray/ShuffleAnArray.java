public class ShuffleAnArray {

    private int[] nums;
    private Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffled = this.nums.clone();
        for(int i = 1; i < shuffled.length; i++){
            int pickedOne = random.nextInt(i + 1);
            swap(shuffled, pickedOne, i);
        }
        return shuffled;
    }

    public void swap(int[] shuffled, int pickedOne, int index){
        int tmp = shuffled[pickedOne];
        shuffled[pickedOne] = shuffled[index];
        shuffled[index] = tmp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */