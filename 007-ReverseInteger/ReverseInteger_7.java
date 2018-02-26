public class ReverseInteger {
    public int reverse(int x) {
        int y = 0;
        while (x != 0) {
            int yy = y * 10 + x % 10;
            if ((yy - x % 10) / 10 != y) return 0;
            else y = yy;

            x = x / 10;
        }
        return y;
    }
}
