public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows < 1)
            return result;
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0)
                    row.add(1);
                else if (j == i)
                    row.add(1);
                else {
                    List<Integer> lastRow = result.get(result.size() - 1);
                    row.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}
