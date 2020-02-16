class Solution {

    List<String> result;

    public List<String> restoreIpAddresses(String s) {

        result = new ArrayList<String>();

        if (s == null || s.length() < 4)
            return result;

        backtracking(s.substring(0, 1), s, 1);

        return result;
    }

    public void backtracking(String prefix, String s, int index) {

        if (!isValid(prefix))
            return;

        if (s.length() == index && isValidFull(prefix)) {
            result.add(prefix);
            return;
        }

        if (s.length() <= index) {
            return;
        }

        backtracking(prefix + s.substring(index, index + 1), s, index + 1);
        if (prefix.chars().filter(ch -> ch == '.').count() < 3 && prefix.charAt(prefix.length() - 1) != '.')
            backtracking(prefix + ".", s, index);
    }

    public boolean isValid(String s) {
        if (!s.contains(".")) {
            if (Integer.valueOf(s) > 255 || Integer.valueOf(s) < 0)
                return false;
        } else {
            return octetsValid(s);
        }
        return true;
    }

    public boolean isValidFull(String s) {
        if (s.split("\\.").length != 4)
            return false;
        return octetsValid(s);
    }

    public boolean octetsValid(String s) {
        String[] octets = s.split("\\.");
        for (int i = 0; i < octets.length; i++) {
            String octet = octets[i];
            if (octet.isEmpty())
                return false;
            int val = Integer.valueOf(octet);
            if (octet.length() == 1) {
                if (val < 0 || val >= 10)
                    return false;
            } else if (octet.length() == 2) {
                if (val < 10 || val >= 100)
                    return false;
            } else if (octet.length() == 3) {
                if (val < 100 || val > 255)
                    return false;
            } else
                return false;
        }
        return true;
    }

}