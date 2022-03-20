import java.io.*;
//import java.io.FileWriter;   // Import the FileWriter class
//import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileWriter myWriter = new FileWriter("D:\\filename.txt");
            myWriter.write("This is Ok Now Files in Java might be tricky, but it is fun enough! ");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        File file = new File("D:\\filename.txt");
//        System.out.println(file.exists());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        try {
            while ((st = br.readLine()) != null) {
                System.out.println(st);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}