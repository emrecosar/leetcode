class Solution {
    public int myAtoi(String str) {

        if (str == null || str.length() == 0)
            return 0;

        // trim spaces in the beginning.
        // do not rely on str.trim();
        int mark = 1;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') i++;

        if (i >= str.length())
            return 0;

        Character next = str.charAt(i);
        if (next != '-' && next != '+' && !Character.isDigit(next))
            return 0;

        if (next == '-') {
            mark = -1;
            i++;
        } else if (next == '+') {
            mark = 1;
            i++;
        }

        String r = "";
        for (int j = i; j < str.length(); j++) {
            Character c = str.charAt(j);
            if (Character.isDigit(c))
                r = r.concat(c.toString());
            else
                break;
        }

        if(r.isEmpty())
            return 0;

        Long sum = 0L;
        for (int k = 0; k < r.length(); k++) {
            Character c = r.charAt(k);
            sum = 10*sum + Long.valueOf(c.toString());
            if (sum < 0 || sum > Integer.MAX_VALUE) {
                sum = Long.MAX_VALUE;
                break;
            }
        }

        sum *= mark;

        int result = 0;
        if (sum > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        else if (sum < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;
        else
            result = sum.intValue();
        return result;
    }
}