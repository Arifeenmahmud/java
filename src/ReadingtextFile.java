import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingtextFile {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\file.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();


            while (line != null) {
                sb.append(line);
                //sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(sb);
            }
           // String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
