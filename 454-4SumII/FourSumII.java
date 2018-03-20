public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int resultCount = 0;
        for (int k = 0; k < C.length; k++) {
            for (int l = 0; l < D.length; l++) {
                resultCount += map.getOrDefault(-1 * (C[k] + D[l]), 0);
            }
        }

        return resultCount;
    }

}