class Solution {
    public int lengthOfLongestSubstring(String s) {

        String substr = "";
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < s.length(); i++) {

            String c = s.substring(i, i+1);
            if(substr.contains(c)) {
                int ix = substr.indexOf(c);
                if(ix + 1 == substr.length())
                    substr = "".concat(c);
                else
                    substr = substr.substring(ix + 1).concat(c);
            } else {
                substr = substr.concat(c);
            }

            count = substr.length();

            if(count > maxCount)
                maxCount = count;
        }
        return maxCount;

    }
}