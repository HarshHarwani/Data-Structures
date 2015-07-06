package strings;

//Given an array of strings, return all groups of strings that are anagrams.
//Note: All inputs will be in lower-case.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.Map.Entry;

public class GroupAnagrams {

    public List<String> Solution(String[] s) {
        ArrayList<String> result = new ArrayList<String>();
        Map<String, List<String>> anagramGroup = new HashMap<String, List<String>>();
        for (int i = 0; i < s.length; i++) {
            char[] temp = s[i].toCharArray();
            Arrays.sort(temp);
            String sortedWord = String.valueOf(temp);
            if (anagramGroup.containsKey(sortedWord)) {
                anagramGroup.get(sortedWord).add(s[i]);
            } else {
                List<String> ls = new ArrayList<String>();
                ls.add(s[i]);
                anagramGroup.put(sortedWord, ls);
            }
        }
        Iterator<Entry<String, List<String>>> itr = anagramGroup.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, List<String>> entry = itr.next();
            List<String> temp = entry.getValue();
            if (temp.size() > 1) {
                result.addAll(temp);
            }
        }
        return result;

    }

}
