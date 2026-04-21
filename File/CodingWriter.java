import java.io.FileWriter;
import java.io.IOException;

public class CodingWriter {
    public static void main(String[] args) {
        String filename = "JavaCourse.txt";
        // try with resource
        try(FileWriter writer = new FileWriter(filename)){
            
            writer.write("This is java course");
            writer.flush();
            System.out.println("File written successfully");
        }
        catch(IOException exception){
            System.out.println("Exception ocurred: "+exception.getMessage() );
        }
        // finally{
        //     if(writer != null) writer.close();
        // }
    }   
}
