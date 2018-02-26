public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int number = s.charAt(i) - 'A' + 1;
            result += number * Math.pow(26, s.length() - i - 1);
        }

        return result;

    }
}
