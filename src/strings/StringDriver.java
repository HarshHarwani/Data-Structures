package strings;

import java.util.List;

public class StringDriver {
    public static void main(String[] args) {

        String[] arrr = { "tar", "rat", "atr", "banana" };
        GroupAnagrams ga = new GroupAnagrams();
        List<String> a = ga.Solution(arrr);
        for (String s : a) {
            System.out.println(s);
        }
    }
}
