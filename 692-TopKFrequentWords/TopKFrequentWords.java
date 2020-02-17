class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            String c = words[i];
            if (!map.containsKey(c))
                map.put(c, 1);
            else {
                map.put(c, map.get(c) + 1);
            }
        }

        List<FrequentWord> list = new ArrayList<FrequentWord>();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            list.add(new FrequentWord(next.getKey(), next.getValue()));
        }


        Collections.sort(list, (a, b) -> {
            if (a.count < b.count)
                return 1;
            else if (a.count > b.count)
                return -1;
            else
                return a.word.compareToIgnoreCase(b.word);
        });

        List<String> result = new ArrayList<String>();

        for (int i = 0; i < k; i++)
            result.add(list.get(i).word);

        return result;

    }

    public class FrequentWord {
        String word;
        int count;

        public FrequentWord(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

}