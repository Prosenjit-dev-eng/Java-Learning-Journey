
import java.io.FileReader;
import java.io.IOException;

public class CodingReader {
    public static void main(String[] args) {
        String filename = "JavaCourse.txt";
        try(FileReader reader = new FileReader(filename))
        {
            int read = 0;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        }
        catch(IOException e){
            System.out.println("Exception occures: "+e.getMessage());
        }
    }
}
