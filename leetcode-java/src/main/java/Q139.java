import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @anthor LingChen
 * @create 8/5/2019 4:48 PM
 * @Description
 */
public class Q139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        return find(s, new HashSet<>(wordDict), 0);
    }

    public boolean find(String s, Set<String> wordDict, int start){
        if (start == s.length()){
            return true;
        }
        for (int end = start+1; end < s.length(); end++) {
            if (wordDict.contains(s.substring(start,end)) && find(s, wordDict, end)){
                return true;
            }
        }
        return false;
    }
}
