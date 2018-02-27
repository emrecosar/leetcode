public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();

        int[] first, second;
        if (nums1.length >= nums2.length) {
            first = nums1;
            second = nums2;
        } else {
            first = nums2;
            second = nums1;
        }

        for (int i = 0; i < first.length; i++) {
            if (map.containsKey(first[i])) {
                map.put(first[i], map.get(first[i]) + 1);
            } else {
                map.put(first[i], 1);
            }
        }

        for (int i = 0; i < second.length; i++) {
            if (map.get(second[i]) != null && map.get(second[i]) > 0) {
                map.put(second[i], map.get(second[i]) - 1);
                list.add(second[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
