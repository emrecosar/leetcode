public class ReverseString {
    public String reverseString(String s) {
        Stack st = new Stack();
        for (int i = 0; i < s.length(); i++)
            st.push(s.charAt(i));

        StringBuilder sb = new StringBuilder(s.length());
        while (!st.empty())
            sb.append(st.pop());

        return sb.toString();
    }
}
