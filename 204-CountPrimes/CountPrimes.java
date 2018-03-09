public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3)
            return 0;
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        for (int i = 3; i < n; i++) {
            boolean status = true;
            for (int j = 0; j < primes.size(); j++) {
                int current = primes.get(j);
                if (i % current == 0) {
                    status = false;
                    break;
                }
            }
            if (status)
                primes.add(i);
        }

        return primes.size();

    }
}