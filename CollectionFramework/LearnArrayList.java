import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        // ArrayList<String> studentsname = new ArrayList<>();
        // studentsname.add("Rakesh");
        // n->n++n/2+1
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(1,50);
        System.out.println(list);
        List<Integer> newlist = new ArrayList<>();
        newlist.add(150);
        newlist.add(160);

        list.addAll(newlist);
        System.out.println(list);

        System.out.println(list.get(1));
        

    }
}

