import java.util.*;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("Prosenjit");
        strList.add("Hawlader");
        strList.add(1,"Prabash");
        strList.remove(0);
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        if (strList.contains("Hawlader")) {
           System.out.println(strList.indexOf("Hawlader")); 
        }
    }
}
