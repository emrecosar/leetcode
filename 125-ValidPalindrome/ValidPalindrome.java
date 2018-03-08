public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        boolean odd = false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length() / 2; i++) {
            stack.push(s.charAt(i));
        }
        int init = s.length() / 2;
        if (s.length() % 2 == 1)
            init += 1;
        for (int i = init; i < s.length(); i++) {
            Character c = stack.pop();
            if (s.charAt(i) != c)
                return false;
        }
        return true;
    }
}