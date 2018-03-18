public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] bucket = new List[size + 1];
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if(bucket[frequency] == null)
                bucket[frequency] = new ArrayList<Integer>();
            bucket[frequency].add(key);
        }

        List<Integer> result = new ArrayList<Integer>(k);
        for (int i = bucket.length - 1; i >= 0 && result.size() <= k; i--) {
            if (bucket[i] != null)
                result.addAll(bucket[i]);
        }

        return result.subList(0, k);
    }
}