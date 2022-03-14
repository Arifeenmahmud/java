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
