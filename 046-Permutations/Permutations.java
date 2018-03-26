public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        return permute(nums, 0, nums.length - 1, result);
    }

    public List<List<Integer>> permute(int[] nums, int l, int r, List<List<Integer>> result){

        if(l == r){
            result.add(mergeIntoList(nums));
        }else{
            for(int i = l; i <= r; i++){
                nums = swap(nums, l, i);
                permute(nums, l + 1, r, result);
                nums = swap(nums, l, i);
            }
        }
        return result;
    }

    public int[] swap(int[] nums, int f, int s){
        int tmp = nums[f];
        nums[f] = nums[s];
        nums[s] = tmp;
        return nums;
    }

    public List<Integer> mergeIntoList(int[] nums){
        List<Integer> item = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            item.add(nums[i]);
        }
        return item;
    }

}