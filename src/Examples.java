import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Examples {

    public static void main (String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("newFile.txt");

            if(!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println("Everything is working");
            pw.close();
            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.print(line);
            }

        } catch(IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            } catch(IOException e) {
                System.out.println("Error:" +e);
            }
        }
    }
}