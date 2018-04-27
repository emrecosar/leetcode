public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] status = new boolean[s.length() + 1];
        status[0] = true;


        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(status[j] && wordDict.contains(s.substring(j,i))){
                    status[i] = true;
                    break;
                }
            }
        }

        return status[s.length()];

    }
}