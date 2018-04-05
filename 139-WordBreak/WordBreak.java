public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        for(int i = 1; i <= s.length(); i++){
            if(wordDict.contains(s.substring(0, i))){
                if(i == s.length())
                    return true;
                if(wordBreak(s.substring(i), wordDict))
                    return true;
            }
        }
        return false;
    }
}