class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<String>();

        for (int i = digits.length() - 1; i >= 0; i--) {

            String c = digits.substring(i, i + 1);
            List<String> cList = digitToString(c);
            if (result.isEmpty())
                result.addAll(cList);
            else {
                List<String> clonedResult = new ArrayList<String>(result);
                for (int j = 0; j < cList.size() - 1; j++) {
                    result.addAll(new ArrayList<String>(clonedResult));
                }
                for (int j = 0; j < result.size(); j++) {
                    String appender = cList.get(j / clonedResult.size());
                    result.set(j, appender + result.get(j));
                }
            }
        }
        return result;
    }

    public List<String> digitToString(String d) {
        if (d.equals("2"))
            return List.of("a", "b", "c");
        else if (d.equals("3"))
            return List.of("d", "e", "f");
        else if (d.equals("4"))
            return List.of("g", "h", "i");
        else if (d.equals("5"))
            return List.of("j", "k", "l");
        else if (d.equals("6"))
            return List.of("m", "n", "o");
        else if (d.equals("7"))
            return List.of("p", "q", "r", "s");
        else if (d.equals("8"))
            return List.of("t", "u", "v");
        else if (d.equals("9"))
            return List.of("w", "x", "y", "z");
        return null;
    }
}