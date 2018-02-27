public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            String current = String.valueOf(i);
            if (i % 15 == 0)
                current = "FizzBuzz";
            else if (i % 3 == 0)
                current = "Fizz";
            else if (i % 5 == 0)
                current = "Buzz";

            result.add(current);
        }

        return result;
    }
}
