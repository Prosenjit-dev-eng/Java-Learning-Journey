import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestingCollection {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-76);
        Collections.sort(numList);
        Utility.print(numList);
        
    }
}