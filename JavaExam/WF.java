
public class WF {
    public static void main(String[] args) {
        if(args.length == 0) return;
        String sentence = "";
        for (int i = 0; i < args.length; i++) {
            sentence += args[i] + " ";
        }
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");
        int[] freq = new int[words.length];
        String[] unique = new String[words.length];
        int cnt = 0;
        for (int i = 0; i < args.length; i++) {
            boolean fnd = false;
            for (int j = 0; j < cnt; j++) {
                if (words[i].equals(unique[j])) {
                    freq[j]++;
                    fnd = true;
                    break;

                }
            }
            if(!fnd){
                unique[cnt] = words[i];
                freq[cnt] = 1;
                cnt++;
            }
        }
        for(int i = 0; i < cnt;i++){
            System.out.println(unique[i] + ":" + freq[i]);
        }
    }
}
