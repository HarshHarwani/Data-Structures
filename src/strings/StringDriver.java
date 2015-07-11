package strings;

import java.util.ArrayList;
import java.util.List;

public class StringDriver {
    public static void main(String[] args) {

        String[] arrr = { "tar", "rat", "atr", "banana" };
        GroupAnagrams ga = new GroupAnagrams();
        List<String> a = ga.Solution(arrr);
        for (String s : a) {
            System.out.println(s);
        }
        
        
        List<String> ls = new ArrayList<String>();
        PermutatuonsString ps=new PermutatuonsString();
        ls=ps.permutation("", "ABCD", ls);
        for(String s:ls){
            System.out.println(s);
        }
        
        
        ReverseWords reverseWords=new ReverseWords();
        String s="This is hello world";
        String revs=reverseWords.reverseWords(s);
        System.out.println(revs);
    }
}
