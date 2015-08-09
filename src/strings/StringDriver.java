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
        PermutatuonsString ps = new PermutatuonsString();
        ls = ps.permutation("", "ABCD", ls);
        for (String s : ls) {
            System.out.println(s);
        }

        ReverseWords reverseWords = new ReverseWords();
        String s = "This is hello world";
        String revs = reverseWords.reverseWords(s);
        System.out.println(revs);

        String string = "ABCD";
        AllCombinations perm = new AllCombinations(string);
        perm.getAllCombinations(new int[s.length()], 0, string.length() - 1);
        
        
        String n="I am Harsh Harwani";
        String20 string20=new String20();
        System.out.println(string20.replaceString20(n));
        String c="hhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaarrrrrrrrrrrrrrssssssssssshhhhhhhhhhhh";
        StringCompression compression=new StringCompression();
        System.out.println(compression.getCompressesString(c));
        
        

        LongestCommonPrefix lCommonPrefix=new LongestCommonPrefix();
        System.out.println(lCommonPrefix.longestCommonPrefix("HARSH HAR HARSHHHARWA HARSSSH HARRRRRRRRRRRRR"));
    }
}
