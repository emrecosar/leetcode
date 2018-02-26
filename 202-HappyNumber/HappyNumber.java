public class HappyNumber {
    public boolean isHappy(int n) {

        boolean result = true;
        HashSet<Integer> set = new HashSet<Integer>();
        int newN = 0;
        while (n != 1) {
            if (set.contains(n)) {
                result = false;
                break;
            } else {
                set.add(n);
            }
            while (n != 0) {
                newN += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = newN;
            newN = 0;
        }
        return result;
    }
}
