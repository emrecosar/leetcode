class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int total = m + n - 1;
        m -= 1;
        n -= 1;
        while(m >= 0 && n >= 0){
            if(nums1[m] >= nums2[n]){
                nums1[total--] = nums1[m--];
            } else {
                nums1[total--] = nums2[n--];
            }
        }
        while(n >= 0){
            nums1[total--] = nums2[n--];
        }
    }
}