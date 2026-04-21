public class Challenge89 {
    public static String con(String ...elements){
        String s = "";
        for (String e : elements) {
            s += e;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("After concatenation: "+con("Rohit "," Gurunath"," Sharma"));
    }
}
