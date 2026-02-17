/* Write a class that implements the CharSequence interface found in the java.lang package. So, it would contain the following methods. (i) char charAt(int index) (ii) int length() (iii) CharSequence subSequence(int start, int end) (iv) Override toString() Your implementation should return the string backwards. Select one of the sentences from the lecture slide to use as the data. Write a small main method to test your class; make sure to call all four methods.  */
class ReverseCharSequence implements CharSequence {

    private String data;

    // Constructor
    public ReverseCharSequence(String data) {
        this.data = data;
    }

    // (i) Return character at index (from reversed string)
    @Override
    public char charAt(int index) {
        if (index < 0 || index >= data.length()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return data.charAt(data.length() - 1 - index);
    }

    // (ii) Return length
    @Override
    public int length() {
        return data.length();
    }

    // (iii) Return subsequence (from reversed string)
    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid start or end");
        }

        StringBuilder reversed = new StringBuilder(data).reverse();
        return reversed.substring(start, end);
    }

    // (iv) Override toString() to return reversed string
    @Override
    public String toString() {
        return new StringBuilder(data).reverse().toString();
    }
}


// Main class to test
public class TestReverseCharSequence {

    public static void main(String[] args) {

        String sentence = "Object Oriented Programming in Java";

        ReverseCharSequence rcs = new ReverseCharSequence(sentence);

        // Call length()
        System.out.println("Length: " + rcs.length());

        // Call charAt()
        System.out.println("Character at index 0 (reversed): " + rcs.charAt(0));
        System.out.println("Character at index 5 (reversed): " + rcs.charAt(5));

        // Call subSequence()
        CharSequence sub = rcs.subSequence(0, 6);
        System.out.println("SubSequence (0,6): " + sub);

        // Call toString()
        System.out.println("Reversed String: " + rcs.toString());
    }
}

