public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;

        int initialStatus = 1;

        for (int i = s.length() - 1; i >= 0; i--) {

            char c = s.charAt(i);

            int status;

            int decimal = 0;
            switch (c) {
                case 'M':
                    decimal = 1000;
                    status = 7;
                    break;
                case 'D':
                    decimal = 500;
                    status = 6;
                    break;
                case 'C':
                    decimal = 100;
                    status = 5;
                    break;
                case 'L':
                    decimal = 50;
                    status = 4;
                    break;
                case 'X':
                    decimal = 10;
                    status = 3;
                    break;
                case 'V':
                    decimal = 5;
                    status = 2;
                    break;
                default: // I
                    decimal = 1;
                    status = 1;
                    break;
            }

            if (initialStatus > status)
                decimal = decimal * -1;

            result += decimal;

            initialStatus = status;

        }

        return result;
    }
}
