package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3};
        String[] names = {"John", "Jane", "Mary"};
        String[] addresses = {"123 Main St.", "456 Main St.", "789 Main St."};
        String[] cities = {"New York", "New York", "New York"};
        String[] states = {"NY", "NY", "NY"};
        String[] zipCodes = {"10001", "10001", "10001"};
        String[] phoneNumbers = {"123-456-7890", "123-456-7890", "123-456-7890"};
        try (  ObjectOutputStream output = new ObjectOutputStream(new  FileOutputStream("d:\\array.dat", true));) {
            output.writeObject(numbers);
            output.writeObject(names);
            output.writeObject(addresses);
            output.writeObject(cities);
            output.writeObject(states);
            output.writeObject(zipCodes);
            output.writeObject(phoneNumbers);
        }
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("d:\\array.dat"))) {
            int[] numbers2 = (int[]) input.readObject();
            String[] names2 = (String[]) input.readObject();
            String[] addresses2 = (String[]) input.readObject();
            String[] cities2 = (String[]) input.readObject();
            String[] states2 = (String[]) input.readObject();
            String[] zipCodes2 = (String[]) input.readObject();
            String[] phoneNumbers2 = (String[]) input.readObject();
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers2[i] + " " + names2[i] + " " + addresses2[i] + " " + cities2[i] + " " + states2[i] + " " + zipCodes2[i] + " " + phoneNumbers2[i]);

            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error reading file");
        }
    }
}
