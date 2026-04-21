package FunctionalProgramming;
// Convert an array of strings into a stream. Then, use the
// stream to print each string to the console

import java.util.List;

public class Str {
    public static void main(String[] args) {
        List<String> arr = List.of("Prosenjit", "Sayanika");
        arr.stream().forEach(n -> System.out.println(n));
    }
}
