public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {

        String init = "(";

        return getList(init, n - 1, n);
    }

    public List<String> getList(String s, int o, int c) {

        if (o > c) {
            return new ArrayList<String>();
        }

        if (o == 0 && c == 1) {
            s += ")";
            return Arrays.asList(s);
        }

        List<String> result = new ArrayList<String>();
        if (o > 0)
            result.addAll(getList(s + "(", o - 1, c));
        if (c > 1)
            result.addAll(getList(s + ")", o, c - 1));

        return result;

    }
}