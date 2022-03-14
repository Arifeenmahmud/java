package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try  (FileOutputStream f = new FileOutputStream("d:\\temp.dat");
              DataOutputStream output = new DataOutputStream(f);) {

            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }
        try(DataInputStream input =new DataInputStream(new FileInputStream("d:\\temp.dat"));){
            // Read student test scores from the fil
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }catch (Exception e) {
        }
    }
}
 /*
    *
C:\Users\Arifeen\Desktop>cd..

C:\Users\Arifeen>cd..

C:\Users>cd..

C:\>D:

D:\>path=C:\Program Files\Java\jdk1.8.0_111\bin

D:\>javac Copy.java

D:\>java Copy D:\\abc.dat D:\\xyz.dat
21 bytes copied

D:\>
    * */
