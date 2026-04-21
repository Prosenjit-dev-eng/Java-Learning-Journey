
import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> col) {
        for (Object c : col) {
            System.out.printf("%s ",c);
        }
    }
}
