public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i) - 'a')) {
                map.put(s.charAt(i) - 'a', map.get(s.charAt(i) - 'a') + 1);
            } else {
                map.put(s.charAt(i) - 'a', 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i) - 'a') == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

}
