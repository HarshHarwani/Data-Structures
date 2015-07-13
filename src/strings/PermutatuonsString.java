package strings;
import java.util.List;
public class PermutatuonsString {

    public  List<String> permutation(String prefix, String str, List<String> ls) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
            ls.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i),str.substring(0, i)+str.substring(i + 1), ls);
        }
        return ls;
    }
}
