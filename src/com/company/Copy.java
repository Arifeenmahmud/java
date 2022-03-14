package com.company;

import java.io.*;

public class Copy {

    public static void main(String[] args) throws IOException {
        // Check command−line parameter usage
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Copy sourceFile targetfile");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0]
                    + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1]
                    + " already exists");
            System.exit(3);
        }

        try (
                // Create an input stream
                BufferedInputStream input
                        = new BufferedInputStream(new FileInputStream(sourceFile));
                // Create an output stream
                BufferedOutputStream output
                        = new BufferedOutputStream(new FileOutputStream(targetFile));) {
            // Continuously read a byte from input and write it to output
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBytesCopied++;
            }

            // Display the file size
            System.out.println(numberOfBytesCopied + " bytes copied");
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

