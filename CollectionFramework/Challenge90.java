import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Challenge90 {
    public static void SortDesc(List<String> str) {
        Collections.sort(str, new java.util.Comparator<String>() {
           @Override
           public int compare(String s, String t){
                if (s.equals(t)) {
                    return 0;
                }
                else if (s.charAt(0) < t.charAt(0)) {
                    return 1;
                }
                else return -1;
           }

        });
    }
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("Umrelaa", "Nun", "zitman"));
        SortDesc(str);
        for (String s : str) {
            System.out.println(s);
        }
        int cnt = Collections.frequency(str, "zitman");
        System.out.println(cnt);
    }
}
